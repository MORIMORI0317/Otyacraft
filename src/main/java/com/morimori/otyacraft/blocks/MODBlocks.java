package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MODBlocks {
    public static final Block TEST = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(Variable.MODID,"test_block");
    public static final Block SECOND_GRILLED_BRICK_BLOCK = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(5F, 10F)).setRegistryName(Variable.MODID,"second_grilled_brick_block");
    public static final Block COPPER_ORE = new BlockSame(OCMaterial.COPPER,OCmaterialType.ORE,3F, 15F);
    public static final Block LEAD_ORE = new BlockSame(OCMaterial.LEAD,OCmaterialType.ORE,3F, 15F);
    public static final Block NICKEL_ORE = new BlockSame(OCMaterial.NICKEL,OCmaterialType.ORE,3F, 15F);
    public static final Block TIN_ORE = new BlockSame(OCMaterial.TIN,OCmaterialType.ORE,3F, 15F);
    public static final Block CENTERL_ORE = new BlockSame(OCMaterial.CENTERL,OCmaterialType.ORE,5F, 30F);
    public static final Block SILVER_ORE = new BlockSame(OCMaterial.SILVER,OCmaterialType.ORE,3F, 15F);
    public static final Block COPPER_BLOCK = new BlockSame(OCMaterial.COPPER,OCmaterialType.BLOCK,3F, 15F);
    public static final Block LEAD_BLOCK = new BlockSame(OCMaterial.LEAD,OCmaterialType.BLOCK,3F, 15F);
    public static final Block NICKEL_BLOCK = new BlockSame(OCMaterial.NICKEL,OCmaterialType.BLOCK,3F, 15F);
    public static final Block TIN_BLOCK = new BlockSame(OCMaterial.TIN,OCmaterialType.BLOCK,3F, 15F);
    public static final Block CENTERL_BLOCK = new BlockSame(OCMaterial.CENTERL,OCmaterialType.BLOCK,5F, 30F);
    public static final Block SILVER_BLOCK = new BlockSame(OCMaterial.SILVER,OCmaterialType.BLOCK,3F, 15F);
    public static final Block IRON_FACTORY_BLOCK = new BlockSame(OCMaterial.IRON,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block COPPER_FACTORY_BLOCK = new BlockSame(OCMaterial.COPPER,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block TIN_FACTORY_BLOCK = new BlockSame(OCMaterial.TIN,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block LEAD_FACTORY_BLOCK = new BlockSame(OCMaterial.LEAD,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block NICKEL_FACTORY_BLOCK = new BlockSame(OCMaterial.NICKEL,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block GOLD_FACTORY_BLOCK = new BlockSame(OCMaterial.GOLD,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block DIAMOND_FACTORY_BLOCK = new BlockSame(OCMaterial.DIAMOND,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block EMERALD_FACTORY_BLOCK = new BlockSame(OCMaterial.EMERALD,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block REDSTONE_FACTORY_BLOCK = new BlockSame(OCMaterial.REDSTONE,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block QUARTZ_FACTORY_BLOCK = new BlockSame(OCMaterial.QUARTZ,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block COAL_FACTORY_BLOCK = new BlockSame(OCMaterial.COAL,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block LAPIS_FACTORY_BLOCK = new BlockSame(OCMaterial.LAPIS,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block RUBY_FACTORY_BLOCK = new BlockSame(OCMaterial.RUBY,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block SAPPHIRE_FACTORY_BLOCK = new BlockSame(OCMaterial.SAPPHIRE,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block CENTERL_FACTORY_BLOCK = new BlockSame(OCMaterial.CENTERL,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block SILVER_FACTORY_BLOCK = new BlockSame(OCMaterial.SILVER,OCmaterialType.FACTORY_BLOCK,3F, 15F);
    public static final Block LEATHER_STRING_BLOCK = new Block(Block.Properties.create(Material.LEAVES, MaterialColor.BROWN).sound(SoundType.PLANT).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"leather_string_block");
    public static final Block LEATHER_BLOCK = new Block(Block.Properties.create(Material.LEAVES, MaterialColor.BROWN).sound(SoundType.PLANT).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"leather_block");


    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> blocks) {

    	blocks.getRegistry().registerAll(

    			TEST,
    			SECOND_GRILLED_BRICK_BLOCK,
    			COPPER_ORE,
    			LEAD_ORE,
    			NICKEL_ORE,
    			TIN_ORE,
    			CENTERL_ORE,
    			SILVER_ORE,
    			IRON_FACTORY_BLOCK,
    			COPPER_FACTORY_BLOCK,
    			TIN_FACTORY_BLOCK,
    			LEAD_FACTORY_BLOCK,
    			NICKEL_FACTORY_BLOCK,
    			GOLD_FACTORY_BLOCK,
    			DIAMOND_FACTORY_BLOCK,
    			EMERALD_FACTORY_BLOCK,
    			REDSTONE_FACTORY_BLOCK,
    			QUARTZ_FACTORY_BLOCK,
    			COAL_FACTORY_BLOCK,
    			LAPIS_FACTORY_BLOCK,
    			RUBY_FACTORY_BLOCK,
    			SAPPHIRE_FACTORY_BLOCK,
    			CENTERL_FACTORY_BLOCK,
    			SILVER_FACTORY_BLOCK,
    			LEATHER_STRING_BLOCK,
    			LEATHER_BLOCK
    			);
    }


        @SubscribeEvent
        public static void registerItem(RegistryEvent.Register<Item> items) {

        	items.getRegistry().registerAll(

        			  new BlockItem(TEST, new Item.Properties()).setRegistryName(Variable.MODID, "test_block"),
        			  new BlockItem(SECOND_GRILLED_BRICK_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "second_grilled_brick_block"),
           			  new BlockItem(LEATHER_STRING_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "leather_string_block"),
           			  new BlockItem(LEATHER_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "leather_block"),



           			  new ItemBlockSame(COPPER_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.ORE),
           			  new ItemBlockSame(LEAD_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.ORE),
           			  new ItemBlockSame(NICKEL_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.ORE),
           			  new ItemBlockSame(TIN_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.ORE),
           			  new ItemBlockSame(CENTERL_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.ORE),
           			  new ItemBlockSame(SILVER_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.ORE),
           			  new ItemBlockSame(IRON_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.IRON,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(COPPER_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(TIN_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(LEAD_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(NICKEL_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(GOLD_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.GOLD,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(DIAMOND_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.DIAMOND,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(EMERALD_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.EMERALD,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(REDSTONE_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.REDSTONE,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(QUARTZ_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.QUARTZ,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(COAL_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COAL,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(LAPIS_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LAPIS,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(RUBY_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.RUBY,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(SAPPHIRE_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SAPPHIRE,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(CENTERL_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.FACTORY_BLOCK),
           			  new ItemBlockSame(SILVER_FACTORY_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.FACTORY_BLOCK)



        			);


    }
}
