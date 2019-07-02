package com.morimori.otyacraft.tag;

import com.morimori.otyacraft.Variable;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class MODBlockTags {
	   public static final Tag<Block> WILDTEASEEDLINGS_ON = makeWrapperTag("wild_tea_seedlings_on");




	   private static Tag<Block> makeWrapperTag(String id) {
		      return new BlockTags.Wrapper(new ResourceLocation(Variable.MODID+":"+id));
		   }


}
