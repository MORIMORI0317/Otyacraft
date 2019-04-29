package otyacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import otyacraft.Variable;
import otyacraft.creativetabs.OCCreativetabs;

public class Block_realite_block extends Block {
    public Block_realite_block() {
        super(Material.ROCK);
        this.setRegistryName(Variable.MODID,"realite_block");
        this.setUnlocalizedName("realiteblock");
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(OCCreativetabs.BUILDING);
        this.setHardness(0F);
        this.setResistance(99999F);
        this.setHarvestLevel("pickaxe", 3);
    }

@SideOnly(Side.CLIENT)
public int getRenderBlockPass()
{
return 0;
}
public boolean isOpaqueCube()
{
return false;
}
public boolean renderAsNormalBlock()
{
return false;
}
public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
return null;
}
}