package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.block.Block;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockSame extends Block   {


	public OCMaterial matelia;
	public OCmaterialType mateliatype;

	public BlockSame(OCMaterial materoal ,OCmaterialType materialtype,float hardnese, float Resistce) {
		super(Block.Properties.create(materialtype.getMaterialMaterial()).hardnessAndResistance(hardnese, Resistce).sound(materialtype.getMaterialsound()));
		this.matelia = materoal;
		this.mateliatype = materialtype;
		this.setRegistryName(Variable.MODID,materoal.getMaterialName()+"_"+this.mateliatype.getMaterialTypeName());

	}


	   @OnlyIn(Dist.CLIENT)
	   public ITextComponent getNameTextComponent() {
	      return new TextComponentTranslation(this.getTranslationKey()+matelia.getTranslationKey());
	   }


	   public String getTranslationKey() {


	      return "block."+this.mateliatype.getMaterialTypeName()+".loacl";
	   }


}

