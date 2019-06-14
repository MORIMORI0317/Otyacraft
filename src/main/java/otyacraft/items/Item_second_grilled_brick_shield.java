package otyacraft.items;

import net.minecraft.item.ItemShield;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Item_second_grilled_brick_shield extends ItemShield {
	public Item_second_grilled_brick_shield() {
	        super();

	        this.setRegistryName(Variable.MODID, "second_grilled_brick_shield");
	        this.setCreativeTab(OCCreativetabs.OCTAB);
	        this.setUnlocalizedName("secondgrilledbrickshield");
	        this.maxStackSize = 1;
	        this.setMaxDamage(336);
	}
}