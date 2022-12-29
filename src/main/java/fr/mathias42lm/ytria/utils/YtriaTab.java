package fr.mathias42lm.ytria.utils;

import fr.mathias42lm.ytria.init.RegisterItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class YtriaTab extends CreativeTabs {

	public YtriaTab(String l) {
		super(l);
	}
	
	
	
	@Override
	public Item getTabIconItem() {
		return RegisterItems.coke;
	}

}
