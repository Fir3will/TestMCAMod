package main.testmca.models;

import java.util.HashMap;
import main.testmca.entities.EntityHornedGoat;
import mca.MCAClientLibrary.MCAModelRenderer;
import mca.MCACommonLibrary.MCAVersionChecker;
import mca.MCACommonLibrary.animation.AnimationHandler;
import mca.MCACommonLibrary.math.Matrix4f;
import mca.MCACommonLibrary.math.Quaternion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelHornedGoat extends ModelBase
{
	public final int MCA_MIN_REQUESTED_VERSION = 3;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer bodyMain;
	MCAModelRenderer frLeg;
	MCAModelRenderer flLeg;
	MCAModelRenderer upperLeg2;
	MCAModelRenderer upperLeg1;
	MCAModelRenderer tail;
	MCAModelRenderer neck1;
	MCAModelRenderer neck2;
	MCAModelRenderer blLeg;
	MCAModelRenderer brLeg;
	MCAModelRenderer head;
	MCAModelRenderer jaw;
	MCAModelRenderer leftEar;
	MCAModelRenderer rightEar;
	MCAModelRenderer leftHorn;
	MCAModelRenderer rightHorn;
	MCAModelRenderer goaty;
	MCAModelRenderer leftHorn2;
	MCAModelRenderer rightHorn2;

	public ModelHornedGoat()
	{
		MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

		textureWidth = 64;
		textureHeight = 64;

		bodyMain = new MCAModelRenderer(this, "bodyMain", 1, 0);
		bodyMain.mirror = false;
		bodyMain.addBox(-3.0F, 0.0F, -1.0F, 6, 6, 14);
		bodyMain.setInitialRotationPoint(0.0F, -16.0F, -4.0F);
		bodyMain.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		bodyMain.setTextureSize(64, 64);
		parts.put(bodyMain.boxName, bodyMain);

		frLeg = new MCAModelRenderer(this, "frLeg", 14, 31);
		frLeg.mirror = false;
		frLeg.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2);
		frLeg.setInitialRotationPoint(-1.5F, 0.0F, 11.0F);
		frLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		frLeg.setTextureSize(64, 64);
		parts.put(frLeg.boxName, frLeg);
		bodyMain.addChild(frLeg);

		flLeg = new MCAModelRenderer(this, "flLeg", 24, 31);
		flLeg.mirror = false;
		flLeg.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2);
		flLeg.setInitialRotationPoint(1.5F, 0.0F, 11.0F);
		flLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		flLeg.setTextureSize(64, 64);
		parts.put(flLeg.boxName, flLeg);
		bodyMain.addChild(flLeg);

		upperLeg2 = new MCAModelRenderer(this, "upperLeg2", 0, 52);
		upperLeg2.mirror = false;
		upperLeg2.addBox(-1.5F, -1.5F, -1.2F, 3, 2, 3);
		upperLeg2.setInitialRotationPoint(1.6F, 0.0F, 0.5F);
		upperLeg2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.07410849F, 0.0F, 0.0F, 0.9972502F)).transpose());
		upperLeg2.setTextureSize(64, 64);
		parts.put(upperLeg2.boxName, upperLeg2);
		bodyMain.addChild(upperLeg2);

		upperLeg1 = new MCAModelRenderer(this, "upperLeg1", 0, 45);
		upperLeg1.mirror = false;
		upperLeg1.addBox(-1.5F, -1.5F, -1.2F, 3, 2, 3);
		upperLeg1.setInitialRotationPoint(-1.6F, 0.0F, 0.5F);
		upperLeg1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.07410849F, 0.0F, 0.0F, 0.9972502F)).transpose());
		upperLeg1.setTextureSize(64, 64);
		parts.put(upperLeg1.boxName, upperLeg1);
		bodyMain.addChild(upperLeg1);

		tail = new MCAModelRenderer(this, "tail", 34, 22);
		tail.mirror = false;
		tail.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 1);
		tail.setInitialRotationPoint(0.0F, 5.5F, 0.0F);
		tail.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1305262F, 0.0F, 0.0F, 0.9914449F)).transpose());
		tail.setTextureSize(64, 64);
		parts.put(tail.boxName, tail);
		bodyMain.addChild(tail);

		neck1 = new MCAModelRenderer(this, "neck1", 46, 12);
		neck1.mirror = false;
		neck1.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2);
		neck1.setInitialRotationPoint(0.0F, 5.0F, 10.0F);
		neck1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.57357645F, 0.0F, 0.0F, 0.81915206F)).transpose());
		neck1.setTextureSize(64, 64);
		parts.put(neck1.boxName, neck1);
		bodyMain.addChild(neck1);

		neck2 = new MCAModelRenderer(this, "neck2", 44, 1);
		neck2.mirror = false;
		neck2.addBox(-2.5F, -4.0F, 1.5F, 5, 5, 2);
		neck2.setInitialRotationPoint(0.0F, 5.0F, 10.0F);
		neck2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0784591F, 0.0F, 0.0F, 0.9969173F)).transpose());
		neck2.setTextureSize(64, 64);
		parts.put(neck2.boxName, neck2);
		bodyMain.addChild(neck2);

		blLeg = new MCAModelRenderer(this, "blLeg", 24, 41);
		blLeg.mirror = false;
		blLeg.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2);
		blLeg.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		blLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.06975647F, 0.0F, 0.0F, 0.9975641F)).transpose());
		blLeg.setTextureSize(64, 64);
		parts.put(blLeg.boxName, blLeg);
		upperLeg2.addChild(blLeg);

		brLeg = new MCAModelRenderer(this, "brLeg", 14, 41);
		brLeg.mirror = false;
		brLeg.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2);
		brLeg.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		brLeg.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.06975647F, 0.0F, 0.0F, 0.9975641F)).transpose());
		brLeg.setTextureSize(64, 64);
		parts.put(brLeg.boxName, brLeg);
		upperLeg1.addChild(brLeg);

		head = new MCAModelRenderer(this, "head", 0, 22);
		head.mirror = true;
		head.addBox(0.0F, 0.0F, 0.0F, 3, 2, 5);
		head.setInitialRotationPoint(-1.5F, 4.0F, 0.0F);
		head.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4617486F, 0.0F, 0.0F, 0.8870108F)).transpose());
		head.setTextureSize(64, 64);
		parts.put(head.boxName, head);
		neck1.addChild(head);

		jaw = new MCAModelRenderer(this, "jaw", 19, 23);
		jaw.mirror = false;
		jaw.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 4);
		jaw.setInitialRotationPoint(1.5F, 0.3F, 0.5F);
		jaw.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		jaw.setTextureSize(64, 64);
		parts.put(jaw.boxName, jaw);
		head.addChild(jaw);

		leftEar = new MCAModelRenderer(this, "leftEar", 34, 28);
		leftEar.mirror = false;
		leftEar.addBox(0.0F, -2.5F, -0.5F, 1, 3, 1);
		leftEar.setInitialRotationPoint(2.5F, 0.5F, 1.0F);
		leftEar.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.21643962F, 0.976296F)).transpose());
		leftEar.setTextureSize(64, 64);
		parts.put(leftEar.boxName, leftEar);
		head.addChild(leftEar);

		rightEar = new MCAModelRenderer(this, "rightEar", 34, 34);
		rightEar.mirror = false;
		rightEar.addBox(-0.5F, -2.0F, -1.0F, 1, 3, 1);
		rightEar.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		rightEar.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.21643962F, -0.976296F, -9.4608765E-9F, -4.2675254E-8F)).transpose());
		rightEar.setTextureSize(64, 64);
		parts.put(rightEar.boxName, rightEar);
		head.addChild(rightEar);

		leftHorn = new MCAModelRenderer(this, "left horn", 14, 51);
		leftHorn.mirror = false;
		leftHorn.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1);
		leftHorn.setInitialRotationPoint(2.5F, 1.9F, 0.0F);
		leftHorn.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4158418F, -0.23360625F, -0.111424476F, 0.8718304F)).transpose());
		leftHorn.setTextureSize(64, 64);
		parts.put(leftHorn.boxName, leftHorn);
		head.addChild(leftHorn);

		rightHorn = new MCAModelRenderer(this, "right horn", 20, 51);
		rightHorn.mirror = false;
		rightHorn.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1);
		rightHorn.setInitialRotationPoint(0.5F, 1.9F, 0.0F);
		rightHorn.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4158418F, 0.23360625F, 0.111424476F, 0.8718304F)).transpose());
		rightHorn.setTextureSize(64, 64);
		parts.put(rightHorn.boxName, rightHorn);
		head.addChild(rightHorn);

		goaty = new MCAModelRenderer(this, "goaty", 34, 40);
		goaty.mirror = false;
		goaty.addBox(-0.5F, 0.5F, 4.0F, 1, 2, 0);
		goaty.setInitialRotationPoint(0.0F, -2.0F, -1.0F);
		goaty.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.1305262F, 0.0F, 0.0F, 0.9914449F)).transpose());
		goaty.setTextureSize(64, 64);
		parts.put(goaty.boxName, goaty);
		jaw.addChild(goaty);

		leftHorn2 = new MCAModelRenderer(this, "left horn2", 14, 51);
		leftHorn2.mirror = false;
		leftHorn2.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1);
		leftHorn2.setInitialRotationPoint(0.0F, 1.0F, 0.0F);
		leftHorn2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.70710677F, 0.0F, 0.0F, 0.70710677F)).transpose());
		leftHorn2.setTextureSize(64, 64);
		parts.put(leftHorn2.boxName, leftHorn2);
		leftHorn.addChild(leftHorn2);

		rightHorn2 = new MCAModelRenderer(this, "right horn2", 20, 51);
		rightHorn2.mirror = false;
		rightHorn2.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1);
		rightHorn2.setInitialRotationPoint(0.0F, 1.0F, 0.0F);
		rightHorn2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.70710677F, 0.0F, 0.0F, 0.70710677F)).transpose());
		rightHorn2.setTextureSize(64, 64);
		parts.put(rightHorn2.boxName, rightHorn2);
		rightHorn.addChild(rightHorn2);

	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		EntityHornedGoat entity = (EntityHornedGoat) par1Entity;

		AnimationHandler.performAnimationInModel(parts, entity);

		//Render every non-child part
		bodyMain.render(par7);
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
	}

	public MCAModelRenderer getModelRendererFromName(String name)
	{
		return parts.get(name);
	}
}