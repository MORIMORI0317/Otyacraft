package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;

import net.minecraft.item.Item;

public class Item_nugget extends Item {
	public Item_nugget(Properties properties,String matelianame ) {
		super(properties);
		this.setRegistryName(Variable.MODID,matelianame+"_nugget");
	}


}
