package otyacraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import otyacraft.blocks.OCblocks;
import otyacraft.items.OCitems;

public class OCCreativetabs extends CreativeTabs {


	public int iconID;
	public String moto;
	public static final CreativeTabs BUILDING= new OCCreativetabs("otyacraft_buildingblocks_tab",1,"itemGroup.buildingBlocks");
    public static final CreativeTabs FOOD = new OCCreativetabs("otyacraft_food_tab",2,"itemGroup.food");
    public static final CreativeTabs MISC = new OCCreativetabs("otyacraft_miscellaneous_tab",3,"itemGroup.misc");
    public static final CreativeTabs TOOL = new OCCreativetabs("otyacraft_tool_tab",4,"itemGroup.tools");

    public OCCreativetabs(String name,int iconid,String moto) {
		super(name);
		this.iconID = iconid;
		this.moto = moto;

		 System.out.println("Hello Otyacraft!!="+iconID);
	}

    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return I18n.translateToLocalFormatted("itemGroup.otyacraft",I18n.translateToLocal(moto).trim());
    }


    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem()
    {
    	switch (this.iconID){
    	case 1:
        return new ItemStack(OCblocks.SECOND_GRILLED_BRICK_BLOCK);
		case 2:
		return new ItemStack(OCitems.TEA_AND_TEA_CUP);
		case 3:
		return new ItemStack(OCitems.SECOND_GRILLED_BRICK);
		case 4:
		return new ItemStack(OCitems.SECOND_GRILLED_BRICK_SWORD);
    	}
    	return null;

    }



}