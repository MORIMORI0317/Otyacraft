package com.morimori.otyacraft.items;

import net.minecraft.item.ItemAppleGoldEnchanted;

public class ItemEnchantedSilverApple extends ItemAppleGoldEnchanted {

	public ItemEnchantedSilverApple(Properties properties) {
		super(4, 0.3F, false, properties);

        this.setAlwaysEdible();
	}

}
