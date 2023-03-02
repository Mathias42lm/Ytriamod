package fr.mathias42lm.ytria.proxy;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy
{
	@Override
    public void registerRender()
    {
        System.out.println("méthode côté client");
    }
}
