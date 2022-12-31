package fr.mathias42lm.ytria.blocks;

import java.util.Random;

import fr.mathias42lm.ytria.init.RegisterBlocks;
import fr.mathias42lm.ytria.init.RegisterItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockSeeds extends BlockCrops {
	
	protected Item func_149866_i()
    {
        return Items.wheat_seeds;
    }
    protected Item func_149865_P()
    {
        return RegisterItems.coke;
    }
}
