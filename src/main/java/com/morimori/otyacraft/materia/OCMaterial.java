package com.morimori.otyacraft.materia;

import net.minecraft.item.IItemTier;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class OCMaterial {
	private String materialname;
	private String primaryColor;
	private String secondaryColor;
	private IItemTier Tier;
	private int HarvestLevel;







	   public static final OCMaterial TEST = new OCMaterial ("test",0,"E35E1D","E35E1D",null);
	   public static final OCMaterial IRON = new OCMaterial ("iron",1,null,null,null);
	   public static final OCMaterial COPPER = new OCMaterial ("copper",1,"E35E1D","B0440F",OCItemTier.COPPER);
	   public static final OCMaterial LEAD = new OCMaterial ("lead",1,"B77FC7","74587C",null);
	   public static final OCMaterial NICKEL = new OCMaterial ("nickel",1,"D0E5C1","A6B49A",null);
	   public static final OCMaterial TIN = new OCMaterial ("tin",1,"FBFCFB","CFD0CE",null);
	   public static final OCMaterial CENTERL = new OCMaterial ("centerl",2,"052FD6","1935A5",OCItemTier.CENTERL);
	   public static final OCMaterial SILVER = new OCMaterial ("silver",2,"D4D7E5","9296A7",null);
	   public static final OCMaterial PERMAFROST = new OCMaterial ("permafrost",2,"4E5A62","444E54",OCItemTier.PERMAFROST);
	   public static final OCMaterial FICTNIUM = new OCMaterial ("fictnium",2,"232323","0A0A0A",null);
	   public static final OCMaterial RUBY = new OCMaterial ("ruby",2,null,null,OCItemTier.RUBY);
	   public static final OCMaterial SAPPHIRE = new OCMaterial ("sapphire",2,null,null,OCItemTier.SAPPHIRE);
	   public static final OCMaterial REALITE = new OCMaterial ("realite",2,null,null,null);
	   public static final OCMaterial GOLD = new OCMaterial ("gold",2,null,null,null);
	   public static final OCMaterial DIAMOND = new OCMaterial ("diamond",2,null,null,null);
	   public static final OCMaterial EMERALD = new OCMaterial ("emerald",2,null,null,null);
	   public static final OCMaterial REDSTONE = new OCMaterial ("redstone",1,null,null,null);
	   public static final OCMaterial QUARTZ = new OCMaterial ("quartz",0,null,null,null);
	   public static final OCMaterial COAL = new OCMaterial ("coal",0,null,null,null);
	   public static final OCMaterial LAPIS = new OCMaterial ("lapis",1,null,null,null);
	   public static final OCMaterial SECOND_GRILLED_BRICK = new OCMaterial ("sgb",0,null,null,OCItemTier.SECOND_GRILLED_BRICK);


	public OCMaterial(String name,int harvestlevel,String primarycolor,String secondarycolor,IItemTier tier) {
		this.materialname = name;
		this.primaryColor=primarycolor;
		this.secondaryColor=secondarycolor;
		this.Tier=tier;
		this.HarvestLevel=harvestlevel;
	}

	public  String getMaterialName() {

		return materialname;

	}
	public  ITextComponent getTranslationKey() {

		ITextComponent name = new TranslationTextComponent("material."+materialname);

		return name;

	}
	public  int getPrimaryColor() {

		int iz = Integer.parseInt(primaryColor, 16);

		return iz;

	}
	public  int getSecondaryColor() {

		int iz = Integer.parseInt(secondaryColor, 16);

		return iz;

	}
	public  IItemTier getTier() {


		return Tier;

	}
	public  int getHarvestLevel() {


		return HarvestLevel;

	}
}
