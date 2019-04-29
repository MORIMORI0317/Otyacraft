package otyacraft.items;

import net.minecraft.item.ItemHoe;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_oc_nomal_hoe extends ItemHoe {

	public Item_oc_nomal_hoe(String nameIn,ToolMaterial toolIn) {
		super(toolIn);

	        this.setRegistryName(Variable.MODID, nameIn+"_hoe");
	        this.setCreativeTab(OCCreativetabs.TOOL);
	        this.setUnlocalizedName(nameIn+"hoe");
	    }


	}