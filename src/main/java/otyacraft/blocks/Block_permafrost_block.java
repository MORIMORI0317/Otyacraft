package otyacraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
import otyacraft.items.OCitems;

public class Block_permafrost_block extends Block {
    public Block_permafrost_block(String namein,String Rname) {
        super(Material.ICE);
        this.setRegistryName(Variable.MODID,Rname);
        this.setUnlocalizedName(namein);
        this.setCreativeTab(OCCreativetabs.OCTAB);
        this.setSoundType(SoundType.GLASS);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.slipperiness = 0.98F;
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {

            return OCitems.PERMAFROST_POWDER;


    }
    public int quantityDropped(Random random)
    {
        return 3+random.nextInt(4);
    }
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 2);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }


    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }
    }