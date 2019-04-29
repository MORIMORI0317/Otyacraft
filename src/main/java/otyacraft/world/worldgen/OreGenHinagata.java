package otyacraft.world.worldgen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import otyacraft.blocks.OCblocks;

public class OreGenHinagata {

    public static void oregen(IBlockState state, World world,Random random, int x, int z, int maxY, int minY, int size, int chance) {
    	int i = 0;
    	int haba =maxY-minY;
    	BlockMatcher okerutokoro = BlockMatcher.forBlock(Blocks.STONE);

    	for (i = 0; i < chance; i++){

       	BlockPos pos = new BlockPos(x+random.nextInt(16),minY+random.nextInt(haba),z+random.nextInt(16));
       	IBlockState posblock = world.getBlockState(pos);
   	 if (posblock.getBlock().isReplaceableOreGen(posblock, world, pos, okerutokoro)) {
   		 WorldGenMinable generator = new WorldGenMinable(state,size);
    	generator.generate(world,random,pos);
   	 }}
    }
    public static void centerloregen(IBlockState state, World world,Random random, int x, int z, int maxY, int minY, int size, int chance,long Xbasyo,long Zbasyo) {

    	int i = 0;
    	int haba =maxY-minY;
    	BlockMatcher okerutokoro = BlockMatcher.forBlock(Blocks.STONE);
    	if(Xbasyo==x/16||Zbasyo==z/16) {
    	for (i = 0; i < chance; i++){

       	BlockPos pos = new BlockPos(x+random.nextInt(16),minY+random.nextInt(haba),z+random.nextInt(16));
       	IBlockState posblock = world.getBlockState(pos);
   	 if (posblock.getBlock().isReplaceableOreGen(posblock, world, pos, okerutokoro)) {
   		 WorldGenMinable generator = new WorldGenMinable(state,size);
    	generator.generate(world,random,pos);
   	 }}}
    	}

    public static void realiteoregen(World world,Random random, int x, int z) {


    	int i = 0;
    	int haba =240-230;

    	if(random.nextInt(300)==0) {

       	BlockPos pos = new BlockPos(x+random.nextInt(16),230+random.nextInt(haba),z+random.nextInt(16));
       	IBlockState posblock = world.getBlockState(pos);
       	WorldGenMinableotherOre generator = new WorldGenMinableotherOre(OCblocks.REALITE_ORE.getDefaultState(),10);
    	generator.generaterealte(world,random,pos);

   	 }}
    public static void fictoniumoregen(World world,Random random, int x, int z) {


    	int i = 0;
    	int haba =4-1;

    	if(random.nextInt(10)==0) {

       	BlockPos pos = new BlockPos(x+random.nextInt(16),1+random.nextInt(haba),z+random.nextInt(16));
       	IBlockState posblock = world.getBlockState(pos);
       	WorldGenMinableotherOre generator = new WorldGenMinableotherOre(OCblocks.FICTNIUM_ORE.getDefaultState(),10);
    	generator.generatefict(world,random,pos);

   	 }}
}
