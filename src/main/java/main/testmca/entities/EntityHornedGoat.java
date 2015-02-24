package main.testmca.entities;

import main.testmca.animations.HornedGoat.AnimationHandlerHornedGoat;
import mca.MCACommonLibrary.IMCAnimatedEntity;
import mca.MCACommonLibrary.animation.AnimationHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityHornedGoat extends EntityAnimal implements IMCAnimatedEntity
{
	private int counter, id;
	protected AnimationHandler animHandler = new AnimationHandlerHornedGoat(this);

	public EntityHornedGoat(World par1World)
	{
		super(par1World);
		setSize(0.9F, 1.3F);
		getNavigator().setAvoidsWater(true);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		tasks.addTask(2, new EntityAIMate(this, 1.0D));
		tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
		tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		tasks.addTask(5, new EntityAIWander(this, 1.0D));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(7, new EntityAILookIdle(this));
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
	}

	@Override
	public AnimationHandler getAnimationHandler()
	{
		return animHandler;
	}

	@Override
	public void onUpdate()
	{
		if (id == 1)
		{
			if (getAnimationHandler().isAnimationActive("eatingStill") && counter++ > 200)
			{
				getAnimationHandler().stopAnimation("eatingStill");
				id = 0;
				counter = 0;
			}
		}
		super.onUpdate();
	}

	@Override
	protected float getSoundPitch()
	{
		return super.getSoundPitch() - 1.0F;
	}

	@Override
	protected String getLivingSound()
	{
		return "mob.sheep.say";
	}

	@Override
	protected String getHurtSound()
	{
		return "mob.sheep.say";
	}

	@Override
	protected String getDeathSound()
	{
		return "mob.sheep.say";
	}

	@Override
	public boolean interact(EntityPlayer player)
	{
		//RenderHornedGoat
		ItemStack stack = player.getHeldItem();
		if (stack != null && stack.getItem() == Item.getItemFromBlock(Blocks.grass))
		{
			id = 1;
			if (!getAnimationHandler().isAnimationActive("eatingStill"))
			{
				getAnimationHandler().activateAnimation("eatingStill", 0);
			}
		}
		else
		{
			if (!getAnimationHandler().isAnimationActive("charge"))
			{
				getAnimationHandler().activateAnimation("charge", 0);
			}
		}
		return super.interact(player);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeEntityToNBT(nbttagcompound);
	}

	@Override
	public EntityHornedGoat createChild(EntityAgeable p_90011_1_)
	{
		return new EntityHornedGoat(worldObj);
	}
}