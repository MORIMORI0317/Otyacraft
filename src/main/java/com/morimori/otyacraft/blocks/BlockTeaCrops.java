package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.items.MODItems;

import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockTeaCrops extends CropsBlock{

	protected BlockTeaCrops(Properties builder) {
		super(builder);

	}
	   @OnlyIn(Dist.CLIENT)
	   protected IItemProvider getSeedsItem() {
	      return MODItems.TEA_SEED;
	   }
}
