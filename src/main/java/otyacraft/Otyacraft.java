package otyacraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import otyacraft.proxy.CommonProxy;
@Mod(modid = Variable.MODID, version = Variable.MODVER, name = Variable.MODNAME, useMetadata = true,dependencies = Variable.MODNEEDFORGE)
@EventBusSubscriber
public class Otyacraft {
		//114514TEST
    @SidedProxy(clientSide=Variable.Client_Proxy, serverSide=Variable.ServerProxy)
    public static CommonProxy proxy;


	 @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {



		proxy.preInit(event);
	}
	 @Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		proxy.init(event);


	}
	 @Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit(event);



	}


}


