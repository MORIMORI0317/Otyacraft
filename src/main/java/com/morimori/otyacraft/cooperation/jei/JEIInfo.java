package com.morimori.otyacraft.cooperation.jei;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.blocks.MODBlocks;
import com.morimori.otyacraft.items.MODItems;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.block.Blocks;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;

public class JEIInfo {
	public static void registerInfo(IRecipeRegistration registration) {

		nomal_register(registration,new ItemStack(MODItems.SECOND_GRILLED_BRICK));
		nomal_register(registration,new ItemStack(MODItems.RADEON_VII));
		nomal_register(registration,new ItemStack(MODBlocks.ORE_REACTOR_CORE));


		materia_objct_register(registration,new ItemStack(MODItems.IRON_PLATE),OCmaterialType.PLATE,OCMaterial.IRON,I18n.format(Blocks.IRON_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));
		materia_objct_register(registration,new ItemStack(MODItems.COPPER_PLATE),OCmaterialType.PLATE,OCMaterial.COPPER,I18n.format(MODBlocks.COPPER_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));
		materia_objct_register(registration,new ItemStack(MODItems.LEAD_PLATE),OCmaterialType.PLATE,OCMaterial.LEAD,I18n.format(MODBlocks.LEAD_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));
		materia_objct_register(registration,new ItemStack(MODItems.TIN_PLATE),OCmaterialType.PLATE,OCMaterial.TIN,I18n.format(MODBlocks.TIN_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));
		materia_objct_register(registration,new ItemStack(MODItems.NICKEL_PLATE),OCmaterialType.PLATE,OCMaterial.NICKEL,I18n.format(MODBlocks.NICKEL_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));
		materia_objct_register(registration,new ItemStack(MODItems.CENTERL_PLATE),OCmaterialType.PLATE,OCMaterial.CENTERL,I18n.format(MODBlocks.CENTERL_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));
		materia_objct_register(registration,new ItemStack(MODItems.FICTNIUM_PLATE),OCmaterialType.PLATE,OCMaterial.FICTNIUM,I18n.format(MODBlocks.FICTNIUM_BLOCK.getTranslationKey()),I18n.format(Blocks.STONECUTTER.getTranslationKey()));



	}
	public static void nomal_register(IRecipeRegistration registration,ItemStack item) {
		registration.addIngredientInfo(item, VanillaTypes.ITEM, Nomal_disply(Variable.MODID, item));
	}
	public static String getmaterial_object_Nomal_Name(String modname,String materialname) {

		return"gui."+modname+".jei_info."+materialname;
	}
	public static String getNomal_Name(String modname,ItemStack item) {

		return"gui."+modname+".jei_info."+item.getItem().getRegistryName().getPath();
	}
	public static String Nomal_disply(String modname,ItemStack item) {


		String dis;

		dis=I18n.format(item.getTranslationKey())+"\n\n"+I18n.format(getNomal_Name(Variable.MODID, item));

		return dis;

	}

	public static void objct_register(IRecipeRegistration registration,ItemStack item) {
		registration.addIngredientInfo(item, VanillaTypes.ITEM, Nomal_disply(Variable.MODID, item));
	}




	public static void materia_objct_register(IRecipeRegistration registration,ItemStack item,OCmaterialType material,OCMaterial materia,Object... object) {
		registration.addIngredientInfo(item, VanillaTypes.ITEM, materia_object_disply(Variable.MODID, item,materia.getTranslationKey().getString(),material, object));
	}



	public static String materia_object_disply(String modname,ItemStack item,String materia,OCmaterialType material,Object... object) {


		String dis;

		dis=I18n.format(item.getTranslationKey(),I18n.format(materia))+"\n\n"+I18n.format(getmaterial_object_Nomal_Name(Variable.MODID, material.getMaterialTypeName()),object);

		return dis;

	}


}

