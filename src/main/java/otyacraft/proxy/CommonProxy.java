package otyacraft.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import otyacraft.OCoreoictionary;
import otyacraft.blocks.OCblocks;
import otyacraft.items.OCitems;
import otyacraft.recipe.Smelt;
import otyacraft.world.biome.BiomeCore;
import otyacraft.world.worldgen.BlockGenerator;
@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
    	IForgeRegistry<Item> registryitems = ForgeRegistries.ITEMS;
    	IForgeRegistry<Block> registryblocks = ForgeRegistries.BLOCKS;
		//Items　アイテム
		OCitems.registerItem(registryitems);
		OCblocks.registerItem(registryitems);
		//Blocks　ブロック
		OCblocks.registerBlocks(registryblocks);
		//OreDictionary　鉱石辞書
		OCoreoictionary.tourokuOreDictionary();
		//worldgen　ワールド生成
		GameRegistry.registerWorldGenerator(new BlockGenerator(), 3);
		//biomes　バイオーム
		BiomeCore.registerBiome();

	}

	public void init(FMLInitializationEvent event) {

		//Recipe　レシピ
		Smelt.registerRecipe();

	}

	public void postInit(FMLPostInitializationEvent event) {



	}

}
