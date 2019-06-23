package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;

import net.minecraft.item.Item;

public class Item_gear extends Item {
	public Item_gear(Properties properties,String matelianame ) {
		super(properties);
		this.setRegistryName(Variable.MODID,matelianame+"_gear");
	}


}
