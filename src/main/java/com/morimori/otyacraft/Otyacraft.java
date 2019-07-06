package com.morimori.otyacraft;

import com.morimori.otyacraft.blocks.MODBlocks;
import com.morimori.otyacraft.handler.BannerHandler;
import com.morimori.otyacraft.items.MODItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Variable.MODID)
public class Otyacraft
{


    public Otyacraft() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        IEventBus EVENT_BUS = MinecraftForge.EVENT_BUS;

   //     EVENT_BUS.addListener(EventPriority.NORMAL, false, ItemTooltipEvent.class, null);

        EVENT_BUS.register(this);



		DistExecutor.runWhenOn(Dist.CLIENT, ()->()-> {



			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		});


    }


	private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    	BannerHandler.registerBannerPattern();
    }

    private void processIMC(final InterModProcessEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {


        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        	MODItems.registerItem(itemRegistryEvent);
         	MODBlocks.registerItem(itemRegistryEvent);

        }


        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
           	MODBlocks.registerBlock(blockRegistryEvent);

        }


    }
}
