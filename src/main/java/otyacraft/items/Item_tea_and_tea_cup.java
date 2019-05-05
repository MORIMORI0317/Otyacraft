package otyacraft.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_tea_and_tea_cup extends ItemFood {
	public Item_tea_and_tea_cup(int amount, float saturation, boolean isWolfFood ,String Rname ,String Uname) {
	        super(amount, saturation, isWolfFood);
	        this.setRegistryName(Variable.MODID, Rname);
	        this.setCreativeTab(OCCreativetabs.FOOD);
	        this.setUnlocalizedName(Uname);
	        this.setMaxStackSize(1);
	        this.setAlwaysEdible();
	    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(OCitems.TEA_CUP);
    }
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
        		player.sendMessage(new TextComponentString(player.getName()+":"));
        		player.sendMessage(new TextComponentString(I18n.translateToLocal("messege.goodwether.name").trim()));
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 400, 0));


        }
    }

	}