package com.morimori.otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BlockWildTeaSeedlings extends Block {
	   private static final VoxelShape ATARI = Block.makeCuboidShape(4, 0, 4, 12, 20, 12);

	public BlockWildTeaSeedlings(Properties properties) {
		super(properties);

	}
	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		      return ATARI;
		   }
}
