package com.morimori.otyacraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemLightMeter extends Item {

	public ItemLightMeter(Properties properties) {
		super(properties.defaultMaxDamage(1000));




	}

	   public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		      ItemStack itemstack = playerIn.getHeldItem(handIn);


		      itemstack.damageItem(1, playerIn);
		      playerIn.sendStatusMessage(this.gettrans(worldIn,playerIn), true);


		         return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);

		   }
	   @OnlyIn(Dist.CLIENT)
	   public ITextComponent gettrans(World worldIn, EntityPlayer playerIn) {
		   BlockPos pos = playerIn.getPosition();

		   return new TextComponentTranslation("statemessege.lightlevel.name",worldIn.getLight(pos));
	   }

	   @Override
	public boolean isRepairable() {

		return true;
	}

	   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		      return Ingredient.fromItems(OCItems.DISPOSABLE_BATTERY).test(repair)|| super.getIsRepairable(toRepair, repair);
		   }
}

