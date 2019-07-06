package com.morimori.otyacraft.world.orereactor;

import java.util.Random;

import com.morimori.otyacraft.blocks.MODBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class OreSlect {

	public static Block OreSlecter() {
		Random random = new Random();
		if(random.nextInt(100)>=20) {
		switch (random.nextInt(4)) {
		case 0:

			return MODBlocks.COPPER_ORE;

		case 1:
			return MODBlocks.TIN_ORE;

	case 2:
		return MODBlocks.NICKEL_ORE;
	case 3:
		return MODBlocks.LEAD_ORE;
	case 4:
		return Blocks.IRON_ORE;
	}
		}
		else {

			if (random.nextInt(100)>=20) {


			switch (random.nextInt(2)) {
			case 0:

				return MODBlocks.SILVER_ORE;

			case 1:
				return Blocks.GOLD_ORE;
			}
			}
			else {

				switch (random.nextInt(4)) {
				case 0:

					return MODBlocks.RUBY_ORE;

				case 1:
					return Blocks.DIAMOND_ORE;
				case 2:

					return MODBlocks.SAPPHIRE_ORE;


			case 3:

				return MODBlocks.CENTERL_ORE;

			}
			}






	}
		return null;
	}
}
