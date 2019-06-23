package com.morimori.otyacraft.items;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemTeaYunomi extends ItemFood {

	Random rndam = new Random();

	public ItemTeaYunomi(Properties properties) {
		super(4, 0.3F, false, properties);

        this.setAlwaysEdible();
	}
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(OCItems.TEA_CUP);
    }
    public EnumAction getUseAction(ItemStack stack) {
        return EnumAction.DRINK;
     }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {

        	if(rndam.nextInt(99)==1) {
        		player.sendMessage(this.getgodtea());
        	}
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 400, 0));


        }
    }


	   @OnlyIn(Dist.CLIENT)
	   public ITextComponent getgodtea() {
	      return new TextComponentTranslation("messege.goodwether.name");
	   }
}
