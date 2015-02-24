package main.testmca.items;

import java.util.List;
import main.testmca.Colors;
import main.testmca.entities.EntityGrenade;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrenade extends Item
{
	public ItemGrenade()
	{
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("grenade");
		maxStackSize = 1;
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean stuff)
	{
		NBTTagCompound nbt = stack.stackTagCompound;
		if (nbt != null && nbt.getInteger("Size") > 0 && nbt.getInteger("Fuse") > 0)
		{
			list.add("Bomb Size: " + nbt.getInteger("Size"));
			list.add("Bomb Fuse: " + nbt.getInteger("Fuse"));
			list.add("Bomb Speed: " + nbt.getFloat("Speed") * 10);
			list.add("Bounce Factor: " + nbt.getFloat("Bounce Factor") * 100);
		}
		else
		{
			list.add("Bomb Size: " + Colors.RED + "NOT SET!" + Colors.RESET);
			list.add("Bomb Fuse: " + Colors.RED + "NOT SET!" + Colors.RESET);
			list.add("Bomb Speed: " + Colors.RED + "NOT SET!" + Colors.RESET);
			list.add("Bounce Factor: " + Colors.RED + "NOT SET!" + Colors.RESET);
		}
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list)
	{
		for (int i = 1; i < 7; ++i)
		{
			ItemStack a = new ItemStack(this, 1, 0);
			a.stackTagCompound = new NBTTagCompound();
			a.stackTagCompound.setInteger("Size", i);
			a.stackTagCompound.setInteger("Fuse", i * 25);
			a.stackTagCompound.setFloat("Bounce Factor", 0.1F + i * 0.1F);
			a.stackTagCompound.setFloat("Speed", 0.5F + i * 0.2F);
			list.add(a);
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		stack.stackSize--;
		if (!world.isRemote)
		{
			int fuse = stack.stackTagCompound == null ? 25 : stack.stackTagCompound.getInteger("Fuse");
			int size = stack.stackTagCompound == null ? 1 : stack.stackTagCompound.getInteger("Size");
			float bounceFactor = stack.stackTagCompound == null ? 0.1F : stack.stackTagCompound.getFloat("Bounce Factor");
			float speed = stack.stackTagCompound == null ? 0.5F : stack.stackTagCompound.getFloat("Speed");
			world.spawnEntityInWorld(new EntityGrenade(world, fuse, size, bounceFactor, speed, player));
		}

		return stack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
	}
}
