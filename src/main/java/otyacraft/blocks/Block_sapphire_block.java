package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_sapphire_block extends Block {
    public Block_sapphire_block() {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,"sapphire_block");
        this.setUnlocalizedName("sapphireblock");
        this.setSoundType(SoundType.METAL);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(OCCreativetabs.BUILDING);
    }

}
