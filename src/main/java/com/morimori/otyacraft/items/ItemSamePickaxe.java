package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemSamePickaxe extends ItemPickaxe {

	private OCmaterialType Mateliatype;
	private OCMaterial Matelia;

	public ItemSamePickaxe(OCMaterial materoal ,OCmaterialType materialtype) {
		super(materoal.getToolmatelia(), materoal.getPickaxeDamege()-3, materoal.getPickaxeSpeed()-4, (new Item.Properties()).group(OCItemGroups.OCTAB));
		this.Mateliatype = materialtype;
		this.Matelia = materoal;

		this.setRegistryName(Variable.MODID,materoal.getMaterialName()+"_"+materialtype.getMaterialTypeName());

	    }

	   @OnlyIn(Dist.CLIENT)
		public ITextComponent getDisplayName(ItemStack stack) {
		      return new TextComponentTranslation(this.getTranslationKey(stack),Matelia.getTranslationKey());
		   }


	   public String getTranslationKey() {


		      return "item."+this.Mateliatype.getMaterialTypeName()+".loacl";
		   }
	}