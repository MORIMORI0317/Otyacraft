package com.morimori.otyacraft.materia;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OCmaterialType {

	private String materialname;
	private Material materialmatela;
	private SoundType materialsound;


	   public static final OCmaterialType INGOT = new OCmaterialType ("ingot",null,null);
	   public static final OCmaterialType NUGGET = new OCmaterialType ("nugget",null,null);
	   public static final OCmaterialType ORE = new OCmaterialType ("ore",Material.ROCK,SoundType.STONE);
	   public static final OCmaterialType GEAR = new OCmaterialType ("gear",null,null);
	   public static final OCmaterialType BLOCK = new OCmaterialType ("block",Material.IRON,SoundType.METAL);
	   public static final OCmaterialType FACTORY_BLOCK = new OCmaterialType ("factory_block",Material.IRON,SoundType.ANVIL);
	   public static final OCmaterialType SWORD = new OCmaterialType ("sword",null,null);
	   public static final OCmaterialType SHOVEL = new OCmaterialType ("shovel",null,null);
	   public static final OCmaterialType PICKAXE = new OCmaterialType ("pickaxe",null,null);
	   public static final OCmaterialType AXE = new OCmaterialType ("axe",null,null);
	   public static final OCmaterialType HOE = new OCmaterialType ("hoe",null,null);
	   public static final OCmaterialType POWDER = new OCmaterialType ("powder",null,null);

	public OCmaterialType(String name,Material matela,SoundType sound) {
		this.materialname = name;
		this.materialmatela = matela;
		this.materialsound = sound;

	}


	public  String getMaterialTypeName() {

		return materialname;

	}
	public  Material getMaterialMaterial() {

		return materialmatela;

	}
	public  SoundType getMaterialsound() {



		return materialsound;

	}


}
