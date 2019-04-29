package otyacraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_second_grilled_brick extends Item {
	public Item_second_grilled_brick() {
	        super();
	        this.setRegistryName(Variable.MODID, "second_grilled_brick");
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName("secondgrilledbrick");
	    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {


   	 tooltip.add(I18n.translateToLocal("tooltip.Second_grilled_brick.name"));
    }
	}