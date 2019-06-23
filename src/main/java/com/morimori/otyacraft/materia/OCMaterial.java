package com.morimori.otyacraft.materia;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class OCMaterial {
	public String materialname;
	public int SwordDamege;
	public float SwordSpeed;
	public IItemTier Toolmatelia;
	public float ShovelDamege;
	public float ShovelSpeed;
	public int PickaxeDamege;
	public float PickaxeSpeed;
	public int AxeDamege;
	public float AxeSpeed;
	public int HoeDamege;
	public float HoeSpeed;







	   public static final OCMaterial TEST = new OCMaterial ("test",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial IRON = new OCMaterial ("iron",ItemTier.IRON,6,1.6f,4.5F,1,4,1.2f,9,0.9f,3);
	   public static final OCMaterial COPPER = new OCMaterial ("copper",OCItemTier.COPPER,6,1.6f,4.5F,1,4,1.2f,9,0.9f,3);
	   public static final OCMaterial LEAD = new OCMaterial ("lead",OCItemTier.LEAD,6,1.6f,4.5F,1,4,1.2f,9,0.9f,3);
	   public static final OCMaterial NICKEL = new OCMaterial ("nickel",OCItemTier.NICKEL,6,1.6f,4.5F,1,4,1.2f,9,0.9f,3);
	   public static final OCMaterial TIN = new OCMaterial ("tin",OCItemTier.TIN,6,1.6f,4.5F,1,4,1.2f,9,0.9f,3);
	   public static final OCMaterial CENTERL = new OCMaterial ("centerl",OCItemTier.CENTERL,6,1,5,1,4,1.2f,9,0.9f,3.5f);
	   public static final OCMaterial SILVER = new OCMaterial ("silver",OCItemTier.SILVER,6,1.6f,4.5F,1,4,1.2f,9,1,1);
	   public static final OCMaterial PERMAFROST = new OCMaterial ("permafrost",OCItemTier.PERMAFROST,8,2,6.5F,1,6,1.2f,10,1.5f,5);
	   public static final OCMaterial FICTNIUM = new OCMaterial ("fictnium",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial RUBY = new OCMaterial ("ruby",OCItemTier.RUBY,6,1.6f,4.5F,1,4,1.2f,8,1,4);
	   public static final OCMaterial SAPPHIRE = new OCMaterial ("sapphire",OCItemTier.SAPPHIRE,6,1.6f,4.5F,1,4,1.2f,8,1,4);
	   public static final OCMaterial REALITE = new OCMaterial ("realite",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial GOLD = new OCMaterial ("gold",ItemTier.GOLD,4,1.6f,2.5F,1,2,1.2f,7,1,1);
	   public static final OCMaterial DIAMOND = new OCMaterial ("diamond",ItemTier.DIAMOND,7,1.6f,5.5F,1,5,1.2f,9,1,4);
	   public static final OCMaterial EMERALD = new OCMaterial ("emerald",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial REDSTONE = new OCMaterial ("redstone",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial QUARTZ = new OCMaterial ("quartz",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial COAL = new OCMaterial ("coal",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial LAPIS = new OCMaterial ("lapis",null,0,0,0,0,0,0,0,0,0);
	   public static final OCMaterial SECOND_GRILLED_BRICK = new OCMaterial ("sgb",OCItemTier.SECOND_GRILLED_BRICK,4,1.6f,2.5f,1,2,1.2f,9,0.8f,2);



	public OCMaterial(String name,IItemTier toolmatelia, int sworddamege, float swordspeed, float shoveldamege, float shovelspeed, int pickaxedamege, float pickaxespeed, int axedamege, float axespeed, float hoespeed) {
		this.materialname = name;
		this.SwordDamege = sworddamege;
		this.SwordSpeed = swordspeed;
		this.Toolmatelia = toolmatelia;
		this.ShovelDamege = shoveldamege;
		this.ShovelSpeed = shovelspeed;
		this.PickaxeDamege = pickaxedamege;
		this.PickaxeSpeed = pickaxespeed;
		this.AxeDamege = axedamege;
		this.AxeSpeed = axespeed;
		this.HoeSpeed = hoespeed;

	}

	public  String getMaterialName() {

		return materialname;

	}
	public  ITextComponent getTranslationKey() {

		ITextComponent name = new TextComponentTranslation("material."+materialname);

		return name;

	}
	public  int getSwordDamege() {
		return SwordDamege;
	}
	public  float getSwordSpeed() {
		return SwordSpeed;

	}
	public  IItemTier getToolmatelia() {
		return Toolmatelia;

	}
	public  float getShovelDamege() {
		return ShovelDamege;
	}
	public  float getShovelSpeed() {
		return ShovelSpeed;

	}

	public  int getPickaxeDamege() {
		return PickaxeDamege;
	}
	public  float getPickaxeSpeed() {
		return PickaxeSpeed;

	}
	public  int getAxeDamege() {
		return AxeDamege;
	}
	public  float getAxeSpeed() {
		return AxeSpeed;

	}
	public  float getHoeSpeed() {
		return HoeSpeed;

	}
}
