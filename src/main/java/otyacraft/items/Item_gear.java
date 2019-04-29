package otyacraft.items;

import net.minecraft.item.Item;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_gear extends Item {
	public Item_gear(String name) {
	        super();
	        this.setRegistryName(Variable.MODID, name+"_gear");
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(name+"gear");
	    }
	}