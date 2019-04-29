package otyacraft.items;

import net.minecraft.item.Item;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_oc_nomal extends Item {
	public Item_oc_nomal(String Rname,String namein ) {
	        super();
	        this.setRegistryName(Variable.MODID, Rname);
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(namein);
	    }
	}