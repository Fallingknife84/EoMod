package com.eodiacraft.eomod.items;

import com.eodiacraft.eomod.Reference;
import com.eodiacraft.eomod.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class SophrateArmor extends ItemArmor
{
    public SophrateArmor(ArmorMaterial material, int metaData)
    {
        super(material, 0, metaData);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ItemMod.sophrate_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/sophrate_layer_2.png";
        }

        else if (stack.getItem() == ItemMod.sophrate_helmet || stack.getItem() == ItemMod.sophrate_chestplate || stack.getItem() == ItemMod.sophrate_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/sophrate_layer_1.png";
        }

        return null;

    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if(itemStack.getItem() == ItemMod.sophrate_chestplate)
        {
            player.addPotionEffect(new PotionEffect(14, 50, 0));
        }
        else if(itemStack.getItem() == ItemMod.sophrate_helmet)
        {
            player.addPotionEffect(new PotionEffect(16, 50, 0));
        }
        else if(itemStack.getItem() == ItemMod.sophrate_chestplate && itemStack.getItem() == ItemMod.sophrate_helmet && itemStack.getItem() == ItemMod.sophrate_leggings && itemStack.getItem() == ItemMod.sophrate_boots)
        {
            player.addPotionEffect(new PotionEffect(21, 50, 7));
            player.addPotionEffect(new PotionEffect(11, 50, 2));
        }

    }
}
