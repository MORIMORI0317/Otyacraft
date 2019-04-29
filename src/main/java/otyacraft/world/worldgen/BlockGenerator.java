package otyacraft.world.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import otyacraft.blocks.OCblocks;

public class BlockGenerator implements IWorldGenerator {

	public boolean coppergen=true;
	public boolean tingen=true;
	public boolean leadgen=true;
	public boolean nickelgen=true;
	public boolean silvergen=true;
	public boolean rubygen=true;
	public boolean sapphiregen=true;
	public boolean centerloregen=true;
	public long centerloregenX=0;
	public long centerloregenZ=0;
	public boolean realitegen=true;
	public boolean fictniumgen=true;
	public boolean wild_tea_seedlings=true;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    	generateore(random,chunkX,chunkZ,world,chunkGenerator,chunkProvider);

    }

    public void generateore(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    		if(coppergen==true) {
    	OreGenHinagata.oregen(OCblocks.COPPER_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,68,0,3+random.nextInt(10),25);
       	OreGenHinagata.oregen(OCblocks.COPPER_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,52,5,3+random.nextInt(10),5);
    		}
    		if(tingen==true) {
    	OreGenHinagata.oregen(OCblocks.TIN_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,68,0,3+random.nextInt(10),25);
       	OreGenHinagata.oregen(OCblocks.TIN_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,52,5,3+random.nextInt(10),5);
    		}
    		if(leadgen==true) {
    	OreGenHinagata.oregen(OCblocks.LEAD_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,68,0,3+random.nextInt(10),25);
       	OreGenHinagata.oregen(OCblocks.LEAD_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,52,5,3+random.nextInt(10),5);
    		}
    		if(nickelgen==true) {
    	OreGenHinagata.oregen(OCblocks.NICKEL_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,68,0,3+random.nextInt(10),25);
       	OreGenHinagata.oregen(OCblocks.NICKEL_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,52,5,3+random.nextInt(10),5);
    		}
    		if(silvergen==true) {
    	OreGenHinagata.oregen(OCblocks.SILVER_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,34,0,3+random.nextInt(5),12);
       	OreGenHinagata.oregen(OCblocks.SILVER_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,29,5,3+random.nextInt(5),2);
    		}
    		if(rubygen==true) {
    	OreGenHinagata.oregen(OCblocks.RUBY_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,16,0,3+random.nextInt(5),6);
       	OreGenHinagata.oregen(OCblocks.RUBY_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,12,2,3+random.nextInt(5),1);
    		}
    		if(sapphiregen==true) {
    	OreGenHinagata.oregen(OCblocks.SAPPHIRE_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,16,0,3+random.nextInt(5),6);
       	OreGenHinagata.oregen(OCblocks.SAPPHIRE_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,12,2,3+random.nextInt(5),1);
    		}
    		if(centerloregen==true) {
    	OreGenHinagata.centerloregen(OCblocks.CENTERL_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,68,0,3+random.nextInt(10),250,centerloregenX,centerloregenZ);
    		}
    		if(realitegen==true) {
    	OreGenHinagata.realiteoregen(world,random,chunkX*16,chunkZ*16);
    		}
    		if(fictniumgen==true) {
    	OreGenHinagata.fictoniumoregen(world,random,chunkX*16,chunkZ*16);
    		}



    		if(wild_tea_seedlings==true) {
    	PlantGenHinagata.wild_tea_seedlingsgen(world,random,chunkX*16,chunkZ*16);
    		}
    }


}
