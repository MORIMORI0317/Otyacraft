package com.morimori.otyacraft.itemgroups;

import com.morimori.otyacraft.items.MODItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class OCItemGroups extends ItemGroup {


	public OCItemGroups(String label) {
		super(label);

	}

	public static final ItemGroup OCTAB = new OCItemGroups("otyacraft").setBackgroundImageName("otyacraft_item_search.png");
    @OnlyIn(Dist.CLIENT)
	public ItemStack createIcon() {

		return  new ItemStack(MODItems.TEA_AND_TEA_CUP);
	};

	   public boolean hasSearchBar() {
		      return true;
		   }

}
