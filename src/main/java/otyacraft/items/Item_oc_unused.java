package otyacraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class Item_oc_unused extends Item {

	public Item_oc_unused() {
	        super();

	    }
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {

   	 tooltip.add(I18n.translateToLocalFormatted("tooltip.unused"));

    }
}
