package main.testmca;

import main.testmca.entities.EntityGrenade;
import main.testmca.entities.EntityHornedGoat;
import main.testmca.renders.ItemFlashGrenadeRenderer;
import main.testmca.renders.RenderGrenade;
import main.testmca.renders.RenderHornedGoat;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class MCAClient extends MCACommon
{
	@Override
	public void registerRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityHornedGoat.class, new RenderHornedGoat());
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade(null));
		MinecraftForgeClient.registerItemRenderer(TestMCA.MCAItems.grenade, new ItemFlashGrenadeRenderer());
	}
}
