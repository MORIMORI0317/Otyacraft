package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.item.ItemStack;
import net.minecraft.item.TieredItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemSameCraftingTool extends TieredItem {
	private OCmaterialType Mateliatype;
	private OCMaterial Matelia;


	public ItemSameCraftingTool(Properties properties,OCMaterial materoal,OCmaterialType tyape) {



		super(materoal.getTier(),properties.containerItem(MODItems.TEST_MORTAR));
		this.Mateliatype = tyape;
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
