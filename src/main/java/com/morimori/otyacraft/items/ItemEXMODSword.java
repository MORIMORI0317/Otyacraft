package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCItemTier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityDrowned;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tags.ItemTags;

public class ItemEXMODSword extends ItemSword {

	public ItemEXMODSword() {
		super(OCItemTier.COPPER, 0, 10f-4, (new Item.Properties()).group(OCItemGroups.OCTAB));
		this.setRegistryName(Variable.MODID,"excalibur_modoki");
	}

	   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		      return ItemTags.FISHES.contains(repair.getItem()) || super.getIsRepairable(toRepair, repair);
		   }
	   public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		      stack.damageItem(1, attacker);
		      if (target.isInWater()) {
		    	  if (target.getEntity()!=new EntityDrowned(null)) {
		      target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 400, 0));
		      target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 60, 10));
		    	  }

		  	}
		      if (attacker.isInWater()) {

		      attacker.addPotionEffect(new PotionEffect(MobEffects.CONDUIT_POWER, 400, 0));
		      attacker.addPotionEffect(new PotionEffect(MobEffects.DOLPHINS_GRACE, 400, 0));

	  	}

		      return true;
		   }

}
