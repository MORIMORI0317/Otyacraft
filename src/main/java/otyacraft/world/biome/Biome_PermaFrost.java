package otyacraft.world.biome;

import net.minecraft.world.biome.Biome;
import otyacraft.blocks.OCblocks;

public class Biome_PermaFrost extends Biome {

    public Biome_PermaFrost(){
        super(new BiomeProperties("PermaFrost").setBaseHeight(0.1F).setHeightVariation(0.1F).setTemperature(0F).setWaterColor(74));
        topBlock = OCblocks.PERMAFROST_GRASS.getDefaultState();
        fillerBlock = OCblocks.PERMAFROST.getDefaultState();
    }
}