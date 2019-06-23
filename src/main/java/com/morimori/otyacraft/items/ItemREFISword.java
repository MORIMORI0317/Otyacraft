package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCItemTier;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.Ingredient;

public class ItemREFISword extends ItemSword {

	public ItemREFISword() {
		super(OCItemTier.CENTERL, 11, 1.6f-4, (new Item.Properties()).group(OCItemGroups.OCTAB));
		this.setRegistryName(Variable.MODID,"refi_sword");
	}

	   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		      return Ingredient.fromItems(OCItems.REALITE).test(repair) ||Ingredient.fromItems(OCItems.FICTNIUM_INGOT).test(repair) || super.getIsRepairable(toRepair, repair);
		   }


}
