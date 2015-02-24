package main.testmca.entities;

import main.testmca.animations.Grenade.AnimationHandlerGrenade;
import mca.MCACommonLibrary.IMCAnimatedEntity;
import mca.MCACommonLibrary.animation.AnimationHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class EntityGrenade extends EntityItem implements IMCAnimatedEntity
{
	private double bounceSlowFactor;
	private boolean exploded;
	protected AnimationHandler animHandler = new AnimationHandlerGrenade(this);

	public EntityGrenade(World par1World)
	{
		super(par1World);
		setSize(0.25F, 0.25F);
		exploded = false;
		bounceSlowFactor = 0.8D;
		yOffset = 0.0F;
	}

	public EntityGrenade(World par1World, int fuse, int size, float bounceFactor, float speed, EntityLivingBase entityliving)
	{
		this(par1World);
		setFuse(fuse);
		setSize(size);
		setBounceFactor(bounceFactor);
		setAngles(entityliving.rotationYaw, 0.0F);
		double d = -MathHelper.sin(entityliving.rotationYaw * (float) Math.PI / 180F);
		double d1 = MathHelper.cos(entityliving.rotationYaw * (float) Math.PI / 180F);
		motionX = speed * d * MathHelper.cos(entityliving.rotationPitch / 180F * (float) Math.PI);
		motionY = -speed * MathHelper.sin(entityliving.rotationPitch / 180F * (float) Math.PI);
		motionZ = speed * d1 * MathHelper.cos(entityliving.rotationPitch / 180F * (float) Math.PI);

		if (entityliving.ridingEntity != null && entityliving.ridingEntity instanceof EntityLivingBase)
		{
			entityliving = (EntityLivingBase) entityliving.ridingEntity;
		}

		motionX += entityliving.motionX;
		motionY += entityliving.onGround ? 0.0D : entityliving.motionY;
		motionZ += entityliving.motionZ;
		setPosition(entityliving.posX + d * 0.8D, entityliving.posY + entityliving.getEyeHeight(), entityliving.posZ + d1 * 0.80000000000000004D);
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
	}

	@Override
	public boolean isInRangeToRenderDist(double d)
	{
		return true;
	}

	@Override
	protected void entityInit()
	{
		dataWatcher.addObject(16, new Integer(25));
		dataWatcher.addObject(17, new Integer(1));
		dataWatcher.addObject(18, new Float(0.1F));
		super.entityInit();
	}

	public void setFuse(int fuse)
	{
		dataWatcher.updateObject(16, new Integer(fuse));
	}

	public void setSize(int size)
	{
		setSize(size / 4, size / 4);
		dataWatcher.updateObject(17, new Integer(size));
	}

	public void setBounceFactor(float bounceFactor)
	{
		dataWatcher.updateObject(18, new Float(bounceFactor));
	}

	public float getBounceFactor()
	{
		float f = dataWatcher.getWatchableObjectFloat(18);
		return f > 1 ? 0.99F : f;
	}

	public int getFuse()
	{
		return dataWatcher.getWatchableObjectInt(16);
	}

	public int getSize()
	{
		return dataWatcher.getWatchableObjectInt(17);
	}

	@Override
	public AnimationHandler getAnimationHandler()
	{
		return animHandler;
	}

	@Override
	public void onUpdate()
	{
		if (worldObj.isRemote)
		{
			worldObj.spawnParticle("smoke", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
		}
		//super.onUpdate();
		double d = motionX;
		double d1 = motionY;
		double d2 = motionZ;
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		moveEntity(motionX, motionY, motionZ);

		if (motionX == 0.0D && motionX != d)
		{
			motionX = -getBounceFactor() * d;
			motionY = bounceSlowFactor * d1;
			motionZ = bounceSlowFactor * d2;
		}

		if (motionY == 0.0D && motionY != d1)
		{
			motionX = bounceSlowFactor * d;
			motionY = -getBounceFactor() * d1;
			motionZ = bounceSlowFactor * d2;
		}

		if (motionZ == 0.0D && motionZ != d2)
		{
			motionX = bounceSlowFactor * d;
			motionY = bounceSlowFactor * d1;
			motionZ = -getBounceFactor() * d2;
		}

		motionY -= 0.04D;
		motionX *= 0.99D;
		motionY *= 0.99D;
		motionZ *= 0.99D;
		checkExplosion();
	}

	protected void checkExplosion()
	{
		setFuse(getFuse() - 1);
		if (getFuse() <= 0)
		{
			explode();
		}
	}

	protected void explode()
	{
		if (!exploded)
		{
			exploded = true;
			if (!worldObj.isRemote)
			{
				Explosion explosion = new Explosion(worldObj, null, posX, (float) posY, (float) posZ, getSize());
				explosion.doExplosionA();
				explosion.doExplosionB(true);
			}

			worldObj.playSoundEffect(posX, posY, posZ, "random.explode", 4F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

			for (int i = 0; i < 32; i++)
			{
				worldObj.spawnParticle("explode", posX, posY, posZ, worldObj.rand.nextDouble() - 0.5D, worldObj.rand.nextDouble() - 0.5D, worldObj.rand.nextDouble() - 0.5D);
				worldObj.spawnParticle("smoke", posX, posY, posZ, worldObj.rand.nextDouble() - 0.5D, worldObj.rand.nextDouble() - 0.5D, worldObj.rand.nextDouble() - 0.5D);
			}

			isDead = true;
		}
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return true;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float f)
	{
		return false;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
		setFuse(nbttagcompound.getInteger("Fuse"));
		setSize(nbttagcompound.getInteger("Size"));
		setBounceFactor(nbttagcompound.getFloat("Bounce Factor"));
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setInteger("Fuse", getFuse());
		nbttagcompound.setInteger("Size", getSize());
		nbttagcompound.setFloat("Bounce Factor", getBounceFactor());
	}

	@Override
	public void onCollideWithPlayer(EntityPlayer entityplayer)
	{
	}

	@Override
	public float getEyeHeight()
	{
		return height;
	}
}