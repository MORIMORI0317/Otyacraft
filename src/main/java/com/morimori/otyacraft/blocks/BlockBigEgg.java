package com.morimori.otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockBigEgg extends BlockFalling   {
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
	public BlockBigEgg(Properties properties) {
		super(properties);



	}


	   public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {

		   EntityChicken entityIn = new EntityChicken(worldIn);
		   entityIn.setGrowingAge(1);
		   entityIn.setLocationAndAngles( (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0, 0);
			   worldIn.spawnEntity(entityIn);
	      return Items.AIR;

	   }

	   public boolean isFullCube(IBlockState state) {
		      return false;
		   }

	   public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
		      return SHAPE;
		   }

}
