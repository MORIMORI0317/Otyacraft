package com.morimori.otyacraft.blocks;

import com.morimori.otyacraft.Variable;
import com.morimori.otyacraft.itemgroups.OCItemGroups;
import com.morimori.otyacraft.materia.OCMaterial;
import com.morimori.otyacraft.materia.OCmaterialType;
import com.morimori.otyacraft.world.tree.YukdrasilTree;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class OCBlocks {


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
    public static final Block BIG_EGG = new BlockBigEgg(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).sound(SoundType.GLASS).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"big_egg");
    public static final Block LEATHER_STRING_BLOCK = new Block(Block.Properties.create(Material.LEAVES, MaterialColor.BROWN).sound(SoundType.PLANT).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"leather_string_block");
    public static final Block LEATHER_BLOCK = new Block(Block.Properties.create(Material.LEAVES, MaterialColor.BROWN).sound(SoundType.PLANT).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"leather_block");
    public static final Block THUNDER_STONE = new BlockThunderSstone(Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA).sound(SoundType.STONE).needsRandomTick().hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"thunder_stone");
    public static final Block PERMAFROST_GRASS = new Block(Block.Properties.create(Material.ICE, MaterialColor.GRAY_TERRACOTTA).slipperiness(0.98F).sound(SoundType.GLASS).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"permafrost_grass");
    public static final Block PERMAFROST_BLOCK = new Block(Block.Properties.create(Material.ICE, MaterialColor.GRAY_TERRACOTTA).slipperiness(0.98F).sound(SoundType.GLASS).hardnessAndResistance(1F, 5F)).setRegistryName(Variable.MODID,"permafrost");
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
    public static final Block WILD_TEA_SEEDLINGS = new BlockWildTeaSeedlings(Block.Properties.create(Material.WOOD, MaterialColor.AIR).sound(SoundType.PLANT).hardnessAndResistance(2.5F, 1.0F)).setRegistryName(Variable.MODID,"wild_tea_seedlings");
    public static final Block YUKDRASIL_LEAVES = new BlockLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).needsRandomTick().sound(SoundType.PLANT)).setRegistryName(Variable.MODID,"yukdrasil_leaves");
    public static final Block YUKDRASIL_LOG = new BlockLog(MaterialColor.GREEN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(Variable.MODID,"yukdrasil_log");

    public static final Block TEA_CROP = new BlockTeaCrops(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT).hardnessAndResistance(0, 0)).setRegistryName(Variable.MODID,"tea_crop");


    public static final Block YUKDRASIL_SAPLING = new BlockOCSapling(new YukdrasilTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT)).setRegistryName(Variable.MODID,"yukdrasil_sapling");
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
    			COPPER_BLOCK,
    			LEAD_BLOCK,
    			NICKEL_BLOCK,
    			TIN_BLOCK,
    			CENTERL_BLOCK,
    			SILVER_BLOCK,
    			BIG_EGG,
    			LEATHER_STRING_BLOCK,
    			LEATHER_BLOCK,
    			THUNDER_STONE,
    			PERMAFROST_GRASS,
    			PERMAFROST_BLOCK,
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
    			WILD_TEA_SEEDLINGS,
    			TEA_CROP



    			);

    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> items) {

    	items.getRegistry().registerAll(

    			  new ItemBlock(TEST, new Item.Properties()).setRegistryName(Variable.MODID, "test_block"),
    			  new ItemBlock(SECOND_GRILLED_BRICK_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "second_grilled_brick_block"),
       			  new ItemBlockSame(COPPER_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.ORE),
       			  new ItemBlockSame(LEAD_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.ORE),
       			  new ItemBlockSame(NICKEL_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.ORE),
       			  new ItemBlockSame(TIN_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.ORE),
       			  new ItemBlockSame(CENTERL_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.ORE),
       			  new ItemBlockSame(SILVER_ORE, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.ORE),
       			  new ItemBlockSame(COPPER_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.COPPER,OCmaterialType.BLOCK),
       			  new ItemBlockSame(LEAD_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.LEAD,OCmaterialType.BLOCK),
       			  new ItemBlockSame(NICKEL_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.NICKEL,OCmaterialType.BLOCK),
       			  new ItemBlockSame(TIN_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.TIN,OCmaterialType.BLOCK),
       			  new ItemBlockSame(CENTERL_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.CENTERL,OCmaterialType.BLOCK),
       			  new ItemBlockSame(SILVER_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB),OCMaterial.SILVER,OCmaterialType.BLOCK),
       			  new ItemBlock(BIG_EGG, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "big_egg"),
       			  new ItemBlock(LEATHER_STRING_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "leather_string_block"),
       			  new ItemBlock(LEATHER_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "leather_block"),
       			  new ItemBlock(THUNDER_STONE, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "thunder_stone"),
       			  new ItemBlock(PERMAFROST_GRASS, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "permafrost_grass"),
       			  new ItemBlock(PERMAFROST_BLOCK, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "permafrost"),
    			  new ItemBlock(WILD_TEA_SEEDLINGS, new Item.Properties().group(OCItemGroups.OCTAB)).setRegistryName(Variable.MODID, "wild_tea_seedlings"),
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

