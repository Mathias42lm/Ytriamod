package fr.mathias42lm.ytria.init;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathias42lm.ytria.Main;
import fr.mathias42lm.ytria.blocks.BlockBase;
import fr.mathias42lm.ytria.blocks.BlockSeeds;
import fr.mathias42lm.ytria.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.material.Material;

public class RegisterBlocks {
	public static Block testblock;
	public static Block Cokebase;

	
	
	
	
	public static void init() {
		testblock= new BlockBase(Material.iron).setBlockName("testblock").setCreativeTab(Main.ytriaTab).setBlockTextureName(Reference.MOD_ID+":testblock").setHardness(4);
		Cokebase = new BlockSeeds().setBlockName("Cokebase").setBlockTextureName(Reference.MOD_ID+":cokebase").setHardness(5F);
	}
	
	
	
	
	public static void register() {
		GameRegistry.registerBlock(testblock, testblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Cokebase, Cokebase.getUnlocalizedName().substring(5));

	}
	
}
