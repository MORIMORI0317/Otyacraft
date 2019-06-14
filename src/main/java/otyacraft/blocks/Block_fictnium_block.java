package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_fictnium_block extends Block {
    public Block_fictnium_block() {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,"fictnium_block");
        this.setUnlocalizedName("fictniumblock");
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(OCCreativetabs.OCTAB);
        this.setHardness(3.0F);
        this.setResistance(0.0F);
    }
}