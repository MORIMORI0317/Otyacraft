package otyacraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import otyacraft.Variable;
import otyacraft.items.OCitems;

public class Block_tea_crop extends BlockCrops {
    public Block_tea_crop() {
        super();
        this.setRegistryName(Variable.MODID,"tea_crop");
        this.setUnlocalizedName("teacrop");
    }
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {

        return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : false;
    }


    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {

        if (!this.canBlockStay(worldIn, pos))
        {
            worldIn.destroyBlock(pos, true);
        }
    }

    public boolean canBlockStay(World worldIn, BlockPos pos)
    {
      for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
        {
          IBlockState state = worldIn.getBlockState(pos.down());
          Block block = state.getBlock();

            if (block != Blocks.FARMLAND)
            {
                return false;
            }

}
		return true;
}
    protected Item getSeed()
    {
        return OCitems.TEA_SEED;
    }
    protected Item getflower()
    {
        return OCitems.TEA_FLOWER;
    }
    protected Item getCrop()
    {
        return OCitems.TEA_LEAVES;
    }
    public int getsixAge()
    {
        return 6;
    }
    public int getfiveAge()
    {
        return 5;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        int age = getAge(state);

        if(age >= getMaxAge()) {
        return this.getSeed();

    }
        if(age == getsixAge()) {
        return this.getflower();

    }
        return null;
    }

    @Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {

        super.getDrops(drops, world, pos, state, 0);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getfiveAge())
        {
            int k = 3 + fortune;

            for (int i = 0; i < 3 + fortune; ++i)
            {
                if (rand.nextInt(2 * getfiveAge()) <= age)
                {
                    drops.add(new ItemStack(this.getCrop(), 3, 0));
                }
            }
        }


}

}





