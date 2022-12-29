package fr.mathias42lm.ytria.event;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.mathias42lm.ytria.init.RegisterBlocks;
import fr.mathias42lm.ytria.init.RegisterItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class EventBreak {
	public static double rand;
	public Random r = new Random();
	
	
	
	@SubscribeEvent
	public void onBlockDestroyed(HarvestDropsEvent event) {
		 if(event.block == RegisterBlocks.testblock) {
			 event.drops.add(new ItemStack(RegisterItems.coke));
		 }
	
		
	}
}
	

