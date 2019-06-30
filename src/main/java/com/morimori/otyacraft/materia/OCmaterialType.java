package com.morimori.otyacraft.materia;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OCmaterialType {

	private String materialname;
	private Material materialmatela;
	private SoundType materialsound;
	private ToolType Toooltyape;


	   public static final OCmaterialType INGOT = new OCmaterialType ("ingot",null,null,null);
	   public static final OCmaterialType NUGGET = new OCmaterialType ("nugget",null,null,null);
	   public static final OCmaterialType ORE = new OCmaterialType ("ore",ToolType.PICKAXE,Material.ROCK,SoundType.STONE);
	   public static final OCmaterialType GEAR = new OCmaterialType ("gear",null,null,null);
	   public static final OCmaterialType BLOCK = new OCmaterialType ("block",ToolType.PICKAXE,Material.IRON,SoundType.METAL);
	   public static final OCmaterialType FACTORY_BLOCK = new OCmaterialType ("factory_block",ToolType.PICKAXE,Material.IRON,SoundType.ANVIL);
	   public static final OCmaterialType SWORD = new OCmaterialType ("sword",null,null,null);
	   public static final OCmaterialType SHOVEL = new OCmaterialType ("shovel",null,null,null);
	   public static final OCmaterialType PICKAXE = new OCmaterialType ("pickaxe",null,null,null);
	   public static final OCmaterialType AXE = new OCmaterialType ("axe",null,null,null);
	   public static final OCmaterialType HOE = new OCmaterialType ("hoe",null,null,null);
	   public static final OCmaterialType POWDER = new OCmaterialType ("powder",null,null,null);
	   public static final OCmaterialType PLATE = new OCmaterialType ("plate",null,null,null);
	   public static final OCmaterialType MORTAR = new OCmaterialType ("mortar",null,null,null);

	public OCmaterialType(String name,ToolType toooltyape,Material matela,SoundType sound) {
		this.materialname = name;
		this.materialmatela = matela;
		this.materialsound = sound;
		this.Toooltyape = toooltyape;

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
	public  ToolType getToooltyape() {



		return Toooltyape;

	}

}
