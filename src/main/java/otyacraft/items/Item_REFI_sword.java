package otyacraft.items;

import net.minecraft.item.ItemSword;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_REFI_sword extends ItemSword {
	public Item_REFI_sword() {
		super(OCToolMaterial.REFI);
	        this.setRegistryName(Variable.MODID,"refi_sword");
	        this.setCreativeTab(OCCreativetabs.TOOL);
	        this.setUnlocalizedName("refisword");
	    }


	}