package main.testmca;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class RecipeGrenades implements IRecipe
{
	private ItemStack stack = new ItemStack(TestMCA.MCAItems.grenade, 1, 0);

	@Override
	public boolean matches(InventoryCrafting inv, World world)
	{
		float bounceFactor = 0.1F;
		int fuseLength = 0;
		int size = 0;
		float speed = 0.5F;
		for (int i = 0; i < inv.getSizeInventory(); ++i)
		{
			ItemStack itemstack = inv.getStackInSlot(i);

			if (itemstack != null)
			{
				Item item = itemstack.getItem();
				if (item == Items.string)
				{
					fuseLength += 25;
				}
				else if (item == Item.getItemFromBlock(Blocks.wool))
				{
					fuseLength += 100;
				}
				else if (item == Items.sugar)
				{
					speed += 0.2F;
				}
				else if (item == Items.reeds)
				{
					speed += 0.4F;
				}
				else if (item == Items.clay_ball)
				{
					bounceFactor += 0.1F;
					bounceFactor = bounceFactor > 1 ? 1 : bounceFactor;
				}
				else if (item == Item.getItemFromBlock(Blocks.clay))
				{
					bounceFactor += 0.4F;
					bounceFactor = bounceFactor > 1 ? 1 : bounceFactor;
				}
				else if (item == Items.gunpowder)
				{
					size++;
				}
				else if (item == Item.getItemFromBlock(Blocks.tnt))
				{
					size += 5;
				}
				else return false;
			}
		}
		if (fuseLength < 1 || size < 1) return false;
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("Fuse", fuseLength);
		nbt.setInteger("Size", size);
		nbt.setFloat("Bounce Factor", bounceFactor);
		nbt.setFloat("Speed", speed);
		stack.setTagCompound(nbt);
		return true;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv)
	{
		return stack.copy();
	}

	@Override
	public int getRecipeSize()
	{
		return 10;
	}

	@Override
	public ItemStack getRecipeOutput()
	{
		return stack;
	}
}
