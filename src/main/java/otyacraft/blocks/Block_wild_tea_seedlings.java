package otyacraft.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
import otyacraft.items.OCitems;
public class Block_wild_tea_seedlings extends Block {
    protected static final AxisAlignedBB ATARI =
            new AxisAlignedBB(0.25D, 0D, 0.25D, 0.75, 1.25D, 0.75D);

  public Block_wild_tea_seedlings() {
        super(Material.WOOD);
        this.setRegistryName(Variable.MODID,"wild_tea_seedlings");
        this.setUnlocalizedName("wildteaseedlings");
        this.setCreativeTab(OCCreativetabs.OCTAB);
        this.setSoundType(SoundType.PLANT);
        this.setHardness(2.5F);
        this.setResistance(1.0F);
        this.setTickRandomly(false);

  }

	@Override
    public void addCollisionBoxToList(IBlockState state, World worldIn,
            BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes,
                    @Nullable Entity entityIn, boolean p_185477_7_) {
        addCollisionBoxToList(pos, entityBox, collidingBoxes, ATARI);

    }
    @Override
    public boolean isFullCube(IBlockState state) {

        return false;

    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {

        return false;


}
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {



    	return ATARI;
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

            if (block != Blocks.GRASS && block != Blocks.DIRT)
            {
                return false;
            }

}
		return true;
}
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		return OCitems.TEA_LEAVES;

    }
    public Item getItemDroppedseed()
    {
		return OCitems.TEA_SEED;

    }
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(10);
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

            return this.quantityDropped(random) * (i + 3);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);

    }
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : RANDOM;

        int count = quantityDropped(state, fortune, rand);
        for (int i = 0; i < count; i++)
        {
            Item item = this.getItemDropped(state, rand, fortune);
            Item itemseed = this.getItemDroppedseed();
            if (item != Items.AIR)
            {
                drops.add(new ItemStack(item, 1, this.damageDropped(state)));
                drops.add(new ItemStack(itemseed, rand.nextInt(3)-rand.nextInt(50), this.damageDropped(state)));

            }
        }
    }
}



