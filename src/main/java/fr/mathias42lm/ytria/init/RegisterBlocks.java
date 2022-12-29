package fr.mathias42lm.ytria.init;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathias42lm.ytria.Main;
import fr.mathias42lm.ytria.blocks.BlockBase;
import fr.mathias42lm.ytria.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.material.Material;

public class RegisterBlocks {
	public static Block testblock;
	public static Block Tri;

	
	
	
	
	public static void init() {
		testblock= new BlockBase(Material.iron).setBlockName("testblock").setCreativeTab(Main.ytriaTab).setBlockTextureName(Reference.MOD_ID+":testblock").setHardness(4);
		Tri = new BlockDoublePlant();
	}
	
	
	
	
	public static void register() {
		GameRegistry.registerBlock(testblock, testblock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Tri, "Tri");
	}
	
}
