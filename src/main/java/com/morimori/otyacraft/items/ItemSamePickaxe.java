package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemSamePickaxe extends PickaxeItem {
	private OCmaterialType Mateliatype;
	private OCMaterial Matelia;

	public ItemSamePickaxe(Properties properties,OCMaterial materoal) {
		super(materoal.getTier(),  1, -2.8F,properties);
		this.Mateliatype = OCmaterialType.PICKAXE;
		this.Matelia = materoal;

		this.setRegistryName(Variable.MODID,materoal.getMaterialName()+"_"+this.Mateliatype.getMaterialTypeName());

	    }

	   @OnlyIn(Dist.CLIENT)
		public ITextComponent getDisplayName(ItemStack stack) {
		      return new TranslationTextComponent(this.getTranslationKey(stack),Matelia.getTranslationKey());
		   }


	   public String getTranslationKey() {


		      return "item."+this.Mateliatype.getMaterialTypeName()+".loacl";
		   }
	}