package otyacraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_needle extends Item {
	public Item_needle() {
        super();
    	this.setContainerItem(this);
        this.maxStackSize = 1;
        this.setRegistryName("needle");
        this.setUnlocalizedName("needle");
        this.setCreativeTab(OCCreativetabs.OCTAB);
    }
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {

   	 tooltip.add(I18n.translateToLocalFormatted("tooltip.returncrafting"));

    }

}
