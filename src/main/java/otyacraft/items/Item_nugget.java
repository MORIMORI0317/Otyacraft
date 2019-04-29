package otyacraft.items;

import net.minecraft.item.Item;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_nugget extends Item {
	public Item_nugget(String name) {
	        super();
	        this.setRegistryName(Variable.MODID, name+"_nugget");
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(name+"nugget");
	    }
	}