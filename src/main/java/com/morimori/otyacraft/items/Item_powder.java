package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;

import net.minecraft.item.Item;

public class Item_powder extends Item {

	public Item_powder(Properties properties, String matelianame) {
		super(properties);
		this.setRegistryName(Variable.MODID,matelianame+"_powder");
	}

}
