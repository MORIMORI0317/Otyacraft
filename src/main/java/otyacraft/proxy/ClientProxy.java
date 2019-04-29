package otyacraft.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import otyacraft.blocks.OCblocks;
import otyacraft.items.OCitems;
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {



		super.preInit(event);
	}
	@Override
	public void init(FMLInitializationEvent event) {


		super.init(event);


	}
	@Override
	public void postInit(FMLPostInitializationEvent event) {



		super.postInit(event);
	}

	    @SubscribeEvent
	    public static void registerModels(ModelRegistryEvent event) {
			OCitems.tourokuModels();
			OCblocks.tourokuModels();
	    }
}
