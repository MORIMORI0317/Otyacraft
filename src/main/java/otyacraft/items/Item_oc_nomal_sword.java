package otyacraft.items;

import net.minecraft.item.ItemSword;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_oc_nomal_sword extends ItemSword {
	public Item_oc_nomal_sword(String nameIn,ToolMaterial toolIn) {
		super(toolIn);
	        this.setRegistryName(Variable.MODID, nameIn+"_sword");
	        this.setCreativeTab(OCCreativetabs.TOOL);
	        this.setUnlocalizedName(nameIn+"sword");
	    }


	}