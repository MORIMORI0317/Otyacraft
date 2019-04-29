package otyacraft.items;

import net.minecraft.item.ItemSpade;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_oc_nomal_shovel extends ItemSpade {

	public Item_oc_nomal_shovel(String nameIn,ToolMaterial toolIn) {
		super(toolIn);
	        this.setRegistryName(Variable.MODID, nameIn+"_shovel");
	        this.setCreativeTab(OCCreativetabs.TOOL);
	        this.setUnlocalizedName(nameIn+"shovel");
	    }


	}