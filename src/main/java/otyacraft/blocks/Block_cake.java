package otyacraft.blocks;

import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import otyacraft.Variable;

public class Block_cake extends BlockCake {
    public Block_cake(String name) {
        super();
        this.setRegistryName(Variable.MODID,name+"_cake");
        this.setUnlocalizedName(name+"cake");
        this.setHardness(0.5F);
        this.setSoundType(SoundType.CLOTH);
        this.disableStats();

    }
}