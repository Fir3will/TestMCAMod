package main.testmca.renders;

import main.testmca.TestMCA;
import main.testmca.models.ModelHornedGoat;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderHornedGoat extends RenderLiving
{
	public static final ResourceLocation HornedGoat_texture = new ResourceLocation(TestMCA.Info.MODID, "textures/entities/HornedGoat.png");
	public static ModelHornedGoat modelHornedGoat = new ModelHornedGoat();
	public static float modelHeight = 3F;

	public RenderHornedGoat()
	{
		super(modelHornedGoat, 1F);
	}

	@Override
	public void doRender(Entity _entity, double posX, double posY, double posZ, float var8, float var9)
	{
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_CULL_FACE);
		super.doRender(_entity, posX, posY, posZ, var8, var9);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glPopMatrix();
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entityliving, float f)
	{
		GL11.glRotatef(180F, 0, 1F, 0F);
		GL11.glRotatef(180F, 0, 0, 1F);
		GL11.glTranslatef(0, modelHeight, 0);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1)
	{
		return HornedGoat_texture;
	}
}