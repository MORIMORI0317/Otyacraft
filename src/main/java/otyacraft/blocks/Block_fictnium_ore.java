package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_fictnium_ore extends Block {
    public Block_fictnium_ore() {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,"fictnium_ore");
        this.setUnlocalizedName("fictniumore");
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(SoundType.STONE);
        this.setHardness(3.0F);
        this.setResistance(0.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setBlockUnbreakable();
    }
    }