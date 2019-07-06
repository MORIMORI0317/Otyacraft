package com.morimori.otyacraft.world.orereactor;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class OreReactorGenDorme {
	public static void OreReactorGen(BlockState p_220051_1_, World p_220051_2_, BlockPos p_220051_3_, PlayerEntity p_220051_4_, Hand p_220051_5_, BlockRayTraceResult p_220051_6_,int size,int atusa) {



		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
		  for(int lvt_6_1_2 = -1; lvt_6_1_2 < size; ++lvt_6_1_2) {
		  for(int lvt_6_1_3 = -size; lvt_6_1_3 < size; ++lvt_6_1_3) {

			  BlockPos pos=p_220051_3_.add(lvt_6_1_3, lvt_6_1_2, lvt_6_1_1);


	p_220051_2_.setBlockState(pos, Blocks.AIR.getDefaultState());

		  }}}



		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = -size; lvt_6_1_2 < size; ++lvt_6_1_2) {

				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, -1, lvt_6_1_2);


					p_220051_2_.setBlockState(pos, Blocks.STONE.getDefaultState());

			  }
			  }


		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < -size+atusa; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size; lvt_6_1_3 < size; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

					p_220051_2_.setBlockState(pos, Blocks.STONE.getDefaultState());
				  }

			  }
		  }

		  for(int lvt_6_1_1 = size-atusa; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size; lvt_6_1_3 < size; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

					p_220051_2_.setBlockState(pos, Blocks.STONE.getDefaultState());
				  }

			  }
		  }


		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size; lvt_6_1_3 < -size+atusa; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

					p_220051_2_.setBlockState(pos, Blocks.STONE.getDefaultState());
				  }

			  }
		  }

		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = size-atusa; lvt_6_1_3 < size; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

					p_220051_2_.setBlockState(pos, Blocks.STONE.getDefaultState());
				  }

			  }
		  }
		  for(int lvt_6_1_1 = -size+atusa; lvt_6_1_1 < size-atusa; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = size-atusa; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size+atusa; lvt_6_1_3 < size-atusa; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

					p_220051_2_.setBlockState(pos, Blocks.STONE.getDefaultState());
				  }

			  }
		  }

	}
	public static void paticlusize(BlockState p_220051_1_, World p_220051_2_, BlockPos p_220051_3_, PlayerEntity p_220051_4_, Hand p_220051_5_, BlockRayTraceResult p_220051_6_,int size,int atusa) {






		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = -size; lvt_6_1_2 < size; ++lvt_6_1_2) {

				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, -1, lvt_6_1_2);


				  p_220051_2_.addParticle(ParticleTypes.CLOUD , pos.getX()+0.5f,pos.getY()+0.5f,pos.getZ()+0.5f,0,0,0);

			  }
			  }


		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < -size+atusa; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size; lvt_6_1_3 < size; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

				  p_220051_2_.addParticle(ParticleTypes.CLOUD , pos.getX()+0.5f,pos.getY()+0.5f,pos.getZ()+0.5f,0,0,0);
				  }

			  }
		  }

		  for(int lvt_6_1_1 = size-atusa; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size; lvt_6_1_3 < size; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

				  p_220051_2_.addParticle(ParticleTypes.CLOUD , pos.getX()+0.5f,pos.getY()+0.5f,pos.getZ()+0.5f,0,0,0);
				  }

			  }
		  }


		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size; lvt_6_1_3 < -size+atusa; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

				  p_220051_2_.addParticle(ParticleTypes.CLOUD , pos.getX()+0.5f,pos.getY()+0.5f,pos.getZ()+0.5f,0,0,0);
				  }

			  }
		  }

		  for(int lvt_6_1_1 = -size; lvt_6_1_1 < size; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = 0; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = size-atusa; lvt_6_1_3 < size; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

				  p_220051_2_.addParticle(ParticleTypes.CLOUD , pos.getX()+0.5f,pos.getY()+0.5f,pos.getZ()+0.5f,0,0,0);
				  }

			  }
		  }
		  for(int lvt_6_1_1 = -size+atusa; lvt_6_1_1 < size-atusa; ++lvt_6_1_1) {
			  for(int lvt_6_1_2 = size-atusa; lvt_6_1_2 < size; ++lvt_6_1_2) {
				  for(int lvt_6_1_3 = -size+atusa; lvt_6_1_3 < size-atusa; ++lvt_6_1_3) {



				  BlockPos pos=p_220051_3_.add(lvt_6_1_1, lvt_6_1_2, lvt_6_1_3);

				  p_220051_2_.addParticle(ParticleTypes.CLOUD , pos.getX()+0.5f,pos.getY()+0.5f,pos.getZ()+0.5f,0,0,0);






				  }

			  }
		  }
	}
}
