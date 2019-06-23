package com.morimori.otyacraft.items;

import net.minecraft.item.ItemAppleGold;

public class ItemSilverApple extends ItemAppleGold {

	public ItemSilverApple(Properties properties) {
		super(4, 0.3F, false, properties);

        this.setAlwaysEdible();
	}

}
