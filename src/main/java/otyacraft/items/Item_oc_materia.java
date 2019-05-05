package otyacraft.items;

import net.minecraft.item.Item;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_oc_materia extends Item {


	public Item_oc_materia(String name,String tyape) {
	        super();





	        this.setRegistryName(Variable.MODID, name+"_"+tyape);
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(name+tyape);
	    }


	}