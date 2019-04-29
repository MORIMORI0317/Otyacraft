package otyacraft.world.loot;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootList {


	public static void list() {
		 LootTableList.register(new ResourceLocation("otyacraft:test/test"));
		 LootTableList.register(new ResourceLocation("otyacraft:inject/simple_dungeon"));

	}




}
