package com.eodiacraft.eomod;

import com.eodiacraft.eomod.init.BlockMod;
import com.eodiacraft.eomod.init.ItemMod;
import com.eodiacraft.eomod.proxy.CommonProxy;
import com.eodiacraft.eomod.world.WorldRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModEodia
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabEomod = new CreativeTabs("tabEomod")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemMod.eonite;
        }


    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemMod.init();
        ItemMod.register();
        BlockMod.init();
        BlockMod.register();
        WorldRegister.mainRegistry();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
