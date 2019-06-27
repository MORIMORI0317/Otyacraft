package com.morimori.otyacraft.cooperation.jei;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.items.MODItems;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;

public class JEIInfo {
	public static void registerInfo(IRecipeRegistration registration) {

		register(registration,new ItemStack(MODItems.SECOND_GRILLED_BRICK));
		register(registration,new ItemStack(MODItems.RADEON_VII));
	}
	public static void register(IRecipeRegistration registration,ItemStack item) {
		registration.addIngredientInfo(item, VanillaTypes.ITEM, getName(Variable.MODID, item));
	}
	public static String getName(String modname,ItemStack item) {

		return "gui."+modname+".jei_info."+item.getItem().getRegistryName().getPath();
	}
}
