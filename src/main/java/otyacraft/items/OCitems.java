package otyacraft.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import otyacraft.Variable;
import otyacraft.blocks.OCblocks;
import otyacraft.creativetabs.OCCreativetabs;
@ObjectHolder(Variable.MODID)
public class OCitems {
	//Item Declaration アイテム宣言
    public static final Item TEST = new Item_test();
    public static final Item SECOND_GRILLED_BRICK = new Item_second_grilled_brick();
    public static final Item COPPER_INGOT = new Item_oc_materia("copper","ingot");
    public static final Item TIN_INGOT = new Item_oc_materia("tin","ingot");
    public static final Item LEAD_INGOT = new Item_oc_materia("lead","ingot");
    public static final Item NICKEL_INGOT = new Item_oc_materia("nickel","ingot");
    public static final Item SILVER_INGOT = new Item_oc_materia("silver","ingot");
    public static final Item RUBY = new Item().setRegistryName("ruby").setUnlocalizedName("ruby").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item SAPPHIRE = new Item().setRegistryName("sapphire").setUnlocalizedName("sapphire").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item PERMAFROST_INGOT = new Item_oc_materia("permafrost","ingot");
    public static final Item CENTERL_INGOT = new Item_oc_materia("centerl","ingot");
    public static final Item FICTNIUM_INGOT = new Item_oc_materia("fictnium","ingot");
    public static final Item REALITE = new Item().setRegistryName("realite").setUnlocalizedName("realite").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item COPPER_NUGGET = new Item_oc_materia("copper","nugget");
    public static final Item TIN_NUGGET = new Item_oc_materia("tin","nugget");
    public static final Item LEAD_NUGGET = new Item_oc_materia("lead","nugget");
    public static final Item NICKEL_NUGGET = new Item_oc_materia("nickel","nugget");
    public static final Item SILVER_NUGGET = new Item_oc_materia("silver","nugget");
    public static final Item CENTERL_NUGGET = new Item_oc_materia("centerl","nugget");
    public static final Item IRON_GEAR = new Item_oc_materia("iron","gear");
    public static final Item COPPER_GEAR = new Item_oc_materia("copper","gear");
    public static final Item TIN_GEAR = new Item_oc_materia("tin","gear");
    public static final Item LEAD_GEAR = new Item_oc_materia("lead","gear");
    public static final Item NICKEL_GEAR = new Item_oc_materia("nickel","gear");
    public static final Item CENTERL_GEAR = new Item_oc_materia("centerl","gear");
    public static final Item SILVER_GEAR = new Item_oc_materia("silver","gear");
    public static final Item PERMAFROST_POWDER = new Item().setRegistryName("permafrost_powder").setUnlocalizedName("permafrostpowder").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item TEA_LEAVES = new Item().setRegistryName("tea_leaves").setUnlocalizedName("tealeaves").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item TEA_CUP = new Item().setRegistryName("tea_cup").setUnlocalizedName("teacup").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item TEA_LEAVES_POWDER = new Item().setRegistryName("tea_leaves_powder").setUnlocalizedName("tealeavespowder").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item NEEDLE = new Item_needle();
    public static final Item BROKEN_NEEDLE = new Item_oc_unused().setRegistryName("broken_needle").setUnlocalizedName("brokenneedle").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item OTYACRFT_DICTIONARY = new Item_oc_unused().setRegistryName("oc_dictionary").setUnlocalizedName("otyacraftdictionary").setCreativeTab(OCCreativetabs.OCTAB).setMaxStackSize(1);
    public static final Item TEA_AND_TEA_CUP = new Item_tea_and_tea_cup(4, 0.3F, false,"tea_and_tea_cup","teaandteacup");
    public static final Item SILVER_APPLE = new Item_silver_apple(4, 0.3F, false);
    public static final Item TEA_SEED = new Item_seed(OCblocks.TEA_CROP,Blocks.FARMLAND,"tea");
    public static final Item TEA_FLOWER = new Item().setRegistryName("tea_flower").setUnlocalizedName("teaflower").setCreativeTab(OCCreativetabs.OCTAB);
    public static final Item OLD_RADEON = new Item_oc_radeon();
    public static final Item ENCHANTED_SILVER_APPLE = new ItemAppleSILVEREnchanted(4, 0.3F, false);
    public static final Item RADEON_VII = new Item().setRegistryName("radeon_vii").setUnlocalizedName("radeonvii").setCreativeTab(OCCreativetabs.OCTAB).setMaxStackSize(1);
    public static final Item RADEON_PRO_V340 = new Item().setRegistryName("radeon_pro_v340").setUnlocalizedName("radeonprov340").setCreativeTab(OCCreativetabs.OCTAB).setMaxStackSize(1);
    //Tool and Armor ツールと装備
    public static final Item SECOND_GRILLED_BRICK_SWORD = new Item_oc_nomal_sword("sgb",OCToolMaterial.SGB);
    public static final Item SECOND_GRILLED_BRICK_SHOVEL = new Item_oc_nomal_shovel("sgb",OCToolMaterial.SGB);
    public static final Item SECOND_GRILLED_BRICK_PICKAXE = new Item_oc_nomal_pickaxe("sgb",OCToolMaterial.SGB);
    public static final Item SECOND_GRILLED_BRICK_AXE = new Item_oc_nomal_axe("sgb",OCToolMaterial.SGB, 8.0F, -3.2F);
    public static final Item SECOND_GRILLED_BRICK_HOE = new Item_oc_nomal_hoe("sgb",OCToolMaterial.SGB);
    public static final Item SECOND_GRILLED_BRICK_HELMET = new Item_oc_nomal_armor("sgbhelmet","sgb_helmet",OCToolMaterial.SGB_A,1,EntityEquipmentSlot.HEAD);
    public static final Item SECOND_GRILLED_BRICK_CHESTPLATE = new Item_oc_nomal_armor("sgbchestplate","sgb_chestplate",OCToolMaterial.SGB_A,1,EntityEquipmentSlot.CHEST);
    public static final Item SECOND_GRILLED_BRICK_LEGGINGS = new Item_oc_nomal_armor("sgbleggings","sgb_leggings",OCToolMaterial.SGB_A,2,EntityEquipmentSlot.LEGS);
    public static final Item SECOND_GRILLED_BRICK_BOOTS = new Item_oc_nomal_armor("sgbboots","sgb_boots",OCToolMaterial.SGB_A,1,EntityEquipmentSlot.FEET);
    public static final Item COPPER_SWORD = new Item_oc_nomal_sword("copper",OCToolMaterial.copper);
    public static final Item COPPER_SHOVEL = new Item_oc_nomal_shovel("copper",OCToolMaterial.copper);
    public static final Item COPPER_PICKAXE = new Item_oc_nomal_pickaxe("copper",OCToolMaterial.copper);
    public static final Item COPPER_AXE = new Item_oc_nomal_axe("copper",OCToolMaterial.copper, 8.0F, -3.1F);
    public static final Item COPPER_HOE = new Item_oc_nomal_hoe("copper",OCToolMaterial.copper);
    public static final Item COPPER_HELMET = new Item_oc_nomal_armor("copperhelmet","copper_helmet",OCToolMaterial.copper_A,1,EntityEquipmentSlot.HEAD);
    public static final Item COPPER_CHESTPLATE = new Item_oc_nomal_armor("copperchestplate","copper_chestplate",OCToolMaterial.copper_A,1,EntityEquipmentSlot.CHEST);
    public static final Item COPPER_LEGGINGS = new Item_oc_nomal_armor("copperleggings","copper_leggings",OCToolMaterial.copper_A,2,EntityEquipmentSlot.LEGS);
    public static final Item COPPER_BOOTS = new Item_oc_nomal_armor("copperboots","copper_boots",OCToolMaterial.copper_A,1,EntityEquipmentSlot.FEET);
    public static final Item TIN_SWORD = new Item_oc_nomal_sword("tin",OCToolMaterial.tin);
    public static final Item TIN_SHOVEL = new Item_oc_nomal_shovel("tin",OCToolMaterial.tin);
    public static final Item TIN_PICKAXE = new Item_oc_nomal_pickaxe("tin",OCToolMaterial.tin);
    public static final Item TIN_AXE = new Item_oc_nomal_axe("tin",OCToolMaterial.tin, 8.0F, -3.1F);
    public static final Item TIN_HOE = new Item_oc_nomal_hoe("tin",OCToolMaterial.tin);
    public static final Item TIN_HELMET = new Item_oc_nomal_armor("tinhelmet","tin_helmet",OCToolMaterial.tin_A,1,EntityEquipmentSlot.HEAD);
    public static final Item TIN_CHESTPLATE = new Item_oc_nomal_armor("tinchestplate","tin_chestplate",OCToolMaterial.tin_A,1,EntityEquipmentSlot.CHEST);
    public static final Item TIN_LEGGINGS = new Item_oc_nomal_armor("tinleggings","tin_leggings",OCToolMaterial.tin_A,2,EntityEquipmentSlot.LEGS);
    public static final Item TIN_BOOTS = new Item_oc_nomal_armor("tinboots","tin_boots",OCToolMaterial.tin_A,1,EntityEquipmentSlot.FEET);
    public static final Item LEAD_SWORD = new Item_oc_nomal_sword("lead",OCToolMaterial.lead);
    public static final Item LEAD_SHOVEL = new Item_oc_nomal_shovel("lead",OCToolMaterial.lead);
    public static final Item LEAD_PICKAXE = new Item_oc_nomal_pickaxe("lead",OCToolMaterial.lead);
    public static final Item LEAD_AXE = new Item_oc_nomal_axe("lead",OCToolMaterial.lead, 8.0F, -3.1F);
    public static final Item LEAD_HOE = new Item_oc_nomal_hoe("lead",OCToolMaterial.lead);
    public static final Item LEAD_HELMET = new Item_oc_nomal_armor("leadhelmet","lead_helmet",OCToolMaterial.lead_A,1,EntityEquipmentSlot.HEAD);
    public static final Item LEAD_CHESTPLATE = new Item_oc_nomal_armor("leadchestplate","lead_chestplate",OCToolMaterial.lead_A,1,EntityEquipmentSlot.CHEST);
    public static final Item LEAD_LEGGINGS = new Item_oc_nomal_armor("leadleggings","lead_leggings",OCToolMaterial.lead_A,2,EntityEquipmentSlot.LEGS);
    public static final Item LEAD_BOOTS = new Item_oc_nomal_armor("leadboots","lead_boots",OCToolMaterial.lead_A,1,EntityEquipmentSlot.FEET);
    public static final Item NICKEL_SWORD = new Item_oc_nomal_sword("nickel",OCToolMaterial.nickel);
    public static final Item NICKEL_SHOVEL = new Item_oc_nomal_shovel("nickel",OCToolMaterial.nickel);
    public static final Item NICKEL_PICKAXE = new Item_oc_nomal_pickaxe("nickel",OCToolMaterial.nickel);
    public static final Item NICKEL_AXE = new Item_oc_nomal_axe("nickel",OCToolMaterial.nickel, 8.0F, -3.1F);
    public static final Item NICKEL_HOE = new Item_oc_nomal_hoe("nickel",OCToolMaterial.nickel);
    public static final Item NICKEL_HELMET = new Item_oc_nomal_armor("nickelhelmet","nickel_helmet",OCToolMaterial.nickel_A,1,EntityEquipmentSlot.HEAD);
    public static final Item NICKEL_CHESTPLATE = new Item_oc_nomal_armor("nickelchestplate","nickel_chestplate",OCToolMaterial.nickel_A,1,EntityEquipmentSlot.CHEST);
    public static final Item NICKEL_LEGGINGS = new Item_oc_nomal_armor("nickelleggings","nickel_leggings",OCToolMaterial.nickel_A,2,EntityEquipmentSlot.LEGS);
    public static final Item NICKEL_BOOTS = new Item_oc_nomal_armor("nickelboots","nickel_boots",OCToolMaterial.nickel_A,1,EntityEquipmentSlot.FEET);
    public static final Item RUBY_SWORD = new Item_oc_nomal_sword("ruby",OCToolMaterial.ruby);
    public static final Item RUBY_SHOVEL = new Item_oc_nomal_shovel("ruby",OCToolMaterial.ruby);
    public static final Item RUBY_PICKAXE = new Item_oc_nomal_pickaxe("ruby",OCToolMaterial.ruby);
    public static final Item RUBY_AXE = new Item_oc_nomal_axe("ruby",OCToolMaterial.ruby, 8.0F, -3.0F);
    public static final Item RUBY_HOE = new Item_oc_nomal_hoe("ruby",OCToolMaterial.ruby);
    public static final Item RUBY_HELMET = new Item_oc_nomal_armor("rubyhelmet","ruby_helmet",OCToolMaterial.ruby_A,1,EntityEquipmentSlot.HEAD);
    public static final Item RUBY_CHESTPLATE = new Item_oc_nomal_armor("rubychestplate","ruby_chestplate",OCToolMaterial.ruby_A,1,EntityEquipmentSlot.CHEST);
    public static final Item RUBY_LEGGINGS = new Item_oc_nomal_armor("rubyleggings","ruby_leggings",OCToolMaterial.ruby_A,2,EntityEquipmentSlot.LEGS);
    public static final Item RUBY_BOOTS = new Item_oc_nomal_armor("rubyboots","ruby_boots",OCToolMaterial.ruby_A,1,EntityEquipmentSlot.FEET);
    public static final Item SAPPHIRE_SWORD = new Item_oc_nomal_sword("sapphire",OCToolMaterial.sapphire);
    public static final Item SAPPHIRE_SHOVEL = new Item_oc_nomal_shovel("sapphire",OCToolMaterial.sapphire);
    public static final Item SAPPHIRE_PICKAXE = new Item_oc_nomal_pickaxe("sapphire",OCToolMaterial.sapphire);
    public static final Item SAPPHIRE_AXE = new Item_oc_nomal_axe("sapphire",OCToolMaterial.sapphire, 8.0F, -3.0F);
    public static final Item SAPPHIRE_HOE = new Item_oc_nomal_hoe("sapphire",OCToolMaterial.sapphire);
    public static final Item SAPPHIRE_HELMET = new Item_oc_nomal_armor("sapphirehelmet","sapphire_helmet",OCToolMaterial.sapphire_A,1,EntityEquipmentSlot.HEAD);
    public static final Item SAPPHIRE_CHESTPLATE = new Item_oc_nomal_armor("sapphirechestplate","sapphire_chestplate",OCToolMaterial.sapphire_A,1,EntityEquipmentSlot.CHEST);
    public static final Item SAPPHIRE_LEGGINGS = new Item_oc_nomal_armor("sapphireleggings","sapphire_leggings",OCToolMaterial.sapphire_A,2,EntityEquipmentSlot.LEGS);
    public static final Item SAPPHIRE_BOOTS = new Item_oc_nomal_armor("sapphireboots","sapphire_boots",OCToolMaterial.sapphire_A,1,EntityEquipmentSlot.FEET);
    public static final Item SILVER_SWORD = new Item_oc_nomal_sword("silver",OCToolMaterial.silver);
    public static final Item SILVER_SHOVEL = new Item_oc_nomal_shovel("silver",OCToolMaterial.silver);
    public static final Item SILVER_PICKAXE = new Item_oc_nomal_pickaxe("silver",OCToolMaterial.silver);
    public static final Item SILVER_AXE = new Item_oc_nomal_axe("silver",OCToolMaterial.silver, 6.0F, -3.0F);
    public static final Item SILVER_HOE = new Item_oc_nomal_hoe("silver",OCToolMaterial.silver);
    public static final Item SILVER_HELMET = new Item_oc_nomal_armor("silverhelmet","silver_helmet",OCToolMaterial.silver_A,1,EntityEquipmentSlot.HEAD);
    public static final Item SILVER_CHESTPLATE = new Item_oc_nomal_armor("silverchestplate","silver_chestplate",OCToolMaterial.silver_A,1,EntityEquipmentSlot.CHEST);
    public static final Item SILVER_LEGGINGS = new Item_oc_nomal_armor("silverleggings","silver_leggings",OCToolMaterial.silver_A,2,EntityEquipmentSlot.LEGS);
    public static final Item SILVER_BOOTS = new Item_oc_nomal_armor("silverboots","silver_boots",OCToolMaterial.silver_A,1,EntityEquipmentSlot.FEET);
    public static final Item CENTERL_SWORD = new Item_oc_nomal_sword("centerl",OCToolMaterial.centerl);
    public static final Item CENTERL_SHOVEL = new Item_oc_nomal_shovel("centerl",OCToolMaterial.centerl);
    public static final Item CENTERL_PICKAXE = new Item_oc_nomal_pickaxe("centerl",OCToolMaterial.centerl);
    public static final Item CENTERL_AXE = new Item_oc_nomal_axe("centerl",OCToolMaterial.centerl, 8.0F, -3.1F);
    public static final Item CENTERL_HOE = new Item_oc_nomal_hoe("centerl",OCToolMaterial.centerl);
    public static final Item CENTERL_HELMET = new Item_oc_nomal_armor("centerlhelmet","centerl_helmet",OCToolMaterial.centerl_A,1,EntityEquipmentSlot.HEAD);
    public static final Item CENTERL_CHESTPLATE = new Item_oc_nomal_armor("centerlchestplate","centerl_chestplate",OCToolMaterial.centerl_A,1,EntityEquipmentSlot.CHEST);
    public static final Item CENTERL_LEGGINGS = new Item_oc_nomal_armor("centerlleggings","centerl_leggings",OCToolMaterial.centerl_A,2,EntityEquipmentSlot.LEGS);
    public static final Item CENTERL_BOOTS = new Item_oc_nomal_armor("centerlboots","centerl_boots",OCToolMaterial.centerl_A,1,EntityEquipmentSlot.FEET);
    public static final Item PERMAFROST_SWORD = new Item_oc_nomal_sword("permafrost",OCToolMaterial.permafrost);
    public static final Item PERMAFROST_SHOVEL = new Item_oc_nomal_shovel("permafrost",OCToolMaterial.permafrost);
    public static final Item PERMAFROST_PICKAXE = new Item_oc_nomal_pickaxe("permafrost",OCToolMaterial.permafrost);
    public static final Item PERMAFROST_AXE = new Item_oc_nomal_axe("permafrost",OCToolMaterial.permafrost, 9.0F, -2.5F);
    public static final Item PERMAFROST_HOE = new Item_oc_nomal_hoe("permafrost",OCToolMaterial.permafrost);
    public static final Item PERMAFROST_HELMET = new Item_oc_nomal_armor("permafrosthelmet","permafrost_helmet",OCToolMaterial.permafrost_A,1,EntityEquipmentSlot.HEAD);
    public static final Item PERMAFROST_CHESTPLATE = new Item_oc_nomal_armor("permafrostchestplate","permafrost_chestplate",OCToolMaterial.permafrost_A,1,EntityEquipmentSlot.CHEST);
    public static final Item PERMAFROST_LEGGINGS = new Item_oc_nomal_armor("permafrostleggings","permafrost_leggings",OCToolMaterial.permafrost_A,2,EntityEquipmentSlot.LEGS);
    public static final Item PERMAFROST_BOOTS = new Item_oc_nomal_armor("permafrostboots","permafrost_boots",OCToolMaterial.permafrost_A,1,EntityEquipmentSlot.FEET);
    public static final Item REFI_SWORD = new Item_REFI_sword();
    public static final Item EXCALIBUR_MODOKI_SWORD = new Item_oc_nomal_sword("excalibur_modoki",OCToolMaterial.EXCALIBUR_MODOKI).setFull3D();

    @SubscribeEvent
    public static void registerItem(IForgeRegistry<Item> items) {
    	//Item register アイテム登録
       items.registerAll(TEST,
    		   SECOND_GRILLED_BRICK,
    		   COPPER_INGOT,
    		   TIN_INGOT,
    		   LEAD_INGOT,
    		   NICKEL_INGOT,
    		   SILVER_INGOT,
    		   RUBY,
    		   SAPPHIRE,
    		   PERMAFROST_INGOT,
    		   CENTERL_INGOT,
    		   FICTNIUM_INGOT,
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
    		   TEA_LEAVES,
    		   TEA_CUP,
    		   TEA_LEAVES_POWDER,
    		   NEEDLE,
    		   BROKEN_NEEDLE,
    		   OTYACRFT_DICTIONARY,
    		   TEA_AND_TEA_CUP,
    		   SILVER_APPLE,
    		   TEA_SEED,
    		   TEA_FLOWER,
    		   OLD_RADEON,
    		   RADEON_VII,
    		   RADEON_PRO_V340,
    		   ENCHANTED_SILVER_APPLE,

    		   SECOND_GRILLED_BRICK_SWORD,
    		   SECOND_GRILLED_BRICK_SHOVEL,
    		   SECOND_GRILLED_BRICK_PICKAXE,
    		   SECOND_GRILLED_BRICK_AXE,
    		   SECOND_GRILLED_BRICK_HOE,
    		   SECOND_GRILLED_BRICK_HELMET,
    		   SECOND_GRILLED_BRICK_CHESTPLATE,
    		   SECOND_GRILLED_BRICK_LEGGINGS,
    		   SECOND_GRILLED_BRICK_BOOTS,
    		   COPPER_SWORD,
    		   COPPER_SHOVEL,
    		   COPPER_PICKAXE,
    		   COPPER_AXE,
    		   COPPER_HOE,
    		   COPPER_HELMET,
    		   COPPER_CHESTPLATE,
    		   COPPER_LEGGINGS,
    		   COPPER_BOOTS,
    		   TIN_SWORD,
    		   TIN_SHOVEL,
    		   TIN_PICKAXE,
    		   TIN_AXE,
    		   TIN_HOE,
    		   TIN_HELMET,
    		   TIN_CHESTPLATE,
    		   TIN_LEGGINGS,
    		   TIN_BOOTS,
    		   LEAD_SWORD,
    		   LEAD_SHOVEL,
    		   LEAD_PICKAXE,
    		   LEAD_AXE,
    		   LEAD_HOE,
    		   LEAD_HELMET,
    		   LEAD_CHESTPLATE,
    		   LEAD_LEGGINGS,
    		   LEAD_BOOTS,
    		   NICKEL_SWORD,
    		   NICKEL_SHOVEL,
    		   NICKEL_PICKAXE,
    		   NICKEL_AXE,
    		   NICKEL_HOE,
    		   NICKEL_HELMET,
    		   NICKEL_CHESTPLATE,
    		   NICKEL_LEGGINGS,
    		   NICKEL_BOOTS,
    		   RUBY_SWORD,
    		   RUBY_SHOVEL,
    		   RUBY_PICKAXE,
    		   RUBY_AXE,
    		   RUBY_HOE,
    		   RUBY_HELMET,
    		   RUBY_CHESTPLATE,
    		   RUBY_LEGGINGS,
    		   RUBY_BOOTS,
    		   SAPPHIRE_SWORD,
    		   SAPPHIRE_SHOVEL,
    		   SAPPHIRE_PICKAXE,
    		   SAPPHIRE_AXE,
    		   SAPPHIRE_HOE,
    		   SAPPHIRE_HELMET,
    		   SAPPHIRE_CHESTPLATE,
    		   SAPPHIRE_LEGGINGS,
    		   SAPPHIRE_BOOTS,
    		   SILVER_SWORD,
    		   SILVER_SHOVEL,
    		   SILVER_PICKAXE,
    		   SILVER_AXE,
    		   SILVER_HOE,
    		   SILVER_HELMET,
    		   SILVER_CHESTPLATE,
    		   SILVER_LEGGINGS,
    		   SILVER_BOOTS,
    		   CENTERL_SWORD,
    		   CENTERL_SHOVEL,
    		   CENTERL_PICKAXE,
    		   CENTERL_AXE,
    		   CENTERL_HOE,
    		   CENTERL_HELMET,
    		   CENTERL_CHESTPLATE,
    		   CENTERL_LEGGINGS,
    		   CENTERL_BOOTS,
    		   PERMAFROST_SWORD,
    		   PERMAFROST_SHOVEL,
    		   PERMAFROST_PICKAXE,
    		   PERMAFROST_AXE,
    		   PERMAFROST_HOE,
    		   PERMAFROST_HELMET,
    		   PERMAFROST_CHESTPLATE,
    		   PERMAFROST_LEGGINGS,
    		   PERMAFROST_BOOTS,
    		   REFI_SWORD,
    		   EXCALIBUR_MODOKI_SWORD);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void tourokuModels(){
    	ModelLoader.setCustomModelResourceLocation(TEST, 0,new net.minecraft.client.renderer.block.model.ModelResourceLocation(new ResourceLocation(Variable.MODID, "test_item"), "inventory"));

        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(FICTNIUM_INGOT, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "fictnium_ingot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(REALITE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "realite"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_NUGGET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_nugget"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_NUGGET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_nugget"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_NUGGET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_nugget"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_NUGGET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_nugget"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_NUGGET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_nugget"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_NUGGET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_nugget"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(IRON_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "iron_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_GEAR, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_gear"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_POWDER, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_powder"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA_LEAVES, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_leaves"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA_CUP, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_cup"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA_LEAVES_POWDER, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_leaves_powder"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BROKEN_NEEDLE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "broken_needle"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NEEDLE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "needle"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(OTYACRFT_DICTIONARY, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "oc_dictionary"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA_AND_TEA_CUP, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_and_tea_cup"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_APPLE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_apple"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SECOND_GRILLED_BRICK_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "second_grilled_brick_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(COPPER_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "copper_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TIN_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tin_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LEAD_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "lead_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NICKEL_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "nickel_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RUBY_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "ruby_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SAPPHIRE_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "sapphire_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SILVER_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CENTERL_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "centerl_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_SHOVEL, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_shovel"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_PICKAXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_pickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_AXE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_axe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_HOE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_hoe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_HELMET, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_helmet"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_CHESTPLATE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_chestplate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_LEGGINGS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_leggings"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PERMAFROST_BOOTS, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "permafrost_boots"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA_SEED, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_seed"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TEA_FLOWER, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "tea_flower"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RADEON_VII, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "radeon_vii"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(RADEON_PRO_V340, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "radeon_pro_v340"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(REFI_SWORD, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "refi_sword"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ENCHANTED_SILVER_APPLE, 0, new ModelResourceLocation(new ResourceLocation(Variable.MODID, "silver_apple"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(EXCALIBUR_MODOKI_SWORD, 0, new ModelResourceLocation(new ResourceLocation("minecraft", "cod"), "inventory"));
    }
}
