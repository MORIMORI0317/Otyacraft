package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_factory_block extends Block {

  public Block_factory_block(String name) {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,name+"_factory_block");
        this.setUnlocalizedName(name+"factoryblock");
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(SoundType.METAL);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
    }

}