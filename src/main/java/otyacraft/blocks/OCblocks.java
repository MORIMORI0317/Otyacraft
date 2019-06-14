package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import otyacraft.Variable;
@ObjectHolder(Variable.MODID)
public class OCblocks {
	 public static final Block TEST = new Block_test();
	 public static final Block SECOND_GRILLED_BRICK_BLOCK = new Block_oc_nomal("second_grilled_brick_block","secondgrilledbrickblock",Material.ROCK,SoundType.STONE,5F,10F,0,"pickaxe");
	 public static final Block COPPER_BLOCK = new Block_ore_block("copper",1,5.0F,10.0F);
	 public static final Block LEAD_BLOCK = new Block_ore_block("lead",1,5.0F,10.0F);
	 public static final Block NICKEL_BLOCK = new Block_ore_block("nickel",1,5.0F,10.0F);
	 public static final Block TIN_BLOCK = new Block_ore_block("tin",1,5.0F,10.0F);
	 public static final Block CENTERL_BLOCK = new Block_ore_block("centerl",2,6.0F,10.0F);
	 public static final Block SILVER_BLOCK = new Block_ore_block("silver",2,5.0F,10.0F);
	 public static final Block RUBY_BLOCK = new Block_ore_block("ruby",2,5.0F,10.0F);
	 public static final Block SAPPHIRE_BLOCK = new Block_ore_block("sapphire",2,5.0F,10.0F);
	 public static final Block REALITE_BLOCK = new Block_realite_block();
	 public static final Block FICTNIUM_BLOCK = new Block_fictnium_block();
	 public static final Block COPPER_ORE = new Block_nomal_ore("copper",3.03F,15.0F,1);
	 public static final Block LEAD_ORE = new Block_nomal_ore("lead",3.0F,15.0F,1);
	 public static final Block NICKEL_ORE = new Block_nomal_ore("nickel",3.0F,15.0F,1);
	 public static final Block TIN_ORE = new Block_nomal_ore("tin",3.0F,15.0F,1);
	 public static final Block CENTERL_ORE = new Block_nomal_ore("centerl",5.0F,30.0F,2).setLightLevel(0.5F);
	 public static final Block SILVER_ORE = new Block_nomal_ore("silver",3F,15F,2);
	 public static final Block RUBY_ORE = new Block_ruby_ore();
	 public static final Block SAPPHIRE_ORE = new Block_sapphire_ore();
	 public static final Block REALITE_ORE = new Block_realite_ore();
	 public static final Block FICTNIUM_ORE = new Block_fictnium_ore();
	 public static final Block BIG_EGG = new Block_oc_nomal("big_egg","bigegg",Material.IRON,SoundType.GLASS,1F,10F,1,"axe");
	 public static final Block LEATHER_STRING_BLOCK = new Block_oc_nomal("leather_string_block","leatherstringblock",Material.LEAVES,SoundType.PLANT,2F,10F,0,null);
	 public static final Block LEATHER_BLOCK = new Block_oc_nomal("leather_block","leatherblock",Material.LEAVES,SoundType.PLANT,2F,10F,0,null);
	 public static final Block PERMAFROST_GRASS = new Block_permafrost_block("permafrostgrass","permafrost_grass");
	 public static final Block PERMAFROST = new Block_permafrost_block("permafrost","permafrost");
	 public static final Block CLEAR_GLASS = new Block_clear_glass();
	 public static final Block IRON_FACTORY_BLOCK = new Block_factory_block("iron");
	 public static final Block COPPER_FACTORY_BLOCK = new Block_factory_block("copper");
	 public static final Block TIN_FACTORY_BLOCK = new Block_factory_block("tin");
	 public static final Block LEAD_FACTORY_BLOCK = new Block_factory_block("lead");
	 public static final Block NICKEL_FACTORY_BLOCK = new Block_factory_block("nickel");
	 public static final Block GOLD_FACTORY_BLOCK = new Block_factory_block("gold");
	 public static final Block DIAMOND_FACTORY_BLOCK = new Block_factory_block("diamond");
	 public static final Block EMERALD_FACTORY_BLOCK = new Block_factory_block("emerald");
	 public static final Block REDSTONE_FACTORY_BLOCK = new Block_factory_block("redstone");
	 public static final Block QUARTZ_FACTORY_BLOCK = new Block_factory_block("quartz");
	 public static final Block COAL_FACTORY_BLOCK = new Block_factory_block("coal");
	 public static final Block LAPIS_FACTORY_BLOCK = new Block_factory_block("lapis");
	 public static final Block RUBY_FACTORY_BLOCK = new Block_factory_block("ruby");
	 public static final Block SAPPHIRE_FACTORY_BLOCK = new Block_factory_block("sapphire");
	 public static final Block CENTERL_FACTORY_BLOCK = new Block_factory_block("centerl").setLightLevel(0.5F);
	 public static final Block SILVER_FACTORY_BLOCK = new Block_factory_block("silver");
	 public static final Block WILD_TEA_SEEDLINGS = new Block_wild_tea_seedlings();
	 public static final Block TEA_CROP = new Block_tea_crop();
	 public static final Block TEA_FLOWER_BLOCK = new Block_oc_nomal("tea_flower_block","teaflowerblock",Material.GRASS,SoundType.PLANT,1F,0.5F,0,null);

	    @SubscribeEvent
	    public static void registerItem(IForgeRegistry<Item> items) {
        items.registerAll(new ItemBlock(TEST).setRegistryName(Variable.MODID, "test_block"),
        new ItemBlock(SECOND_GRILLED_BRICK_BLOCK).setRegistryName(Variable.MODID, "second_grilled_brick_block"),
        new ItemBlock(COPPER_BLOCK).setRegistryName(Variable.MODID, "copper_block"),
        new ItemBlock(LEAD_BLOCK).setRegistryName(Variable.MODID, "lead_block"),
        new ItemBlock(NICKEL_BLOCK).setRegistryName(Variable.MODID, "nickel_block"),
        new ItemBlock(TIN_BLOCK).setRegistryName(Variable.MODID, "tin_block"),
        new ItemBlock(CENTERL_BLOCK).setRegistryName(Variable.MODID, "centerl_block"),
        new ItemBlock(SILVER_BLOCK).setRegistryName(Variable.MODID, "silver_block"),
        new ItemBlock(RUBY_BLOCK).setRegistryName(Variable.MODID, "ruby_block"),
        new ItemBlock(SAPPHIRE_BLOCK).setRegistryName(Variable.MODID, "sapphire_block"),
        new ItemBlock(REALITE_BLOCK).setRegistryName(Variable.MODID, "realite_block"),
        new ItemBlock(FICTNIUM_BLOCK).setRegistryName(Variable.MODID, "fictnium_block"),
        new ItemBlock(COPPER_ORE).setRegistryName(Variable.MODID, "copper_ore"),
        new ItemBlock(LEAD_ORE).setRegistryName(Variable.MODID, "lead_ore"),
        new ItemBlock(NICKEL_ORE).setRegistryName(Variable.MODID, "nickel_ore"),
        new ItemBlock(TIN_ORE).setRegistryName(Variable.MODID, "tin_ore"),
        new ItemBlock(SILVER_ORE).setRegistryName(Variable.MODID, "silver_ore"),
        new ItemBlock(RUBY_ORE).setRegistryName(Variable.MODID, "ruby_ore"),
        new ItemBlock(SAPPHIRE_ORE).setRegistryName(Variable.MODID, "sapphire_ore"),
        new ItemBlock(REALITE_ORE).setRegistryName(Variable.MODID, "realite_ore"),
        new ItemBlock(FICTNIUM_ORE).setRegistryName(Variable.MODID, "fictnium_ore"),
        new ItemBlock(CENTERL_ORE).setRegistryName(Variable.MODID, "centerl_ore"),
        new ItemBlock(BIG_EGG).setRegistryName(Variable.MODID, "big_egg"),
        new ItemBlock(LEATHER_STRING_BLOCK).setRegistryName(Variable.MODID, "leather_string_block"),
        new ItemBlock(LEATHER_BLOCK).setRegistryName(Variable.MODID, "leather_block"),
        new ItemBlock(PERMAFROST_GRASS).setRegistryName(Variable.MODID, "permafrost_grass"),
        new ItemBlock(PERMAFROST).setRegistryName(Variable.MODID, "permafrost"),
        new ItemBlock_oc_unused(CLEAR_GLASS).setRegistryName(Variable.MODID, "clear_glass"),
        new ItemBlock(IRON_FACTORY_BLOCK).setRegistryName(Variable.MODID, "iron_factory_block"),
        new ItemBlock(COPPER_FACTORY_BLOCK).setRegistryName(Variable.MODID, "copper_factory_block"),
        new ItemBlock(TIN_FACTORY_BLOCK).setRegistryName(Variable.MODID, "tin_factory_block"),
        new ItemBlock(LEAD_FACTORY_BLOCK).setRegistryName(Variable.MODID, "lead_factory_block"),
        new ItemBlock(NICKEL_FACTORY_BLOCK).setRegistryName(Variable.MODID, "nickel_factory_block"),
        new ItemBlock(GOLD_FACTORY_BLOCK).setRegistryName(Variable.MODID, "gold_factory_block"),
        new ItemBlock(DIAMOND_FACTORY_BLOCK).setRegistryName(Variable.MODID, "diamond_factory_block"),
        new ItemBlock(EMERALD_FACTORY_BLOCK).setRegistryName(Variable.MODID, "emerald_factory_block"),
        new ItemBlock(REDSTONE_FACTORY_BLOCK).setRegistryName(Variable.MODID, "redstone_factory_block"),
        new ItemBlock(QUARTZ_FACTORY_BLOCK).setRegistryName(Variable.MODID, "quartz_factory_block"),
        new ItemBlock(COAL_FACTORY_BLOCK).setRegistryName(Variable.MODID, "coal_factory_block"),
        new ItemBlock(LAPIS_FACTORY_BLOCK).setRegistryName(Variable.MODID, "lapis_factory_block"),
        new ItemBlock(RUBY_FACTORY_BLOCK).setRegistryName(Variable.MODID, "ruby_factory_block"),
        new ItemBlock(SAPPHIRE_FACTORY_BLOCK).setRegistryName(Variable.MODID, "sapphire_factory_block"),
        new ItemBlock(CENTERL_FACTORY_BLOCK).setRegistryName(Variable.MODID, "centerl_factory_block"),
        new ItemBlock(SILVER_FACTORY_BLOCK).setRegistryName(Variable.MODID, "silver_factory_block"),
        new ItemBlock(WILD_TEA_SEEDLINGS).setRegistryName(Variable.MODID, "wild_tea_seedlings"),
        new ItemBlock(TEA_FLOWER_BLOCK).setRegistryName(Variable.MODID, "tea_flower_block")

);
    }
    @SubscribeEvent
    public static void registerBlocks(IForgeRegistry<Block> blocks) {
    	blocks.registerAll(TEST,
    	SECOND_GRILLED_BRICK_BLOCK,
    	COPPER_BLOCK,
    	LEAD_BLOCK,
    	NICKEL_BLOCK,
    	TIN_BLOCK,
    	CENTERL_BLOCK,
    	SILVER_BLOCK,
    	RUBY_BLOCK,
    	SAPPHIRE_BLOCK,
    	REALITE_BLOCK,
    	FICTNIUM_BLOCK,
    	COPPER_ORE,
    	LEAD_ORE,
    	NICKEL_ORE,
      	TIN_ORE,
    	SILVER_ORE,
    	RUBY_ORE,
    	SAPPHIRE_ORE,
    	REALITE_ORE,
    	FICTNIUM_ORE,
    	CENTERL_ORE,
    	BIG_EGG,
    	LEATHER_STRING_BLOCK,
    	LEATHER_BLOCK,
    	PERMAFROST_GRASS,
    	PERMAFROST,
    	CLEAR_GLASS,
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
     	TEA_CROP,
     	TEA_FLOWER_BLOCK
     );
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void tourokuModels(){
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TEST), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "test_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SECOND_GRILLED_BRICK_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COPPER_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LEAD_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(NICKEL_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TIN_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_block"), "inventory"));
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CENTERL_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_block"), "inventory"));
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SILVER_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_block"), "inventory"));
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(RUBY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_block"), "inventory"));
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SAPPHIRE_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_block"), "inventory"));
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(REALITE_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "realite_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FICTNIUM_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "fictnium_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COPPER_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LEAD_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(NICKEL_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TIN_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SILVER_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(RUBY_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SAPPHIRE_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(REALITE_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "realite_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FICTNIUM_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "fictnium_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CENTERL_ORE), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_ore"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BIG_EGG), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "big_egg"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LEATHER_STRING_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "leather_string_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LEATHER_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "leather_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PERMAFROST_GRASS), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_grass"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PERMAFROST), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CLEAR_GLASS), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "clear_glass"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IRON_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "iron_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COPPER_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TIN_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LEAD_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(NICKEL_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(GOLD_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "gold_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(DIAMOND_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "diamond_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(EMERALD_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "emerald_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(REDSTONE_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "redstone_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(QUARTZ_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "quartz_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(COAL_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "coal_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LAPIS_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lapis_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(RUBY_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SAPPHIRE_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CENTERL_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_factory_block"), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SILVER_FACTORY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_factory_block"), "inventory"));
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WILD_TEA_SEEDLINGS), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "wild_tea_seedlings"), "inventory"));
     	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TEA_CROP), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_crop"), "inventory"));
       	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TEA_FLOWER_BLOCK), 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_flower_block"), "inventory"));

    }

}
