package com.eodiacraft.eomod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHellishGem extends Item
{
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
    {
        EntityPlayer player = (EntityPlayer)p_77663_3_;
        ItemStack equip = player.getCurrentEquippedItem();

        if(equip == p_77663_1_)
        {
            player.addPotionEffect(new PotionEffect(12, 100, 0));
        }
    }
}
