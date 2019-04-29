package otyacraft.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import otyacraft.blocks.OCblocks;
import otyacraft.items.OCitems;

public class Smelt {

@SubscribeEvent
public static void registerRecipe() {

	GameRegistry.addSmelting(Items.BRICK,new ItemStack(OCitems.SECOND_GRILLED_BRICK),0.1f);
	GameRegistry.addSmelting(OCitems.TEA_LEAVES,new ItemStack(OCitems.TEA_LEAVES_POWDER),0.3f);
	GameRegistry.addSmelting(OCblocks.COPPER_ORE,new ItemStack(OCitems.COPPER_INGOT),0.3f);
	GameRegistry.addSmelting(OCblocks.TIN_ORE,new ItemStack(OCitems.TIN_INGOT),0.3f);
	GameRegistry.addSmelting(OCblocks.LEAD_ORE,new ItemStack(OCitems.LEAD_INGOT),0.3f);
	GameRegistry.addSmelting(OCblocks.NICKEL_ORE,new ItemStack(OCitems.NICKEL_INGOT),0.3f);
	GameRegistry.addSmelting(OCblocks.CENTERL_ORE,new ItemStack(OCitems.CENTERL_INGOT),0.3f);
	GameRegistry.addSmelting(OCblocks.FICTNIUM_ORE,new ItemStack(OCitems.FICTNIUM_INGOT),0.3f);
	GameRegistry.addSmelting(OCblocks.REALITE_ORE,new ItemStack(OCitems.REALITE),0.3f);
	GameRegistry.addSmelting(OCblocks.RUBY_ORE,new ItemStack(OCitems.RUBY),0.3f);
	GameRegistry.addSmelting(OCblocks.SAPPHIRE_ORE,new ItemStack(OCitems.SAPPHIRE),0.3f);
	GameRegistry.addSmelting(OCblocks.SILVER_ORE,new ItemStack(OCitems.SILVER_INGOT),0.3f);
	GameRegistry.addSmelting(OCitems.BROKEN_NEEDLE,new ItemStack(Items.IRON_NUGGET,2),0.3f);

}
}
