package com.eodiacraft.eomod.items;
import com.eodiacraft.eomod.Reference;
import com.eodiacraft.eomod.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class NacreArmor extends ItemArmor {
    public NacreArmor(ArmorMaterial material, int metaData) {
        super(material, 0, metaData);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ItemMod.nacre_leggings) {
            return Reference.MOD_ID + ":textures/models/armor/nacre_layer_2.png";
        } else if (stack.getItem() == ItemMod.nacre_helmet || stack.getItem() == ItemMod.nacre_chestplate || stack.getItem() == ItemMod.nacre_boots) {
            return Reference.MOD_ID + ":textures/models/armor/nacre_layer_1.png";
        }

        return null;

    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem() == ItemMod.nacre_helmet) {
            player.addPotionEffect(new PotionEffect(16, 50, 0));
        } else if (itemStack.getItem() == ItemMod.nacre_chestplate && itemStack.getItem() == ItemMod.nacre_helmet && itemStack.getItem() == ItemMod.nacre_leggings && itemStack.getItem() == ItemMod.nacre_boots) {
            player.addPotionEffect(new PotionEffect(21, 50, 0));
        }
    }
}
