package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.items.OCItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTeaCrops extends BlockCrops {

	protected BlockTeaCrops(Properties builder) {
		super(builder);

	}
	   protected IItemProvider getSeedsItem() {
		      return OCItems.TEA_SEED;
		   }

		   protected IItemProvider getCropsItem() {
		      return OCItems.TEA_LEAVES;
		   }
		   protected IItemProvider getFlowerItem() {
		      return OCItems.TEA_FLOWER;
		   }

		   @Override
		   public void getDrops(IBlockState state, net.minecraft.util.NonNullList<ItemStack> drops, World world, BlockPos pos, int fortune) {
		      super.getDrops(state, drops, world, pos, 0);
		      {
		         int i = this.getAge(state);
		         if (i >= this.getMaxAge()) {
		            int j = 3 + fortune;

		            for(int k = 0; k < j; ++k) {
		               if (world.rand.nextInt(2 * this.getMaxAge()) <= i) {
		                  drops.add(new ItemStack(this.getSeedsItem()));
		               }
		            }
		         }

		      }
		      int i = this.getAge(state);
		      if (i==this.getMaxAge()-1) {


		    	  drops.add(new ItemStack(this.getFlowerItem()));


			}







		   }

}
