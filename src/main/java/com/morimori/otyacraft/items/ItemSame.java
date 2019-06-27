package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemSame extends Item {

	public OCMaterial matelia;
	public OCmaterialType mateliatype;


	public ItemSame(Properties properties, OCMaterial materoal, OCmaterialType materialtype) {
		super(properties);

		this.matelia = materoal;
		this.mateliatype = materialtype;



		this.setRegistryName(Variable.MODID,materoal.getMaterialName()+"_"+this.mateliatype.getMaterialTypeName());

	}

	   @OnlyIn(Dist.CLIENT)
		public ITextComponent getDisplayName(ItemStack stack) {
		      return new TranslationTextComponent(this.getTranslationKey(stack),matelia.getTranslationKey());
		   }


	   public String getTranslationKey() {


	      return "item."+this.mateliatype.getMaterialTypeName()+".loacl";
	   }
}
