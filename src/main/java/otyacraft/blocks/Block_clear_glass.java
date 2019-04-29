package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_clear_glass extends Block {
    public Block_clear_glass() {
        super(Material.GLASS);
        this.setRegistryName(Variable.MODID,"clear_glass");
        this.setUnlocalizedName("clearglass");
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(SoundType.GLASS);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
    }
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;

    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;


}}