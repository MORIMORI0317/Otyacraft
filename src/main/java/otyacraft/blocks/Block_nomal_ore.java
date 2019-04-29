package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_nomal_ore extends Block {
    public Block_nomal_ore(String name, float Hardness ,float Resistance,int HarvestLevel ) {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,name+"_ore");
        this.setUnlocalizedName(name+"ore");
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(SoundType.STONE);
        this.setHardness(Hardness);
        this.setResistance(Resistance);
        this.setHarvestLevel("pickaxe", HarvestLevel);
    }
}