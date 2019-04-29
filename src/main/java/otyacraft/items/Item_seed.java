package otyacraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_seed extends ItemSeeds {
	private Block soils;

	public Item_seed(Block nae ,Block soil,String nameIn) {
	        super(nae, soil);
	        this.soils =soil;
	        this.setRegistryName(Variable.MODID, nameIn+"_seed");
	        this.setCreativeTab(OCCreativetabs.MISC);
	        this.setUnlocalizedName(nameIn+"seed");
	    }

    @SideOnly(Side.CLIENT)
    public String seed_soil()
    {
        return I18n.translateToLocal(this.soils.getUnlocalizedName() + ".name").trim();
    }
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {

   	 tooltip.add(I18n.translateToLocalFormatted("tooltip.seed.soil",this.seed_soil()));

    }
	}