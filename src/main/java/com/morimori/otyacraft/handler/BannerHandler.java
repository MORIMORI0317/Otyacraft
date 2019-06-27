package com.morimori.otyacraft.handler;

import java.util.ArrayList;

import com.morimori.otyacraft.items.MODItems;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.BannerPattern;

public class BannerHandler {

	public static final BannerPattern YUNOMI= BannerPattern.create("yunomi", "yunomi","yno", new ItemStack(MODItems.TEA_CUP));
	public static final BannerPattern ITUMONO= BannerPattern.create("hello_otcf", "hello_otcf","hiot", new ItemStack(MODItems.TEA_LEAVES));
	public static final BannerPattern RADEONVII= BannerPattern.create("r", "r","r", new ItemStack(MODItems.RADEON_VII));


	public static void registerBannerPattern() {

		new ArrayList<>().add(YUNOMI);
		new ArrayList<>().add(ITUMONO);
		new ArrayList<>().add(RADEONVII);
	}



}


