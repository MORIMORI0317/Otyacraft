package com.morimori.otyacraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Item_usetooltip extends Item{

	public Item_usetooltip(Properties properties) {
		super(properties);

	}

	   @OnlyIn(Dist.CLIENT)
	   public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		   tooltip.add(this.getToolDescription().applyTextStyle(TextFormatting.GRAY));
	   }


	   public ITextComponent getToolDescription() {
	      return new TranslationTextComponent("tooltip."+this.getTranslationKey() + ".name");
	   }



}
