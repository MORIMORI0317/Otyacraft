package com.morimori.otyacraft.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemBlockinformationdetector  extends Item {

	public ItemBlockinformationdetector(Properties properties) {
		super(properties.defaultMaxDamage(1000));

	}
	   public ActionResultType onItemUse(ItemUseContext context) {

		      World worldIn = context.getWorld();
		      PlayerEntity playerIn = context.getPlayer();
		      Hand handIn =context.getHand();

		      ItemStack itemstack = playerIn.getHeldItem(handIn);

		      if (!worldIn.isRemote) {
		      itemstack.damageItem(1,playerIn , (p_220045_0_) -> {
		          p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		      });

		      playerIn.getCooldownTracker().setCooldown(this, 30);

		      playerIn.sendMessage(new TranslationTextComponent("item.otyacraft.block_information_detector"));

		      playerIn.sendMessage(new TranslationTextComponent("Pos X%s  Y%s  Z%s",context.getPos().getX(),context.getPos().getY(),context.getPos().getZ()));

		      playerIn.sendMessage(new TranslationTextComponent("Name %s",worldIn.getBlockState(context.getPos()).getBlock().getNameTextComponent()));

		      playerIn.sendMessage(new TranslationTextComponent("ID %s",worldIn.getBlockState(context.getPos()).getBlock().getRegistryName()));

		      playerIn.sendMessage(new TranslationTextComponent("Tag %s",worldIn.getBlockState(context.getPos()).getBlock().getTags()));




		      }
		         return ActionResultType.SUCCESS;

		   }




	   @OnlyIn(Dist.CLIENT)
	   public ITextComponent gettrans(World worldIn, PlayerEntity playerIn,ItemUseContext context) {

		   return new TranslationTextComponent("pos="+context.getPos());
	   }

	   @Override
	public boolean isRepairable() {

		return true;
	}

	   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		      return Ingredient.fromItems(MODItems.DISPOSABLE_BATTERY).test(repair)|| super.getIsRepairable(toRepair, repair);
		   }
}
