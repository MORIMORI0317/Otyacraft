package com.morimori.otyacraft.blocks;

import java.util.Random;

import com.morimori.otyacraft.blocks.nomalblastfurnace.NomalBlastFurnaceTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class NomalBlastFurnaceBlock extends ContainerBlock{
	   public static final DirectionProperty field_220090_a = HorizontalBlock.HORIZONTAL_FACING;
	   public static final BooleanProperty field_220091_b = RedstoneTorchBlock.LIT;

	   protected NomalBlastFurnaceBlock(Block.Properties p_i49992_1_) {
		      super(p_i49992_1_.lightValue(13));
		      this.setDefaultState(this.stateContainer.getBaseState().with(field_220090_a, Direction.NORTH).with(field_220091_b, Boolean.valueOf(false)));

		   }

	   public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		      if (!worldIn.isRemote) {
		        this.func_220089_a(worldIn, pos, player);
		      }

		      return true;
		   }
		@SuppressWarnings("deprecation")
		@Override
	   public int getLightValue(BlockState state) {
		      return state.get(field_220091_b) ? super.getLightValue(state) : 0;
		   }
		@SuppressWarnings("deprecation")
		@Override
		   public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		      if (state.getBlock() != newState.getBlock()) {
		         TileEntity tileentity = worldIn.getTileEntity(pos);
		         if (tileentity instanceof AbstractFurnaceTileEntity) {
		            InventoryHelper.dropInventoryItems(worldIn, pos, (AbstractFurnaceTileEntity)tileentity);
		            worldIn.updateComparatorOutputLevel(pos, this);
		         }

		         super.onReplaced(state, worldIn, pos, newState, isMoving);
		      }
		   }

		   public TileEntity createNewTileEntity(IBlockReader worldIn) {
		      return new NomalBlastFurnaceTileEntity();
		   }

		   protected void func_220089_a(World p_220089_1_, BlockPos p_220089_2_, PlayerEntity p_220089_3_) {
		      TileEntity tileentity = p_220089_1_.getTileEntity(p_220089_2_);
		      if (tileentity instanceof NomalBlastFurnaceTileEntity) {


		         p_220089_3_.openContainer((INamedContainerProvider)tileentity);
		         p_220089_3_.addStat(Stats.INTERACT_WITH_BLAST_FURNACE);
		      }

		   }

		   /**
		    * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
		    * this method is unrelated to {@link randomTick} and {@link #needsRandomTick}, and will always be called regardless
		    * of whether the block can receive random update ticks
		    */
		   @OnlyIn(Dist.CLIENT)
		   public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		      if (stateIn.get(field_220091_b)) {
		         double d0 = (double)pos.getX() + 0.5D;
		         double d1 = (double)pos.getY();
		         double d2 = (double)pos.getZ() + 0.5D;
		         if (rand.nextDouble() < 0.1D) {
		            worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_BLASTFURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
		         }

		         Direction direction = stateIn.get(field_220090_a);
		         Direction.Axis direction$axis = direction.getAxis();
		         double d4 = rand.nextDouble() * 0.6D - 0.3D;
		         double d5 = direction$axis == Direction.Axis.X ? (double)direction.getXOffset() * 0.52D : d4;
		         double d6 = rand.nextDouble() * 9.0D / 16.0D;
		         double d7 = direction$axis == Direction.Axis.Z ? (double)direction.getZOffset() * 0.52D : d4;
		         worldIn.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
		         worldIn.addParticle(ParticleTypes.LAVA, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, 0.0D, 0.0D, 0.0D);

		      }

		      if (stateIn.get(field_220091_b)) {

		             worldIn.playSound((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.6F, false);
		             func_220098_a(worldIn, pos.add(0, 1, 0), blocksMovement, blocksMovement);

		   }

		   }
		   public BlockState getStateForPlacement(BlockItemUseContext context) {
			      return this.getDefaultState().with(field_220090_a, context.getPlacementHorizontalFacing().getOpposite());
			   }
		   public BlockRenderType getRenderType(BlockState state) {
			      return BlockRenderType.MODEL;
			   }

		   public static void func_220098_a(World p_220098_0_, BlockPos pos, boolean p_220098_2_, boolean p_220098_3_) {
			      Random random = p_220098_0_.getRandom();
			      BasicParticleType basicparticletype = p_220098_2_ ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;
			      p_220098_0_.func_217404_b(basicparticletype, true, (double)pos.getX() + 0.5D + random.nextDouble() / 3.0D * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + random.nextDouble() + random.nextDouble(), (double)pos.getZ() + 0.5D + random.nextDouble() / 3.0D * (double)(random.nextBoolean() ? 1 : -1), 0.0D, 0.07D, 0.0D);
			      if (p_220098_3_) {
			         p_220098_0_.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1), 0.0D, 0.005D, 0.0D);
			      }

			   }
		   public BlockState rotate(BlockState state, Rotation rot) {
			      return state.with(field_220090_a, rot.rotate(state.get(field_220090_a)));
			   }


			   public BlockState mirror(BlockState state, Mirror mirrorIn) {
			      return state.rotate(mirrorIn.toRotation(state.get(field_220090_a)));
			   }
		   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			      builder.add(field_220090_a, field_220091_b);
			   }
		}