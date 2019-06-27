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


    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> items) {

    	items.getRegistry().registerAll(


    			SECOND_GRILLED_BRICK,
    			TEST,
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
    			FICTNIUM_NUGGET,
    			PERMAFROST_NUGGET,
    		    COPPER_POWDER,
    		    TIN_POWDER,
    		    LEAD_POWDER,
    		    NICKEL_POWDER,
    		    SILVER_POWDER,
    		    CENTERL_POWDER,
    		    FICTNIUM_POWDER,
    		    PERMAFROST_POWDER,
    		    IRON_POWDER,
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
    			LENS,
    			CIRCUIT_BOARD,
    			ANALOG_METER,
    			DISPOSABLE_BATTERY,
    			COPPER_SWORD



    			);

    }


}
