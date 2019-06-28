package com.morimori.otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class OCBlock extends Block{


	public OCBlock(Properties hardnessAndResistance) {
		super(hardnessAndResistance);

	}
	   @Override
	   public int getHarvestLevel(BlockState state) {
	      return 0;
	   }

}
