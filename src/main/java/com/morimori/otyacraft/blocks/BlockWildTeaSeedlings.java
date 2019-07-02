package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.tag.MODBlockTags;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class BlockWildTeaSeedlings extends Block {
	   private static final VoxelShape ATARI = Block.makeCuboidShape(4, 0, 4, 12, 20, 12);

	public BlockWildTeaSeedlings(Properties properties) {
		super(properties);

	}
	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		      return ATARI;
		   }

	   public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		      return worldIn.getBlockState(pos.down()).isIn(MODBlockTags.WILDTEASEEDLINGS_ON);
		   }
	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		      if (!stateIn.isValidPosition(worldIn, currentPos)) {
		         return Blocks.AIR.getDefaultState();
		      }
		         return this.getDefaultState();
	      }
}
