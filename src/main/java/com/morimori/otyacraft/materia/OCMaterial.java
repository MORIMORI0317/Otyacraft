package com.morimori.otyacraft.materia;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class OCMaterial {
	public String materialname;
	public String primaryColor;
	public String secondaryColor;







	   public static final OCMaterial TEST = new OCMaterial ("test","E35E1D","E35E1D");
	   public static final OCMaterial IRON = new OCMaterial ("iron",null,null);
	   public static final OCMaterial COPPER = new OCMaterial ("copper","E35E1D","B0440F");
	   public static final OCMaterial LEAD = new OCMaterial ("lead","B77FC7","74587C");
	   public static final OCMaterial NICKEL = new OCMaterial ("nickel","D0E5C1","A6B49A");
	   public static final OCMaterial TIN = new OCMaterial ("tin","FBFCFB","CFD0CE");
	   public static final OCMaterial CENTERL = new OCMaterial ("centerl","052FD6","1935A5");
	   public static final OCMaterial SILVER = new OCMaterial ("silver","D4D7E5","9296A7");
	   public static final OCMaterial PERMAFROST = new OCMaterial ("permafrost","4E5A62","444E54");
	   public static final OCMaterial FICTNIUM = new OCMaterial ("fictnium","232323","0A0A0A");
	   public static final OCMaterial RUBY = new OCMaterial ("ruby",null,null);
	   public static final OCMaterial SAPPHIRE = new OCMaterial ("sapphire",null,null);
	   public static final OCMaterial REALITE = new OCMaterial ("realite",null,null);
	   public static final OCMaterial GOLD = new OCMaterial ("gold",null,null);
	   public static final OCMaterial DIAMOND = new OCMaterial ("diamond",null,null);
	   public static final OCMaterial EMERALD = new OCMaterial ("emerald",null,null);
	   public static final OCMaterial REDSTONE = new OCMaterial ("redstone",null,null);
	   public static final OCMaterial QUARTZ = new OCMaterial ("quartz",null,null);
	   public static final OCMaterial COAL = new OCMaterial ("coal",null,null);
	   public static final OCMaterial LAPIS = new OCMaterial ("lapis",null,null);
	   public static final OCMaterial SECOND_GRILLED_BRICK = new OCMaterial ("sgb",null,null);


	public OCMaterial(String name,String primarycolor,String secondarycolor) {
		this.materialname = name;
		this.primaryColor=primarycolor;
		this.secondaryColor=secondarycolor;
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
}
