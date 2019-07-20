package com.morimori.otyacraft.blocks.nomalblastfurnace;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.BlastFurnaceContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class NomalBlastFurnaceTileEntity extends AbstractFurnaceTileEntity {
   public NomalBlastFurnaceTileEntity() {
      super(TileEntityType.BLAST_FURNACE, IRecipeType.BLASTING);
   }

   protected ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.test_blast_furnace");
   }

   protected int getBurnTime(ItemStack p_213997_1_) {
      return super.getBurnTime(p_213997_1_) / 2;
   }

   protected Container createMenu(int p_213906_1_, PlayerInventory p_213906_2_) {
      return new BlastFurnaceContainer(p_213906_1_, p_213906_2_, this, this.field_214013_b);
   }
}