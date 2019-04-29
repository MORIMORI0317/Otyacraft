package otyacraft.items;

import net.minecraft.item.Item;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_ingot extends Item {


	public Item_ingot(String name) {
	        super();

	        this.setRegistryName(Variable.MODID, name+"_ingot");
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(name+"ingot");
	    }


	}