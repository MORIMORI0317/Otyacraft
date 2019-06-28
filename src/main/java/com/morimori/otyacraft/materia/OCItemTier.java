package com.morimori.otyacraft.materia;

import java.util.function.Supplier;

import com.morimori.otyacraft.items.MODItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

public enum OCItemTier implements IItemTier {
   COPPER(2, 250, 6.0F, 2.0F, 14, () -> {
      return Ingredient.fromItems(MODItems.COPPER_INGOT);
   }),
   RUBY(3, 1561, 8.0F, 3.0F, 10, () -> {
	      return Ingredient.fromItems(MODItems.RUBY);
   }),
   SAPPHIRE(3, 1561, 8.0F, 3.0F, 10, () -> {
	      return Ingredient.fromItems(MODItems.SAPPHIRE);
   }),
   CENTERL(2, 4683, 7.0F, 2.5F, 12, () -> {
	      return Ingredient.fromItems(MODItems.CENTERL_INGOT);
   }),
   PERMAFROST(4, 50, 9.0F, 4.0F, 20, () -> {
	      return Ingredient.fromItems(MODItems.PERMAFROST_INGOT);
   }),
   SECOND_GRILLED_BRICK(1, 100, 1.0F, 1.5F, 26, () -> {
	      return Ingredient.fromItems(MODItems.SECOND_GRILLED_BRICK);
   });

   private final int harvestLevel;
   private final int maxUses;
   private final float efficiency;
   private final float attackDamage;
   private final int enchantability;
   private final LazyLoadBase<Ingredient> repairMaterial;

   private OCItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
      this.harvestLevel = harvestLevelIn;
      this.maxUses = maxUsesIn;
      this.efficiency = efficiencyIn;
      this.attackDamage = attackDamageIn;
      this.enchantability = enchantabilityIn;
      this.repairMaterial = new LazyLoadBase<>(repairMaterialIn);
   }

   public int getMaxUses() {
      return this.maxUses;
   }

   public float getEfficiency() {
      return this.efficiency;
   }

   public float getAttackDamage() {
      return this.attackDamage;
   }

   public int getHarvestLevel() {
      return this.harvestLevel;
   }

   public int getEnchantability() {
      return this.enchantability;
   }

   public Ingredient getRepairMaterial() {
      return this.repairMaterial.getValue();
   }
}