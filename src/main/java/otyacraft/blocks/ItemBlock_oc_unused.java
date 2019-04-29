package otyacraft.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class ItemBlock_oc_unused extends ItemBlock {

	public ItemBlock_oc_unused(Block block) {
		super(block);



	}
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {

   	 tooltip.add(I18n.translateToLocalFormatted("tooltip.unused"));

    }



}
