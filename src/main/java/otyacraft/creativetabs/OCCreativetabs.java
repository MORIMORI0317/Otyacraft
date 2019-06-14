package otyacraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import otyacraft.items.OCitems;

public class OCCreativetabs extends CreativeTabs{


    public static final CreativeTabs OCTAB = new OCCreativetabs("otyacraft").setBackgroundImageName("otyacraft_item_search.png");


    public OCCreativetabs(String name) {
		super(name);


	}


    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem()
    {



    	return new ItemStack(OCitems.TEA_AND_TEA_CUP);
    }

    public boolean hasSearchBar()
    {
        return true;
    }

}