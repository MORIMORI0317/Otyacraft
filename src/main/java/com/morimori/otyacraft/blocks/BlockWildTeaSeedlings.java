package com.morimori.otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReaderBase;

public class BlockWildTeaSeedlings extends Block {
	   private static final VoxelShape ATARI = Block.makeCuboidShape(4, 0, 4, 12, 20, 12);

	public BlockWildTeaSeedlings(Properties properties) {
		super(properties);

	}
	   public boolean isFullCube(IBlockState state) {
		      return false;
		   }
	   public BlockFaceShape getBlockFaceShape(IBlockReader worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		      return BlockFaceShape.UNDEFINED;
		   }
	   public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
		      return ATARI;
		   }
	   public boolean isValidPosition(IBlockState state, IWorldReaderBase worldIn, BlockPos pos) {


		return this.canBlockStay(worldIn, pos);


	   }

	   @SuppressWarnings("deprecation")
	public IBlockState updatePostPlacement(IBlockState stateIn, EnumFacing facing, IBlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		   if (!stateIn.isValidPosition(worldIn, currentPos))
			return Blocks.AIR.getDefaultState();
		else
			return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
		   }



	    public boolean canBlockStay(IBlockReader worldIn, BlockPos pos)
	    {

	          IBlockState state = worldIn.getBlockState(pos.down());
	          Block block = state.getBlock();

	            if (block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block ==Blocks.PODZOL|| block == Blocks.COARSE_DIRT)
	            {
	                return true;
	            }


			return false;
	}
}
