package otyacraft.world.worldgen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import otyacraft.blocks.OCblocks;

public class PlantGenHinagata {

    public static void wild_tea_seedlingsgen(World world,Random random, int x, int z) {


    	int i = 0;
    	int haba =150-50;

    		for (i = 0; i < 10; i++){
       	BlockPos pos = new BlockPos(x+random.nextInt(16),50+random.nextInt(haba),z+random.nextInt(16));
       	IBlockState posblock = world.getBlockState(pos);
       	WorldGenMinablePlantGen generator = new WorldGenMinablePlantGen(OCblocks.WILD_TEA_SEEDLINGS.getDefaultState(),10);
    	generator.generatewild_tea_seedling(world,random,pos);

    	}	 }
}
