package com.morimori.otyacraft.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemLightMeter  extends Item {

	public ItemLightMeter(Properties properties) {
		super(properties.defaultMaxDamage(1000));

	}
	   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		      ItemStack itemstack = playerIn.getHeldItem(handIn);




		      itemstack.damageItem(1,playerIn , (p_220045_0_) -> {
		          p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		      });

		      playerIn.getCooldownTracker().setCooldown(this, 10);

		      playerIn.sendStatusMessage(this.gettrans(worldIn,playerIn), true);


		         return new ActionResult<>(ActionResultType.SUCCESS, itemstack);

		   }




	   @OnlyIn(Dist.CLIENT)
	   public ITextComponent gettrans(World worldIn, PlayerEntity playerIn) {
		   BlockPos pos = playerIn.getPosition();

		   return new TranslationTextComponent("statemessege.lightlevel.name",worldIn.getLight(pos));
	   }

	   @Override
	public boolean isRepairable() {

		return true;
	}

	   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		      return Ingredient.fromItems(MODItems.DISPOSABLE_BATTERY).test(repair)|| super.getIsRepairable(toRepair, repair);
		   }
}
