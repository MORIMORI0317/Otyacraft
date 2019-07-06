package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.world.orereactor.OreReactorGenDorme;
import com.morimori.otyacraft.world.orereactor.OreReactorGenOre;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class OreReactorCoreBlock extends Block{

	public OreReactorCoreBlock(Properties properties) {
		super(properties);

	}
	 public boolean onBlockActivated(BlockState p_220051_1_, World p_220051_2_, BlockPos p_220051_3_, PlayerEntity p_220051_4_, Hand p_220051_5_, BlockRayTraceResult p_220051_6_) {


		 int size=20;
		 int atusa=4;




		 if(p_220051_4_.isSneaking()) {
			 this.ActiveReactor(p_220051_1_, p_220051_2_, p_220051_3_, p_220051_4_, p_220051_5_, p_220051_6_,size,atusa);

		 }
		 else {

			 OreReactorGenDorme.paticlusize(p_220051_1_, p_220051_2_, p_220051_3_, p_220051_4_, p_220051_5_, p_220051_6_,size,atusa);



		 }

		return true;

	}





	public void ActiveReactor(BlockState p_220051_1_, World p_220051_2_, BlockPos p_220051_3_, PlayerEntity p_220051_4_, Hand p_220051_5_, BlockRayTraceResult p_220051_6_,int size,int atusa) {



		 OreReactorGenDorme.OreReactorGen(p_220051_1_, p_220051_2_, p_220051_3_, p_220051_4_, p_220051_5_, p_220051_6_, size, atusa);
		 OreReactorGenOre.OreReactorGen(p_220051_1_, p_220051_2_, p_220051_3_, p_220051_4_, p_220051_5_, p_220051_6_, size, atusa);

		 p_220051_2_.addParticle(ParticleTypes.EXPLOSION , p_220051_3_.getX()+0.5f,p_220051_3_.getY()+0.5f,p_220051_3_.getZ()+0.5f, p_220051_2_.rand.nextFloat() - 0.5F * 0.2F, p_220051_2_.rand.nextFloat() - 0.5F * 0.2F, p_220051_2_.rand.nextFloat() - 0.5F * 0.2F);
		 p_220051_2_.playSound((PlayerEntity)null, p_220051_3_, SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT ,SoundCategory.MASTER, 100, 0.1f);
		 p_220051_2_.setBlockState(p_220051_3_, Blocks.AIR.getDefaultState());

	}





}
