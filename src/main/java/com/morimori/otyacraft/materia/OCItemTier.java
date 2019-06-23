package com.morimori.otyacraft.materia;

import java.util.function.Supplier;

import com.morimori.otyacraft.items.OCItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

public enum OCItemTier implements IItemTier {
   COPPER(2, 250, 6.0F, 2.0F, 14, () -> {
      return Ingredient.fromItems(OCItems.COPPER_INGOT);
   }),
   TIN(2, 250, 6.0F, 2.0F, 14, () -> {
	      return Ingredient.fromItems(OCItems.TIN_INGOT);
	   }),
   LEAD(2, 250, 6.0F, 2.0F, 14, () -> {
	      return Ingredient.fromItems(OCItems.LEAD_INGOT);
	   }),
   NICKEL(2, 250, 6.0F, 2.0F, 14, () -> {
	      return Ingredient.fromItems(OCItems.NICKEL_INGOT);
	   }),
   CENTERL(2, 1500, 6.0F, 2.0F, 14, () -> {
	      return Ingredient.fromItems(OCItems.CENTERL_INGOT);
	   }),
   PERMAFROST(2, 100, 6.0F, 2.0F, 14, () -> {
	      return Ingredient.fromItems(OCItems.PERMAFROST_INGOT);
	   }),
   RUBY(3, 1561, 8.0F, 3.0F, 10, () -> {
      return Ingredient.fromItems(OCItems.RUBY);
 		}),
   SAPPHIRE(3, 1561, 8.0F, 3.0F, 10, () -> {
	      return Ingredient.fromItems(OCItems.SAPPHIRE);
	   }),
   SECOND_GRILLED_BRICK(3, 100, 8.0F, 3.0F, 10, () -> {
	      return Ingredient.fromItems(OCItems.SECOND_GRILLED_BRICK);
	   }),
   SILVER(0, 32, 12.0F, 0.0F, 22, () -> {
      return Ingredient.fromItems(OCItems.SILVER_INGOT);
   });


   /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
   private final int harvestLevel;
   /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
   private final int maxUses;
   /** The strength of this tool material against blocks which it is effective against. */
   private final float efficiency;
   /** Damage versus entities. */
   private final float attackDamage;
   /** Defines the natural enchantability factor of the material. */
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