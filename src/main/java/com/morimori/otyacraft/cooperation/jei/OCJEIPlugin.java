package com.morimori.otyacraft.cooperation.jei;

import com.morimori.otyacraft.Variable;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.util.ResourceLocation;
@JeiPlugin
public class OCJEIPlugin implements IModPlugin {

	@Override
	public void registerRecipes(IRecipeRegistration registration)
	{
		JEIInfo.registerInfo(registration);
	}


	@Override
	public ResourceLocation getPluginUid() {

		return new ResourceLocation(Variable.MODID, Variable.MODID);
	}

}
