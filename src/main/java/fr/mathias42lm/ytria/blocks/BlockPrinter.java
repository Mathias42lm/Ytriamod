package fr.mathias42lm.ytria.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mathias42lm.ytria.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockPrinter extends Block {

	private IIcon top,ecran;
	
	public BlockPrinter(Material Material) {
		super(Material);
	}
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(Reference.MOD_ID+":printer");
        this.ecran = p_149651_1_.registerIcon(Reference.MOD_ID+":printerface");
    }
	
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
    {
        int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        
        world.setBlockMetadataWithNotify(x, y, z, direction, 2);
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) 
	{
		if((side==3 && metadata == 0) ||(side== 4 && metadata == 1) || (side==2 && metadata == 2)|| (side== 5 && metadata == 3)) 
		{
			return this.ecran;
		}
		return this.blockIcon;
	}

}
