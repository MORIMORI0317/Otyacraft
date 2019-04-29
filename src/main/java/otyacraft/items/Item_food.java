package otyacraft.items;

import net.minecraft.item.ItemFood;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_food extends ItemFood {
	public Item_food(int amount, float saturation, boolean isWolfFood ,String Rname ,String Uname) {
	        super(amount, saturation, isWolfFood);
	        this.setRegistryName(Variable.MODID, Rname);
	        this.setCreativeTab(OCCreativetabs.FOOD);
	        this.setUnlocalizedName(Uname);
	    }
	}