package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_ore_block extends Block {
    public Block_ore_block(String name,int havestL,float Hardness,float Resistance) {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,name+"_block");
        this.setUnlocalizedName(name+"block");
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(SoundType.METAL);
        this.setHardness(Hardness);
        this.setResistance(Resistance);
        this.setHarvestLevel("pickaxe", havestL);
    }
}