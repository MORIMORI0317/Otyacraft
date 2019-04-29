package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;

public class Block_test extends Block {
    public Block_test() {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,"test_block");
        this.setUnlocalizedName("testblock");
        this.setSoundType(SoundType.GLASS);
        this.setHardness(10.0F);
        this.setResistance(50.0F);
    }
}