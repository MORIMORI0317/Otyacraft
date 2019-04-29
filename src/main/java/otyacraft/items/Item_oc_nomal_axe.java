package otyacraft.items;

import net.minecraft.item.ItemAxe;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_oc_nomal_axe extends ItemAxe {

	public Item_oc_nomal_axe(String nameIn,ToolMaterial toolIn ,float damege,float speed) {
		super(toolIn, damege, speed);
	        this.setRegistryName(Variable.MODID, nameIn+"_axe");
	        this.setCreativeTab(OCCreativetabs.TOOL);
	        this.setUnlocalizedName(nameIn+"axe");
	    }


	}