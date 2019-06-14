package otyacraft.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
public class BiomeCore {

	public static Biome PermaFrostBiome = new Biome_PermaFrost();

	    @SubscribeEvent
		public static void registerBiome()
		{
	    	biomes(PermaFrostBiome,"permafrost",BiomeType.ICY,Type.NETHER,Type.COLD,Type.DRY);
		}

		public static void biomes(Biome biomes,String name,BiomeType Btyape,Type... tyape) {

			biomes.setRegistryName(name);
			ForgeRegistries.BIOMES.register(biomes);
			BiomeDictionary.addTypes(biomes, tyape);
			BiomeManager.addBiome(Btyape, new BiomeEntry(biomes,3));
			BiomeManager.addSpawnBiome(biomes);
		}


}

