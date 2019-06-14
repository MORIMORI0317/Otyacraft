package otyacraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_silver_apple extends ItemAppleGold {
	public Item_silver_apple(int amount, float saturation, boolean isWolfFood) {
	        super(amount, saturation, isWolfFood);
	        this.setRegistryName(Variable.MODID, "silver_apple");
	        this.setCreativeTab(OCCreativetabs.OCTAB);
	        this.setUnlocalizedName("silverapple");
	        this.setAlwaysEdible();

	    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if (stack.getMetadata() == 1)
        {
   	 tooltip.add(I18n.translateToLocalFormatted("tooltip.old"));
        }
    }
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
        }
    }
	}