package com.eodiacraft.eomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block
{

    public BlockBasic(Material p_i45397_1_, int level)
    {
        super(p_i45397_1_);
        this.setHarvestLevel("pickaxe", level);
    }
}
