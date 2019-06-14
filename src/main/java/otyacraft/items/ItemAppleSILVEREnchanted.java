package otyacraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class ItemAppleSILVEREnchanted extends ItemFood {
    public ItemAppleSILVEREnchanted(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(Variable.MODID, "enchanted_silver_apple");
        this.setCreativeTab(OCCreativetabs.OCTAB);
        this.setUnlocalizedName("silverapple");
        this.setAlwaysEdible();
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {

                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));

    }
}
