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
import scala.tools.nsc.backend.icode.TypeKinds.REFERENCE;

public class RegisterItems {
	public static Item coke;
	public static Item carteid;
	public static Item permis;
	public static Item Matraque;
	public static Item Cokeseed;
	public static Item Cokefeuille;
	public static Item Cbdseed;
	public static Item Fouille;
	public static Item encre;
	public static Item battrie;
	public static Item cbd;
	public static Item ppa;
	public static Item ppamili;
	public static Item permischasse;
	public static Item argent10,argent20,argent30,argent40,argent50,argent100,argent500,argent1000,fauxargent20;
	public static Item tablet, pince, info;
	
	public static ToolMaterial Ytriatool = EnumHelper.addToolMaterial("Ytria", 5, 100000, -2, -2, 0);
	
	
	public static void init() {
		coke = new Item().setUnlocalizedName("coke").setMaxStackSize(16).setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID + ":coke");
		carteid = new Item().setUnlocalizedName("carte-id").setMaxStackSize(1).setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID + ":carte_id");
		permis = new Item().setUnlocalizedName("permis").setMaxStackSize(1).setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID+":permis");
		Matraque = new ItemSwords(Ytriatool).setCreativeTab(Main.ytriaTab).setUnlocalizedName("Matraque").setTextureName(Reference.MOD_ID+":matraque");
		Cokeseed = new ItemSeedsMod(RegisterBlocks.Cokebasef, Blocks.farmland).setUnlocalizedName("Cokeseed").setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID+":cokeseed");
		Cokefeuille = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("Feuille_de_Coke").setMaxStackSize(16).setTextureName(Reference.MOD_ID+":cokefeuille");
		Cbdseed = new ItemSeedsMod(RegisterBlocks.Cokebasem, Blocks.farmland).setUnlocalizedName("CBDseed").setTextureName(Reference.MOD_ID+":cbdseed").setCreativeTab(Main.ytriaTab);
		Fouille = new Item().setCreativeTab(Main.ytriaTab).setTextureName(Reference.MOD_ID+":fouille").setMaxStackSize(1).setUnlocalizedName("fouille");
		encre = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("Encreprinter").setTextureName(Reference.MOD_ID+":encre");
		battrie = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("Battrieprinter").setTextureName(Reference.MOD_ID+":battrieprinter").setMaxStackSize(1);
		argent10 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("10").setTextureName(Reference.MOD_ID+":10");
		argent20 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("20").setTextureName(Reference.MOD_ID+":20");
		argent30 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("30").setTextureName(Reference.MOD_ID+":30");
		argent40 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("40").setTextureName(Reference.MOD_ID+":40");
		argent50 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("50").setTextureName(Reference.MOD_ID+":50");
		argent100 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("100").setTextureName(Reference.MOD_ID+":100");
		argent500 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("500").setTextureName(Reference.MOD_ID+":500");
		argent1000 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("1000").setTextureName(Reference.MOD_ID+":1000");
		cbd = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("cbd").setMaxStackSize(16).setTextureName(Reference.MOD_ID+":cbd");
		fauxargent20 = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("20faux").setTextureName(Reference.MOD_ID+":20faux");
		ppa = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("ppa").setMaxStackSize(1).setTextureName(Reference.MOD_ID+":ppa");
		ppamili = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("ppamili").setMaxStackSize(1).setTextureName(Reference.MOD_ID+":ppamili");
		permischasse = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("permis_de_chasse").setMaxStackSize(1).setTextureName(Reference.MOD_ID+":permiddechasse");
		tablet = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("tablet").setMaxStackSize(1).setTextureName(Reference.MOD_ID+":tablet");
		pince = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("pince").setMaxStackSize(1).setTextureName(Reference.MOD_ID+":pince");
		info = new Item().setCreativeTab(Main.ytriaTab).setUnlocalizedName("info").setMaxStackSize(1).setTextureName(Reference.MOD_ID+":info");
	
	}
	
	
	public static void register() {
		GameRegistry.registerItem(coke, "Coke");
		GameRegistry.registerItem(carteid, "Carte-id");
		GameRegistry.registerItem(permis, "Permis");
		GameRegistry.registerItem(Matraque, "Matraque");
		GameRegistry.registerItem(Cokeseed, "Cokeseed");
		GameRegistry.registerItem(Cokefeuille, "cokefeuille");
		GameRegistry.registerItem(Cbdseed, "cbdseed");
		GameRegistry.registerItem(Fouille, "Batondefouille");
		GameRegistry.registerItem(encre,"encreprinter" );
		GameRegistry.registerItem(battrie,"battrieprinter" );
		GameRegistry.registerItem(argent10,"argent10" );
		GameRegistry.registerItem(argent20,"argent20" );
		GameRegistry.registerItem(argent30,"argent30" );
		GameRegistry.registerItem(argent40, "argent40");
		GameRegistry.registerItem(argent50, "argent50");
		GameRegistry.registerItem(argent100,"argent100");
		GameRegistry.registerItem(argent500,"argent500");
		GameRegistry.registerItem(argent1000, "argent1000");
		GameRegistry.registerItem(fauxargent20, "fauxargent20");
		GameRegistry.registerItem(cbd, "cbd");
		GameRegistry.registerItem(ppa,"ppa");
		GameRegistry.registerItem(ppamili,"ppamili");
		GameRegistry.registerItem(permischasse, "permischasse");
		GameRegistry.registerItem(tablet,"tablet");
		GameRegistry.registerItem(pince,"pince");
		GameRegistry.registerItem(info,"info");
	}
	
}
