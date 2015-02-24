package main.testmca;

import main.testmca.entities.EntityGrenade;
import main.testmca.entities.EntityHornedGoat;
import main.testmca.items.ItemGrenade;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TestMCA.Info.MODID, name = "BossBonanza", version = TestMCA.Info.VERSION)
public class TestMCA
{
	@Instance(TestMCA.Info.MODID)
	public static TestMCA instance;
	@SidedProxy(clientSide = TestMCA.Info.CLIENT_CLASS, serverSide = TestMCA.Info.COMMON_CLASS)
	public static MCACommon proxy;

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.registerItem(MCAItems.grenade, "grenade");
		MCACommon.registerEntity(EntityHornedGoat.class, "Horned Goat", EnumCreatureType.creature);
		MCACommon.registerThrowable(EntityGrenade.class, "grenade");
		GameRegistry.addRecipe(new RecipeGrenades());
		//MCAClient
		proxy.registerRenders();
	}

	public static class Info
	{
		public static final String MODID = "testmca";
		public static final String VERSION = "1.0";
		public static final String CLIENT_CLASS = "main.testmca.MCAClient";
		public static final String COMMON_CLASS = "main.testmca.MCACommon";
	}

	public static class MCAItems
	{
		public static final Item grenade = new ItemGrenade();
	}
}