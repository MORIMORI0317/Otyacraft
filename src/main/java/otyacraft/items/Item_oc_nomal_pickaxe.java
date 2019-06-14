package otyacraft.items;

import net.minecraft.item.ItemPickaxe;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_oc_nomal_pickaxe extends ItemPickaxe {

	public Item_oc_nomal_pickaxe(String nameIn,ToolMaterial toolIn) {
		super(toolIn);
	        this.setRegistryName(Variable.MODID, nameIn+"_pickaxe");
	        this.setCreativeTab(OCCreativetabs.OCTAB);
	        this.setUnlocalizedName(nameIn+"pickaxe");
	    }


	}