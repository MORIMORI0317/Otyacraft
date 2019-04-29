package otyacraft.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import otyacraft.Variable;

public class OCToolMaterial {
        public static ToolMaterial SGB = EnumHelper.addToolMaterial("SGB", 2, 150, 5.0F, 1.000317F, 7)
      		   .setRepairItem(new ItemStack(OCitems.SECOND_GRILLED_BRICK));
     	public static ArmorMaterial SGB_A = EnumHelper.addArmorMaterial("SGB_A", Variable.MODID + ":sgba", 5,
      				new int[] {1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F)
     	   .setRepairItem(new ItemStack(OCitems.SECOND_GRILLED_BRICK));
         public static ToolMaterial copper = EnumHelper.addToolMaterial("copper", 2, 251, 5.0F, 2F, 9)
      		   .setRepairItem(new ItemStack(OCitems.COPPER_INGOT));
     	public static ArmorMaterial copper_A = EnumHelper.addArmorMaterial("copper_A", Variable.MODID + ":copper", 15,
     			new int[] {2, 5, 6, 2  }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
     	  .setRepairItem(new ItemStack(OCitems.COPPER_INGOT));
         public static ToolMaterial tin = EnumHelper.addToolMaterial("tin", 2, 251, 5.0F, 2F, 9)
       		   .setRepairItem(new ItemStack(OCitems.TIN_INGOT));
      	public static ArmorMaterial tin_A = EnumHelper.addArmorMaterial("tin_A", Variable.MODID + ":tin", 15,
      			new int[] {2, 5, 6, 2  }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
      	  .setRepairItem(new ItemStack(OCitems.TIN_INGOT));
         public static ToolMaterial lead = EnumHelper.addToolMaterial("lead", 2, 251, 5.0F, 2F, 9)
        		   .setRepairItem(new ItemStack(OCitems.LEAD_INGOT));
       	public static ArmorMaterial lead_A = EnumHelper.addArmorMaterial("lead_A", Variable.MODID + ":lead", 15,
       			new int[] {2, 5, 6, 2  }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
       	  .setRepairItem(new ItemStack(OCitems.LEAD_INGOT));
         public static ToolMaterial nickel = EnumHelper.addToolMaterial("nickel", 2, 251, 5.0F, 2F, 9)
         		   .setRepairItem(new ItemStack(OCitems.NICKEL_INGOT));
        	public static ArmorMaterial nickel_A = EnumHelper.addArmorMaterial("nickel_A", Variable.MODID + ":nickel", 15,
        			new int[] {2, 5, 6, 2  }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F)
        	  .setRepairItem(new ItemStack(OCitems.NICKEL_INGOT));
         public static ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 3, 1561, 8.0F, 3.0F, 10)
      		   .setRepairItem(new ItemStack(OCitems.RUBY));
     	public static ArmorMaterial ruby_A = EnumHelper.addArmorMaterial("ruby_A", Variable.MODID + ":ruby", 33,
     			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F)
     	  .setRepairItem(new ItemStack(OCitems.RUBY));
         public static ToolMaterial sapphire = EnumHelper.addToolMaterial("sapphire", 3, 1561, 8.0F, 3.0F, 10)
       		   .setRepairItem(new ItemStack(OCitems.SAPPHIRE));
      	public static ArmorMaterial sapphire_A = EnumHelper.addArmorMaterial("sapphire_A", Variable.MODID + ":sapphire", 33,
      			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F)
      	  .setRepairItem(new ItemStack(OCitems.SAPPHIRE));
         public static ToolMaterial silver = EnumHelper.addToolMaterial("silver",0, 32, 12.0F, 0.0F, 22)
        		   .setRepairItem(new ItemStack(OCitems.SILVER_INGOT));
       	public static ArmorMaterial silver_A = EnumHelper.addArmorMaterial("silver_A", Variable.MODID + ":silver", 7,
       			new int[] {1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F)
       	  .setRepairItem(new ItemStack(OCitems.SILVER_INGOT));
         public static ToolMaterial centerl = EnumHelper.addToolMaterial("centerl", 3,1500 , 7.0F, 2.5F, 5)
         		   .setRepairItem(new ItemStack(OCitems.CENTERL_INGOT));
        	public static ArmorMaterial centerl_A = EnumHelper.addArmorMaterial("centerl_A", Variable.MODID + ":centerl", 66,
        			new int[] {2, 5,6, 2 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F)
        	  .setRepairItem(new ItemStack(OCitems.CENTERL_INGOT));
         public static ToolMaterial permafrost = EnumHelper.addToolMaterial("permafrost", 15,100 , 16.0F, 4F, 5)
      		   .setRepairItem(new ItemStack(OCitems.PERMAFROST_INGOT));
     	public static ArmorMaterial permafrost_A = EnumHelper.addArmorMaterial("permafrost_A", Variable.MODID + ":permafrost", 10,
     			new int[] { 4, 7, 9, 4 }, 8, SoundEvents.BLOCK_GLASS_BREAK, 5.0F)
     	  .setRepairItem(new ItemStack(OCitems.PERMAFROST_INGOT));
    	public static ToolMaterial REFI = EnumHelper.addToolMaterial("REFI", 2, 150, 5.0F, 10F, 7);

	}