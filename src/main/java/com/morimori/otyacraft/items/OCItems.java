package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.blocks.OCBlocks;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class OCItems {

    public static final Item TEST = new Item(new Item.Properties()).setRegistryName(Variable.MODID,"test_item");
    public static final Item SECOND_GRILLED_BRICK = new Item_usetooltip(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"second_grilled_brick");
    public static final Item COPPER_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.INGOT);
    public static final Item TIN_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.INGOT);
    public static final Item LEAD_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.INGOT);
    public static final Item NICKEL_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.INGOT);
    public static final Item SILVER_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.INGOT);
    public static final Item PERMAFROST_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.PERMAFROST,OCmaterialType.INGOT);
    public static final Item CENTERL_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.INGOT);
    public static final Item FICTNIUM_INGOT = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.FICTNIUM,OCmaterialType.INGOT);
    public static final Item RUBY = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"ruby");
    public static final Item SAPPHIRE = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"sapphire");
    public static final Item REALITE = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"realite");
    public static final Item COPPER_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.NUGGET);
    public static final Item TIN_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.NUGGET);
    public static final Item LEAD_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.NUGGET);
    public static final Item NICKEL_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.NUGGET);
    public static final Item SILVER_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.NUGGET);
    public static final Item CENTERL_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.NUGGET);
    public static final Item IRON_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.IRON,OCmaterialType.GEAR);
    public static final Item COPPER_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.GEAR);
    public static final Item TIN_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.GEAR);
    public static final Item LEAD_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.GEAR);
    public static final Item NICKEL_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.GEAR);
    public static final Item CENTERL_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.GEAR);
    public static final Item SILVER_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.GEAR);
    public static final Item PERMAFROST_POWDER = new Item_powder(new Item.Properties().group(OCItemGroups.OCTAB),"permafrost");
    public static final Item TEA_LEAVES_POWDER = new Item_powder(new Item.Properties().group(OCItemGroups.OCTAB),"tea_leaves");
    public static final Item TEA_LEAVES = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_leaves");
    public static final Item TEA_CUP = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_cup");
    public static final Item TEA_FLOWER = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_flower");
    public static final Item RADEON_VII = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"radeon_vii");
    public static final Item RADEON_PRO_V340 = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"radeon_pro_v340");
    public static final Item NEEDLE = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"needle");
    public static final Item OTYACRFT_DICTIONARY = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"oc_dictionary");
    public static final Item TEA_AND_YUNOMI = new ItemTeaYunomi(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"tea_and_tea_cup");
    public static final Item SILVER_APPLE = new ItemSilverApple(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"silver_apple");
    public static final Item ENCHANTED_SILVER_APPLE = new ItemEnchantedSilverApple(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"enchanted_golden_apple");
    public static final Item LIGHT_METER = new ItemLightMeter(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"light_meter");
    public static final Item LENS = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"lens");
    public static final Item CIRCUIT_BOARD = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"circuit_board");
    public static final Item ANALOG_METER = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"analog_meter");
    public static final Item DISPOSABLE_BATTERY = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"disposable_battery");
    public static final Item SECOND_GRILLED_BRICK_SWORD = new ItemSameSword(OCMaterial.SECOND_GRILLED_BRICK,OCmaterialType.SWORD);
    public static final Item COPPER_SWORD = new ItemSameSword(OCMaterial.COPPER,OCmaterialType.SWORD);
    public static final Item TIN_SWORD = new ItemSameSword(OCMaterial.TIN,OCmaterialType.SWORD);
    public static final Item LEAD_SWORD = new ItemSameSword(OCMaterial.LEAD,OCmaterialType.SWORD);
    public static final Item NICKEL_SWORD = new ItemSameSword(OCMaterial.NICKEL,OCmaterialType.SWORD);
    public static final Item RUBY_SWORD = new ItemSameSword(OCMaterial.RUBY,OCmaterialType.SWORD);
    public static final Item SAPPHIRE_SWORD = new ItemSameSword(OCMaterial.SAPPHIRE,OCmaterialType.SWORD);
    public static final Item SILVER_SWORD = new ItemSameSword(OCMaterial.SILVER,OCmaterialType.SWORD);
    public static final Item CENTERL_SWORD = new ItemSameSword(OCMaterial.CENTERL,OCmaterialType.SWORD);
    public static final Item PERMAFROST_SWORD = new ItemSameSword(OCMaterial.PERMAFROST,OCmaterialType.SWORD);
    public static final Item SECOND_GRILLED_BRICK_SHOVEL = new ItemSameShovel(OCMaterial.SECOND_GRILLED_BRICK,OCmaterialType.SHOVEL);
    public static final Item COPPER_SHOVEL = new ItemSameShovel(OCMaterial.COPPER,OCmaterialType.SHOVEL);
    public static final Item TIN_SHOVEL = new ItemSameShovel(OCMaterial.TIN,OCmaterialType.SHOVEL);
    public static final Item LEAD_SHOVEL = new ItemSameShovel(OCMaterial.LEAD,OCmaterialType.SHOVEL);
    public static final Item NICKEL_SHOVEL = new ItemSameShovel(OCMaterial.NICKEL,OCmaterialType.SHOVEL);
    public static final Item RUBY_SHOVEL = new ItemSameShovel(OCMaterial.RUBY,OCmaterialType.SHOVEL);
    public static final Item SAPPHIRE_SHOVEL = new ItemSameShovel(OCMaterial.SAPPHIRE,OCmaterialType.SHOVEL);
    public static final Item SILVER_SHOVEL = new ItemSameShovel(OCMaterial.SILVER,OCmaterialType.SHOVEL);
    public static final Item CENTERL_SHOVEL = new ItemSameShovel(OCMaterial.CENTERL,OCmaterialType.SHOVEL);
    public static final Item PERMAFROST_SHOVEL = new ItemSameShovel(OCMaterial.PERMAFROST,OCmaterialType.SHOVEL);
    public static final Item SECOND_GRILLED_BRICK_PICKAXE = new ItemSamePickaxe(OCMaterial.SECOND_GRILLED_BRICK,OCmaterialType.PICKAXE);
    public static final Item COPPER_PICKAXE = new ItemSamePickaxe(OCMaterial.COPPER,OCmaterialType.PICKAXE);
    public static final Item TIN_PICKAXE = new ItemSamePickaxe(OCMaterial.TIN,OCmaterialType.PICKAXE);
    public static final Item LEAD_PICKAXE = new ItemSamePickaxe(OCMaterial.LEAD,OCmaterialType.PICKAXE);
    public static final Item NICKEL_PICKAXE = new ItemSamePickaxe(OCMaterial.NICKEL,OCmaterialType.PICKAXE);
    public static final Item RUBY_PICKAXE = new ItemSamePickaxe(OCMaterial.RUBY,OCmaterialType.PICKAXE);
    public static final Item SAPPHIRE_PICKAXE = new ItemSamePickaxe(OCMaterial.SAPPHIRE,OCmaterialType.PICKAXE);
    public static final Item SILVER_PICKAXE = new ItemSamePickaxe(OCMaterial.SILVER,OCmaterialType.PICKAXE);
    public static final Item CENTERL_PICKAXE = new ItemSamePickaxe(OCMaterial.CENTERL,OCmaterialType.PICKAXE);
    public static final Item PERMAFROST_PICKAXE = new ItemSamePickaxe(OCMaterial.PERMAFROST,OCmaterialType.PICKAXE);
    public static final Item SECOND_GRILLED_BRICK_AXE = new ItemSameAxe(OCMaterial.SECOND_GRILLED_BRICK,OCmaterialType.AXE);
    public static final Item COPPER_AXE = new ItemSameAxe(OCMaterial.COPPER,OCmaterialType.AXE);
    public static final Item TIN_AXE = new ItemSameAxe(OCMaterial.TIN,OCmaterialType.AXE);
    public static final Item LEAD_AXE = new ItemSameAxe(OCMaterial.LEAD,OCmaterialType.AXE);
    public static final Item NICKEL_AXE = new ItemSameAxe(OCMaterial.NICKEL,OCmaterialType.AXE);
    public static final Item RUBY_AXE = new ItemSameAxe(OCMaterial.RUBY,OCmaterialType.AXE);
    public static final Item SAPPHIRE_AXE = new ItemSameAxe(OCMaterial.SAPPHIRE,OCmaterialType.AXE);
    public static final Item SILVER_AXE = new ItemSameAxe(OCMaterial.SILVER,OCmaterialType.AXE);
    public static final Item CENTERL_AXE = new ItemSameAxe(OCMaterial.CENTERL,OCmaterialType.AXE);
    public static final Item PERMAFROST_AXE = new ItemSameAxe(OCMaterial.PERMAFROST,OCmaterialType.AXE);
    public static final Item SECOND_GRILLED_BRICK_HOE = new ItemSameHoe(OCMaterial.SECOND_GRILLED_BRICK,OCmaterialType.HOE);
    public static final Item COPPER_HOE = new ItemSameHoe(OCMaterial.COPPER,OCmaterialType.HOE);
    public static final Item TIN_HOE = new ItemSameHoe(OCMaterial.TIN,OCmaterialType.HOE);
    public static final Item LEAD_HOE = new ItemSameHoe(OCMaterial.LEAD,OCmaterialType.HOE);
    public static final Item NICKEL_HOE = new ItemSameHoe(OCMaterial.NICKEL,OCmaterialType.HOE);
    public static final Item RUBY_HOE = new ItemSameHoe(OCMaterial.RUBY,OCmaterialType.HOE);
    public static final Item SAPPHIRE_HOE = new ItemSameHoe(OCMaterial.SAPPHIRE,OCmaterialType.HOE);
    public static final Item SILVER_HOE = new ItemSameHoe(OCMaterial.SILVER,OCmaterialType.HOE);
    public static final Item CENTERL_HOE = new ItemSameHoe(OCMaterial.CENTERL,OCmaterialType.HOE);
    public static final Item PERMAFROST_HOE = new ItemSameHoe(OCMaterial.PERMAFROST,OCmaterialType.HOE);
    public static final Item REFI_SWORD = new ItemREFISword();
    public static final Item TEA_SEED = new ItemSeeds(OCBlocks.TEA_CROP, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_seed");
    public static final Item EXCALIBUR_MODOKI_SWORD = new ItemEXMODSword();

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> items) {

    	items.getRegistry().registerAll(
    			TEST,
    			SECOND_GRILLED_BRICK,
    			COPPER_INGOT,
    			TIN_INGOT,
    			LEAD_INGOT,
    			NICKEL_INGOT,
    			SILVER_INGOT,
    			PERMAFROST_INGOT,
    			CENTERL_INGOT,
    			FICTNIUM_INGOT,
    			RUBY,
    			SAPPHIRE,
    			REALITE,
    			COPPER_NUGGET,
    			TIN_NUGGET,
    			LEAD_NUGGET,
    			NICKEL_NUGGET,
    			SILVER_NUGGET,
    			CENTERL_NUGGET,
    			IRON_GEAR,
    			COPPER_GEAR,
    			TIN_GEAR,
    			LEAD_GEAR,
    			NICKEL_GEAR,
    			CENTERL_GEAR,
    			SILVER_GEAR,
    			PERMAFROST_POWDER,
    			TEA_LEAVES_POWDER,
    			TEA_LEAVES,
    			TEA_CUP,
    			TEA_FLOWER,
    			RADEON_VII,
    			RADEON_PRO_V340,
    			NEEDLE,
    			OTYACRFT_DICTIONARY,
    			TEA_AND_YUNOMI,
    			SILVER_APPLE,
    			ENCHANTED_SILVER_APPLE,
    			LIGHT_METER,
    			LENS,
    			CIRCUIT_BOARD,
    			ANALOG_METER,
    			DISPOSABLE_BATTERY,
    			SECOND_GRILLED_BRICK_SWORD,
    			COPPER_SWORD,
    			TIN_SWORD,
    			LEAD_SWORD,
    			NICKEL_SWORD,
    			RUBY_SWORD,
    			SAPPHIRE_SWORD,
    			SILVER_SWORD,
    			CENTERL_SWORD,
    			PERMAFROST_SWORD,
    		    SECOND_GRILLED_BRICK_SHOVEL,
    		    COPPER_SHOVEL,
    		    TIN_SHOVEL,
    		    LEAD_SHOVEL,
    		    NICKEL_SHOVEL,
    		    RUBY_SHOVEL,
    		    SAPPHIRE_SHOVEL,
    		    SILVER_SHOVEL,
    		    CENTERL_SHOVEL,
    		    PERMAFROST_SHOVEL,
    		    SECOND_GRILLED_BRICK_PICKAXE,
    		    COPPER_PICKAXE,
    		    TIN_PICKAXE,
    		    LEAD_PICKAXE,
    		    NICKEL_PICKAXE,
    		    RUBY_PICKAXE,
    		    SAPPHIRE_PICKAXE,
    		    SILVER_PICKAXE,
    		    CENTERL_PICKAXE,
    		    PERMAFROST_PICKAXE,
    		    SECOND_GRILLED_BRICK_AXE,
    		    COPPER_AXE,
    		    TIN_AXE,
    		    LEAD_AXE,
    		    NICKEL_AXE,
    		    RUBY_AXE,
    		    SAPPHIRE_AXE,
    		    SILVER_AXE,
    		    CENTERL_AXE,
    		    PERMAFROST_AXE,
    		    SECOND_GRILLED_BRICK_HOE,
    		    COPPER_HOE,
    		    TIN_HOE,
    		    LEAD_HOE,
    		    NICKEL_HOE,
    		    RUBY_HOE,
    		    SAPPHIRE_HOE,
    		    SILVER_HOE,
    		    CENTERL_HOE,
    		    PERMAFROST_HOE,
    		    REFI_SWORD,
    		    TEA_SEED,
    		    EXCALIBUR_MODOKI_SWORD
    		    );

    }
}
