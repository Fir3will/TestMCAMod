package main.testmca.renders;

import main.testmca.entities.EntityGrenade;
import main.testmca.models.ModelGrenade;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGrenade extends Render
{
	public static final ResourceLocation Grenade_texture = new ResourceLocation("textures/blocks/wool_colored_gray.png");
	public ModelGrenade modelGrenade;

	public RenderGrenade(ItemStack stack)
	{
		if (stack == null)
		{
			modelGrenade = new ModelGrenade(10);
		}
		else
		{
			modelGrenade = new ModelGrenade(stack.stackTagCompound == null ? 10 : stack.stackTagCompound.getInteger("Size") * 5);
		}
	}

	@Override
	public void doRender(Entity _entity, double posX, double posY, double posZ, float var8, float var9)
	{
		EntityGrenade entity = (EntityGrenade) _entity;

		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glTranslatef((float) posX, (float) posY, (float) posZ);
		if (entity != null)
		{
			bindEntityTexture(entity);
			modelGrenade = new ModelGrenade(entity.getSize() * 3);
		}
		else
		{
			Minecraft.getMinecraft().getTextureManager().bindTexture(Grenade_texture);
		}
		modelGrenade.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1)
	{
		return Grenade_texture;
	}
}