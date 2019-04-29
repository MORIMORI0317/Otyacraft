package otyacraft.items;

import net.minecraft.item.Item;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_gem extends Item {
	public Item_gem(String name) {
	        super();
	        this.setRegistryName(Variable.MODID, name);
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(name);
	    }
	}