package com.morimori.otyacraft.items;

import com.morimori.otyacraft.itemgroups.OCItemGroups;

import net.minecraft.item.Item;

public class ItemMachine extends Item {

	   boolean isUseMachine=true;

	public ItemMachine(Properties properties) {
		super(properties.group(OCItemGroups.OCTAB).maxStackSize(1));
	}



}
