package com.morimori.otyacraft.world.tree;

import java.util.Random;
import java.util.Set;

import com.morimori.otyacraft.blocks.OCBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class YukdrasilTreeFeature extends AbstractTreeFeature<NoFeatureConfig> {
   private static final IBlockState LOG = OCBlocks.YUKDRASIL_LOG.getDefaultState();
   private static final IBlockState LEAF = OCBlocks.YUKDRASIL_LEAVES.getDefaultState();
   private final boolean useExtraRandomHeight;

   public YukdrasilTreeFeature(boolean notify, boolean useExtraRandomHeightIn) {
      super(notify);
      this.useExtraRandomHeight = useExtraRandomHeightIn;
   }

   public boolean place(Set<BlockPos> changedBlocks, IWorld worldIn, Random rand, BlockPos position) {
      int i = rand.nextInt(3) + 5;
      if (this.useExtraRandomHeight) {
         i += rand.nextInt(7);
      }

      boolean flag = true;
      if (position.getY() >= 1 && position.getY() + i + 1 <= worldIn.getWorld().getHeight()) {
         for(int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
            int k = 1;
            if (j == position.getY()) {
               k = 0;
            }

            if (j >= position.getY() + 1 + i - 2) {
               k = 2;
            }

            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

            for(int l = position.getX() - k; l <= position.getX() + k && flag; ++l) {
               for(int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1) {
                  if (j >= 0 && j < worldIn.getWorld().getHeight()) {
                     if (!this.canGrowInto(worldIn, blockpos$mutableblockpos.setPos(l, j, i1))) {
                        flag = false;
                     }
                  } else {
                     flag = false;
                  }
               }
            }
         }

         if (!flag) {
            return false;
         } else {
            boolean isSoil = worldIn.getBlockState(position.down()).canSustainPlant(worldIn, position.down(), net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)OCBlocks.YUKDRASIL_SAPLING);
            if (isSoil && position.getY() < worldIn.getWorld().getHeight() - i - 1) {
               this.setDirtAt(worldIn, position.down(), position);

               for(int i2 = position.getY() - 3 + i; i2 <= position.getY() + i; ++i2) {
                  int k2 = i2 - (position.getY() + i);
                  int l2 = 1 - k2 / 2;

                  for(int i3 = position.getX() - l2; i3 <= position.getX() + l2; ++i3) {
                     int j1 = i3 - position.getX();

                     for(int k1 = position.getZ() - l2; k1 <= position.getZ() + l2; ++k1) {
                        int l1 = k1 - position.getZ();
                        if (Math.abs(j1) != l2 || Math.abs(l1) != l2 || rand.nextInt(2) != 0 && k2 != 0) {
                           BlockPos blockpos = new BlockPos(i3, i2, k1);
                           IBlockState iblockstate = worldIn.getBlockState(blockpos);
                           if (iblockstate.isAir(worldIn, blockpos) || iblockstate.isIn(BlockTags.LEAVES)) {
                              this.setBlockState(worldIn, blockpos, LEAF);
                           }
                        }
                     }
                  }
               }

               for(int j2 = 0; j2 < i; ++j2) {
                  IBlockState iblockstate1 = worldIn.getBlockState(position.up(j2));
                  if (iblockstate1.isAir(worldIn, position.up(j2)) || iblockstate1.isIn(BlockTags.LEAVES)) {
                     this.func_208520_a(changedBlocks, worldIn, position.up(j2), LOG);
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }
}