package main.testmca;

import java.awt.Color;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MCACommon
{
	public void registerRenders()
	{

	}

	public static void registerThrowable(Class<? extends Entity> entityClass, String mobName)
	{
		EntityRegistry.registerModEntity(entityClass, mobName, nextID(), TestMCA.instance, 80, 3, true);
	}

	public static void registerEntity(Class<? extends EntityLiving> entityClass, String mobName)
	{
		int id = nextID();
		EntityRegistry.registerGlobalEntityID(entityClass, mobName, id);
		EntityRegistry.registerModEntity(entityClass, mobName, id, TestMCA.instance, 80, 3, true);
	}

	public static void registerEntity(Class<? extends EntityLiving> entityClass, String mobName, EnumCreatureType creature, Color foreground, Color background)
	{
		int id = nextID();
		EntityRegistry.registerGlobalEntityID(entityClass, mobName, id, foreground.getRGB(), background.getRGB());
		EntityRegistry.registerModEntity(entityClass, mobName, id, TestMCA.instance, 80, 3, true);
	}

	public static void registerEntity(Class<? extends EntityLiving> entityClass, String mobName, EnumCreatureType creature)
	{
		Random rand = new Random();
		Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		switch (creature)
		{
			case ambient:
				registerEntity(entityClass, mobName, creature, color, color);
				break;
			case creature:
				registerEntity(entityClass, mobName, creature, Color.WHITE, Color.BLACK);
				break;
			case monster:
				registerEntity(entityClass, mobName, creature, Color.BLACK, Color.WHITE);
				break;
			case waterCreature:
				registerEntity(entityClass, mobName, creature, Color.BLUE.brighter(), Color.BLUE.darker());
				break;
		}
	}

	private static int nextID()
	{
		int i = entityID++;
		if (EntityList.getStringFromID(i) != null) return nextID();
		return i;
	}

	private static int entityID = 1;
}
