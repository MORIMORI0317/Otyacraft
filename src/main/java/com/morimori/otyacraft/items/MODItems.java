package com.morimori.otyacraft.items;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MODItems {

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
    public static final Item FICTNIUM_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.FICTNIUM,OCmaterialType.NUGGET);
    public static final Item PERMAFROST_NUGGET = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.PERMAFROST,OCmaterialType.NUGGET);
    public static final Item COPPER_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.POWDER);
    public static final Item TIN_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.POWDER);
    public static final Item LEAD_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.POWDER);
    public static final Item NICKEL_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.POWDER);
    public static final Item SILVER_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.POWDER);
    public static final Item CENTERL_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.POWDER);
    public static final Item FICTNIUM_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.FICTNIUM,OCmaterialType.POWDER);
    public static final Item PERMAFROST_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.PERMAFROST,OCmaterialType.POWDER);
    public static final Item IRON_POWDER = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.IRON,OCmaterialType.POWDER);
    public static final Item IRON_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.IRON,OCmaterialType.GEAR);
    public static final Item COPPER_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.GEAR);
    public static final Item TIN_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.GEAR);
    public static final Item LEAD_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.GEAR);
    public static final Item NICKEL_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.GEAR);
    public static final Item CENTERL_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.GEAR);
    public static final Item SILVER_GEAR = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.GEAR);
    public static final Item IRON_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.IRON,OCmaterialType.PLATE);
    public static final Item COPPER_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.PLATE);
    public static final Item TIN_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.PLATE);
    public static final Item LEAD_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.PLATE);
    public static final Item NICKEL_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.PLATE);
    public static final Item SILVER_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.PLATE);
    public static final Item CENTERL_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.PLATE);
    public static final Item FICTNIUM_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.FICTNIUM,OCmaterialType.PLATE);
    public static final Item PERMAFROST_PLATE = new ItemSame(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.PERMAFROST,OCmaterialType.PLATE);
    public static final Item TEA_LEAVES_POWDER = new Item_powder(new Item.Properties().group(OCItemGroups.OCTAB),"tea_leaves");
    public static final Item TEA_LEAVES = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_leaves");
    public static final Item TEA_CUP = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_cup");
    public static final Item TEA_FLOWER = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"tea_flower");
    public static final Item RADEON_VII = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"radeon_vii");
    public static final Item RADEON_PRO_V340 = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"radeon_pro_v340");
    public static final Item NEEDLE = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"needle");
    public static final Item OTYACRFT_DICTIONARY = new Item(new Item.Properties().group(OCItemGroups.OCTAB).maxStackSize(1)).setRegistryName(Variable.MODID,"oc_dictionary");
    public static final Item LENS = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"lens");
    public static final Item CIRCUIT_BOARD = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"circuit_board");
    public static final Item ANALOG_METER = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"analog_meter");
    public static final Item DISPOSABLE_BATTERY = new Item(new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID,"disposable_battery");
    public static final Item COPPER_SWORD = new ItemSameSword(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.COPPER);
    public static final Item RUBY_SWORD = new ItemSameSword(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.RUBY);
    public static final Item SAPPHIRE_SWORD = new ItemSameSword(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SAPPHIRE);
    public static final Item CENTERL_SWORD = new ItemSameSword(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.CENTERL);
    public static final Item PERMAFROSTL_SWORD = new ItemSameSword(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.PERMAFROST);
    public static final Item SECOND_GRILLED_BRICK_SWORD = new ItemSameSword(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SECOND_GRILLED_BRICK);
    public static final Item COPPER_SHOVEL = new ItemSameShovel((new Item.Properties().group(OCItemGroups.OCTAB)), OCMaterial.COPPER);
    public static final Item RUBY_SHOVEL = new ItemSameShovel(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.RUBY);
    public static final Item SAPPHIRE_SHOVEL = new ItemSameShovel(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SAPPHIRE);
    public static final Item CENTERL_SHOVEL = new ItemSameShovel(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.CENTERL);
    public static final Item PERMAFROSTL_SHOVEL = new ItemSameShovel(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.PERMAFROST);
    public static final Item SECOND_GRILLED_BRICK_SHOVEL = new ItemSameShovel(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SECOND_GRILLED_BRICK);
    public static final Item COPPER_PICKAXE = new ItemSamePickaxe((new Item.Properties().group(OCItemGroups.OCTAB)), OCMaterial.COPPER);
    public static final Item RUBY_PICKAXE = new ItemSamePickaxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.RUBY);
    public static final Item SAPPHIRE_PICKAXE = new ItemSamePickaxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SAPPHIRE);
    public static final Item CENTERL_PICKAXE = new ItemSamePickaxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.CENTERL);
    public static final Item PERMAFROSTL_PICKAXE = new ItemSamePickaxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.PERMAFROST);
    public static final Item SECOND_GRILLED_BRICK_PICKAXE = new ItemSamePickaxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SECOND_GRILLED_BRICK);
    public static final Item COPPER_AXE = new ItemSameAxe((new Item.Properties().group(OCItemGroups.OCTAB)), OCMaterial.COPPER);
    public static final Item RUBY_AXE = new ItemSameAxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.RUBY);
    public static final Item SAPPHIRE_AXE = new ItemSameAxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SAPPHIRE);
    public static final Item CENTERL_AXE = new ItemSameAxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.CENTERL);
    public static final Item PERMAFROSTL_AXE = new ItemSameAxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.PERMAFROST);
    public static final Item SECOND_GRILLED_BRICK_AXE = new ItemSameAxe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SECOND_GRILLED_BRICK);

    public static final Item COPPER_HOE = new ItemSameHoe((new Item.Properties().group(OCItemGroups.OCTAB)), OCMaterial.COPPER);
    public static final Item RUBY_HOE = new ItemSameHoe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.RUBY);
    public static final Item SAPPHIRE_HOE = new ItemSameHoe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SAPPHIRE);
    public static final Item CENTERL_HOE = new ItemSameHoe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.CENTERL);
    public static final Item PERMAFROSTL_HOE = new ItemSameHoe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.PERMAFROST);
    public static final Item SECOND_GRILLED_BRICK_HOE = new ItemSameHoe(new Item.Properties().group(OCItemGroups.OCTAB), OCMaterial.SECOND_GRILLED_BRICK);




    public static final Item TEST_MORTAR = new ItemSameCraftingTool(new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.MORTAR);

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> items) {

    	items.getRegistry().registerAll(


    			SECOND_GRILLED_BRICK,COPPER_SHOVEL,
    			TEST,RUBY_SHOVEL,
    			COPPER_INGOT,SAPPHIRE_SHOVEL,
    			TIN_INGOT,CENTERL_SHOVEL,
    			LEAD_INGOT,PERMAFROSTL_SHOVEL,
    			NICKEL_INGOT,SECOND_GRILLED_BRICK_SWORD,
    			SILVER_INGOT,SECOND_GRILLED_BRICK_SHOVEL,
    			PERMAFROST_INGOT,RUBY_PICKAXE,COPPER_PICKAXE,
    			CENTERL_INGOT,SAPPHIRE_PICKAXE,
    			FICTNIUM_INGOT,CENTERL_PICKAXE,
    			RUBY,PERMAFROSTL_PICKAXE,
    			SAPPHIRE,SECOND_GRILLED_BRICK_PICKAXE,
    			REALITE,COPPER_AXE,
    			COPPER_NUGGET,RUBY_AXE,
    			TIN_NUGGET,SAPPHIRE_AXE,
    			LEAD_NUGGET,CENTERL_AXE,
    			NICKEL_NUGGET,PERMAFROSTL_AXE,
    			SILVER_NUGGET,SECOND_GRILLED_BRICK_AXE,
    			CENTERL_NUGGET,IRON_PLATE,
    			FICTNIUM_NUGGET,COPPER_PLATE,
    			PERMAFROST_NUGGET,TIN_PLATE,
    		    COPPER_POWDER,LEAD_PLATE,
    		    TIN_POWDER,NICKEL_PLATE,
    		    LEAD_POWDER,SILVER_PLATE,
    		    NICKEL_POWDER,CENTERL_PLATE,
    		    SILVER_POWDER,FICTNIUM_PLATE,
    		    CENTERL_POWDER,PERMAFROST_PLATE,
    		    FICTNIUM_POWDER,COPPER_HOE,
    		    PERMAFROST_POWDER,RUBY_HOE,
    		    IRON_POWDER,SAPPHIRE_HOE,
    			IRON_GEAR,CENTERL_HOE,
    			COPPER_GEAR,PERMAFROSTL_HOE,
    			TIN_GEAR,SECOND_GRILLED_BRICK_HOE,
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
    			LENS,
    			CIRCUIT_BOARD,
    			ANALOG_METER,
    			DISPOSABLE_BATTERY,
    			COPPER_SWORD,
    			RUBY_SWORD,
    			SAPPHIRE_SWORD,
    			CENTERL_SWORD,
    			PERMAFROSTL_SWORD

    			);

    }


}
