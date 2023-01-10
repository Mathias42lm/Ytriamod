package fr.mathias42lm.ytria.proxy;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy
{
    public static int tesrRenderId;
    public static KeyBinding playerListKey = new KeyBinding("modtutoriel.playerList", Keyboard.KEY_N, "key.categories.misc");

    @Override
    public void registerRender()
    {


        tesrRenderId = RenderingRegistry.getNextAvailableRenderId();
    }

    @Override
    public void registerKeyBinding()
    {
        ClientRegistry.registerKeyBinding(playerListKey);
    }
    }