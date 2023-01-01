package fr.mathias42lm.ytria.init;

import com.jcraft.jorbis.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathias42lm.ytria.Main;
import fr.mathias42lm.ytria.Items.ItemSeedsMod;
import fr.mathias42lm.ytria.Items.ItemSwords;
import fr.mathias42lm.ytria.utils.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.util.EnumHelper;

public class RegisterItems {
	public static Item coke;
	public static Item carteid;
	public static Item permis;
	public static Item Matraque;
	public static Item Cokeseed;
	public static Item Cokefeuille;
	public static Item Cbdseed;
	
	public static ToolMaterial Ytriatool = EnumHelper.addToolMaterial("Ytria", 5, 100000, -2, -2, 0);
	
	
	public static void init() {
		coke = new Item().setUnlocalizedName("coke").setMaxStackSize(16).setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID + ":coke");
		carteid = new Item().setUnlocalizedName("carte-id").setMaxStackSize(1).setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID + ":carte_id");
		permis = new Item().setUnlocalizedName("permis").setMaxStackSize(1).setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID+":permis");
		Matraque = new ItemSwords(Ytriatool).setCreativeTab(Main.ytriaTab).setUnlocalizedName("Matraque").setTextureName(Reference.MOD_ID+":matraque");
		Cokeseed = new ItemSeedsMod(RegisterBlocks.Cokebasef, Blocks.farmland).setUnlocalizedName("Cokeseed").setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID+":cokeseed");
		Cokefeuille = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("Feuille_de_Coke").setMaxStackSize(16).setTextureName(Reference.MOD_ID+":cokefeuille");
		Cbdseed = new ItemSeedsMod(RegisterBlocks.Cokebasem, Blocks.farmland).setUnlocalizedName("CBDseed").setMaxStackSize(16).setTextureName(Reference.MOD_ID+":cbdseed").setCreativeTab(Main.ytriaTab);
	}
	
	
	public static void register() {
		GameRegistry.registerItem(coke, "Coke");
		GameRegistry.registerItem(carteid, "Carte-id");
		GameRegistry.registerItem(permis, "Permis");
		GameRegistry.registerItem(Matraque, "Matraque");
		GameRegistry.registerItem(Cokeseed, "Cokeseed");
		GameRegistry.registerItem(Cokefeuille, "cokefeuille");
		GameRegistry.registerItem(Cbdseed, "cbdseed");
		
	}
	
}
