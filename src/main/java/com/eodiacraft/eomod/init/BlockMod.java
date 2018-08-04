package com.eodiacraft.eomod.init;

import com.eodiacraft.eomod.ModEodia;
import com.eodiacraft.eomod.Reference;
import com.eodiacraft.eomod.blocks.BlockBasic;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BlockMod
{
    public static Block eonite_block, eonite_ore, sophrate_block, sophrate_ore, mentarium_block, mentarium_ore, nacre_block, nacre_ore, eobsie;

    public static void init()
    {
        eonite_block = new BlockBasic(Material.rock, 3).setBlockName("eonite_block").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":eonite_block").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(20.0F);
        eonite_ore = new BlockBasic(Material.rock, 10).setBlockName("eonite_ore").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":eonite_ore").setResistance(20.0F).setHardness(20.0F);

        sophrate_block = new BlockBasic(Material.rock, 3).setBlockName("sophrate_block").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":sophrate_block").setResistance(20.0F).setStepSound(Block.soundTypeMetal).setHardness(20.0F);
        sophrate_ore = new BlockBasic(Material.rock, 12).setBlockName("sophrate_ore").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":sophrate_ore").setResistance(20.0F).setHardness(20.0F);

        mentarium_block = new BlockBasic(Material.rock, 3).setBlockName("mentarium_block").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":mentarium_block").setResistance(20.0F).setStepSound(Block.soundTypeMetal).setHardness(20.0F);
        mentarium_ore = new BlockBasic(Material.rock, 8).setBlockName("mentarium_ore").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":mentarium_ore").setResistance(20.0F).setHardness(20.0F);

        nacre_block = new BlockBasic(Material.rock, 3).setBlockName("nacre_block").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":nacre_block").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(20.0F);
        nacre_ore = new BlockBasic(Material.rock, 3).setBlockName("nacre_ore").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":nacre_ore").setResistance(20.0F).setHardness(20.0F);

        eobsie = new BlockBasic(Material.rock, 12).setBlockName("eobsie").setCreativeTab(ModEodia.tabEomod).setBlockTextureName(Reference.MOD_ID + ":eobsie").setResistance(100.0F).setHardness(100.F);
    }

    public static void register()
    {
        GameRegistry.registerBlock(eonite_block, eonite_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(eonite_ore, eonite_ore.getUnlocalizedName().substring(5));

        GameRegistry.registerBlock(sophrate_block, sophrate_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(sophrate_ore, sophrate_ore.getUnlocalizedName().substring(5));

        GameRegistry.registerBlock(mentarium_block, mentarium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(mentarium_ore, mentarium_ore.getUnlocalizedName().substring(5));

        GameRegistry.registerBlock(nacre_block, nacre_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nacre_ore, nacre_ore.getUnlocalizedName().substring(5));

        GameRegistry.registerBlock(eobsie, eobsie.getUnlocalizedName().substring(5));

        GameRegistry.addRecipe(new ItemStack(BlockMod.eonite_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.eonite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite, 9), new Object[]{"#", '#', BlockMod.eonite_block});

        GameRegistry.addRecipe(new ItemStack(BlockMod.sophrate_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.sophrate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate, 9), new Object[]{"#", '#', BlockMod.sophrate_block});

        GameRegistry.addRecipe(new ItemStack(BlockMod.mentarium_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.mentarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium, 9), new Object[]{"#", '#', BlockMod.mentarium_block});

        GameRegistry.addRecipe(new ItemStack(BlockMod.nacre_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.nacre});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre, 9), new Object[]{"#", '#', BlockMod.nacre_block});

        GameRegistry.addRecipe(new ItemStack(BlockMod.eobsie, 2), new Object[]{"###", "#O#", "###", '#', Blocks.obsidian, 'O', BlockMod.eonite_block});

        GameRegistry.addSmelting(BlockMod.eonite_ore, new ItemStack(ItemMod.eonite, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.sophrate_ore, new ItemStack(ItemMod.sophrate_nugget, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.mentarium_ore, new ItemStack(ItemMod.mentarium, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.nacre_ore, new ItemStack(ItemMod.nacre, 2), 1.0F);



    }
}
