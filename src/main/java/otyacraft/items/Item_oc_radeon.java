package otyacraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.translation.I18n;

public class Item_oc_radeon extends Item_oc_nomal {


	public Item_oc_radeon(String Rname ) {
	        super(Rname,null);
	        this.setHasSubtypes(true);
	        this.maxStackSize = 1;

	    }
    public EnumRarity getRarity(ItemStack stack)
    {
        return stack.getMetadata() == 0 ? EnumRarity.RARE : EnumRarity.EPIC;
    }
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
            items.add(new ItemStack(this, 1, 1));
        }
    }

    public String getUnlocalizedNameInefficiently(ItemStack stack)
    {
        if (stack.getMetadata() == 0)
        {
        return I18n.translateToLocal("item."+"radeonvii");
        }
        else
        {
        return I18n.translateToLocal("item."+"radeonprov340");
        }

    }



	}