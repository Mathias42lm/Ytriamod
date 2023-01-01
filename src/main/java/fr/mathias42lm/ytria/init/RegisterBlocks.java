package fr.mathias42lm.ytria.init;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathias42lm.ytria.Main;
import fr.mathias42lm.ytria.blocks.BlockBase;
import fr.mathias42lm.ytria.blocks.BlockSeedscokef;
import fr.mathias42lm.ytria.blocks.BlockSeedscokem;
import fr.mathias42lm.ytria.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.material.Material;

public class RegisterBlocks {
	public static Block testblock;
	public static Block Cokebasef;
	public static Block Cokebasem;

	
	
	
	
	public static void init() {
		testblock= new BlockBase(Material.iron).setBlockName("testblock").setCreativeTab(Main.ytriaTab).setBlockTextureName(Reference.MOD_ID+":testblock").setHardness(4);
		Cokebasef = new BlockSeedscokef().setBlockTextureName(Reference.MOD_ID+":cokebasef").setHardness(5).setBlockName("cokebasef");
		Cokebasem = new BlockSeedscokem().setBlockName("cokebasem").setBlockTextureName(Reference.MOD_ID+":cokebasem").setHardness(4);
	}
	
	
	
	
	public static void register() {
		GameRegistry.registerBlock(testblock, testblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Cokebasef, Cokebasef.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Cokebasem, Cokebasem.getUnlocalizedName().substring(5));

	}
	
}
