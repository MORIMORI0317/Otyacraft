package otyacraft.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;
import otyacraft.items.OCitems;

public class Block_realite_ore extends Block {
    public Block_realite_ore() {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,"realite_ore");
        this.setUnlocalizedName("realiteore");
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setSoundType(SoundType.STONE);
        this.setHardness(0F);
        this.setResistance(99999F);
        this.setHarvestLevel("pickaxe", 3);
        this.setLightOpacity(1);
    }
    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn,
            BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes,
                    @Nullable Entity entityIn, boolean p_185477_7_) {
        addCollisionBoxToList(pos, entityBox, collidingBoxes, null);

    }
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;

    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;


}

public Item getItemDropped(IBlockState state, Random rand, int fortune)
{

        return OCitems.REALITE;


}
public int quantityDropped(Random random)
{
    return random.nextInt(2);
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

        return this.quantityDropped(random) * (i + 1);
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
@Override
public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
{
    Random rand = world instanceof World ? ((World)world).rand : new Random();
    if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
    {
        int i = 0;

            i = MathHelper.getInt(rand, 0, 2);
        return i;
    }
    return 0;
}

public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
{
    return new ItemStack(this);
}
}