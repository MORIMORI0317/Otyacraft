package otyacraft.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
public class Item_oc_nomal_armor extends ItemArmor {

	public Item_oc_nomal_armor(String UnlocalizedName,String name,ArmorMaterial materialIn,int layer,EntityEquipmentSlot basyo) {
		super(materialIn, layer, basyo);
	        this.setRegistryName(Variable.MODID, name);
	        this.setCreativeTab(OCCreativetabs.OCTAB);
	        this.setUnlocalizedName(UnlocalizedName);
	    }


	}