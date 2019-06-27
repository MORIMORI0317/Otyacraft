package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;


public class ItemBlockSame extends BlockItem {

	public OCMaterial matelia;
	public OCmaterialType mateliatype;

	public ItemBlockSame(Block blockIn, Properties builder,OCMaterial materoal ,OCmaterialType materialtype) {
		super(blockIn, builder);
		this.matelia = materoal;
		this.mateliatype=materialtype;
		this.setRegistryName(Variable.MODID, materoal.getMaterialName()+"_"+materialtype.getMaterialTypeName());
	}
	public ITextComponent getDisplayName(ItemStack stack) {
		      return new TranslationTextComponent(this.getTranslationKey(stack),matelia.getTranslationKey());
		   }
}
