package fr.mathias42lm.ytria;

import org.lwjgl.opengl.Display;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathias42lm.ytria.init.RegisterBlocks;
import fr.mathias42lm.ytria.init.RegisterItems;
import fr.mathias42lm.ytria.proxy.CommonProxy;
import fr.mathias42lm.ytria.utils.Reference;
import fr.mathias42lm.ytria.utils.YtriaTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.Mod_VERSION)
public class Main {
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy CommonProxy ;
	
	public static CreativeTabs ytriaTab = new YtriaTab("ytriaTab");
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		RegisterBlocks.init();
		RegisterBlocks.register();
		RegisterItems.init();
		RegisterItems.register();
    	
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent e) {
    	if(e.getSide().isClient()) 
    		Display.setTitle("Ytria");
    		
		
	}
	
}
