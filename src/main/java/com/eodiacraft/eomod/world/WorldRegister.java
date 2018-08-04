package com.eodiacraft.eomod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
    public static void mainRegistry()
    {
        registerWorldGen(new WorldGenEoMod(), -1);
        registerWorldGen(new WorldGenEoMod(), 0);
        registerWorldGen(new WorldGenEoMod(), 1);
    }

    public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
