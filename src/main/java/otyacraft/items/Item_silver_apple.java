package otyacraft.items;

import net.minecraft.item.ItemAppleGold;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_silver_apple extends ItemAppleGold {
	public Item_silver_apple(int amount, float saturation, boolean isWolfFood) {
	        super(amount, saturation, isWolfFood);
	        this.setRegistryName(Variable.MODID, "silver_apple");
	        this.setCreativeTab(OCCreativetabs.FOOD);
	        this.setUnlocalizedName("silverapple");
	        this.setAlwaysEdible();

	    }


	}