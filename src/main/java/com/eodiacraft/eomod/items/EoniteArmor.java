package com.eodiacraft.eomod.items;

import com.eodiacraft.eomod.Reference;
import com.eodiacraft.eomod.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EoniteArmor extends ItemArmor
{
    public EoniteArmor(ArmorMaterial material, int metaData)
    {
        super(material, 0, metaData);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.eonite_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/eonite_layer_2.png";
        }

        else if(stack.getItem() == ItemMod.eonite_helmet || stack.getItem() == ItemMod.eonite_chestplate || stack.getItem() ==  ItemMod.eonite_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/eonite_layer_1.png";
        }


        return null;
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (itemStack.getItem() == ItemMod.eonite_helmet) {
            player.addPotionEffect(new PotionEffect(16, 50, 0));
        } else if (itemStack.getItem() == ItemMod.eonite_chestplate && itemStack.getItem() == ItemMod.eonite_helmet && itemStack.getItem() == ItemMod.eonite_leggings && itemStack.getItem() == ItemMod.eonite_boots) {
            player.addPotionEffect(new PotionEffect(21, 50, 5));
            player.addPotionEffect(new PotionEffect(11, 50, 1));
        }
    }
}
