package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_oc_nomal extends Block {
    public Block_oc_nomal(String RegistrynameIn,String nlocalizedNameIn, Material mateIn,SoundType soundIn,float Hardness,float Resistance,int havestL,String tooin) {
        super(mateIn);
        this.setRegistryName(Variable.MODID,RegistrynameIn);
        this.setUnlocalizedName(nlocalizedNameIn);
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(soundIn);
        this.setHardness(Hardness);
        this.setResistance(Resistance);
        this.setHarvestLevel(tooin, havestL);
    }
}