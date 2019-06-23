package com.morimori.otyacraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockThunderSstone extends Block {
	public BlockThunderSstone(Properties properties) {
		super(properties);

	}

	   public void tick(IBlockState state, World worldIn, BlockPos pos, Random random) {
		   EntityLightningBolt entityIn = new EntityLightningBolt(worldIn, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), false);
		   worldIn.addWeatherEffect(entityIn);
		   entityIn.setLocationAndAngles( (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0, 0);
			   worldIn.spawnEntity(entityIn);
	   }
}
