package com.eodiacraft.eomod.init;

import com.eodiacraft.eomod.ModEodia;
import com.eodiacraft.eomod.Reference;
import com.eodiacraft.eomod.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;

public class ItemMod
{
    public static ToolMaterial toolSophrate = EnumHelper.addToolMaterial("SOPHRATE_TOOLS", 15, 5000, 50, 10, 50);
    public static ToolMaterial toolEonite = EnumHelper.addToolMaterial("EONITE_TOOLS", 12, 4500, 40, 9, 40);
    public static ToolMaterial toolMentarium = EnumHelper.addToolMaterial("MENTARIUM_TOOLS", 30, 4250, 13, 8, 35);
    public static ToolMaterial toolNacre = EnumHelper.addToolMaterial("NACRE_TOOLS", 8, 4000, 20, 7, 35);

    public static ArmorMaterial armorSophrate = EnumHelper.addArmorMaterial("SOPHRATE_ARMOR", 100, new int[]{10, 10, 10, 10}, 50);
    public static ArmorMaterial armorEonite = EnumHelper.addArmorMaterial("EONITE_ARMOR", 90, new int[]{8, 8, 8, 8}, 45);
    public static ArmorMaterial armorMentarium = EnumHelper.addArmorMaterial("MENTARIUM_ARMOR", 80, new int[]{7, 7, 7, 7}, 40);
    public static ArmorMaterial armorNacre = EnumHelper.addArmorMaterial("NACRE_ARMOR", 75, new int[]{6, 6, 6, 6}, 35);

    public static Item eonite, eonite_sword, eonite_pickaxe, eonite_axe, eonite_shovel, eonite_hoe, eonite_helmet, eonite_chestplate, eonite_leggings, eonite_boots, sophrate, sophrate_pickaxe, sophrate_sword, sophrate_axe, sophrate_shovel, sophrate_hoe, sophrate_helmet, sophrate_chestplate, sophrate_leggings, sophrate_boots, sophrate_nugget, mentarium, mentarium_sword, mentarium_pickaxe, mentarium_axe, mentarium_shovel, mentarium_hoe, mentarium_helmet, mentarium_chestplate, mentarium_leggings, mentarium_boots, nacre, nacre_crystal, nacre_plate, nacre_sword, nacre_pickaxe, nacre_axe, nacre_shovel, nacre_hoe, nacre_helmet, nacre_chestplate, nacre_leggings, nacre_boots, salt, hellish_gem;

    public static void init()
    {
        eonite = new Item().setUnlocalizedName("Eonite").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite");
        eonite_sword = new EoniteSword(ItemMod.toolEonite).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_sword").setUnlocalizedName("eonite_sword");
        eonite_pickaxe = new EonitePickaxe(ItemMod.toolEonite).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_pickaxe").setUnlocalizedName("eonite_pickaxe");
        eonite_axe = new EoniteAxe(ItemMod.toolEonite).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_axe").setUnlocalizedName("eonite_axe");
        eonite_shovel = new EoniteSpade(ItemMod.toolEonite).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_shovel").setUnlocalizedName("eonite_shovel");
        eonite_hoe = new EoniteHoe(ItemMod.toolEonite).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_hoe").setUnlocalizedName("eonite_hoe");
        eonite_helmet = new EoniteArmor(armorEonite, 0).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_helmet").setUnlocalizedName("eonite_helmet");
        eonite_chestplate = new EoniteArmor(armorEonite, 1).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_chestplate").setUnlocalizedName("eonite_chestplate");
        eonite_leggings = new EoniteArmor(armorEonite, 2).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_leggings").setUnlocalizedName("eonite_leggings");
        eonite_boots = new EoniteArmor(armorEonite, 3).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":eonite_boots").setUnlocalizedName("eonite_boots");

        sophrate = new Item().setUnlocalizedName("Sophrate").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate");
        sophrate_pickaxe = new EonitePickaxe(ItemMod.toolSophrate).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_pickaxe").setUnlocalizedName("sophrate_pickaxe");
        sophrate_sword = new EoniteSword(ItemMod.toolSophrate).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_sword").setUnlocalizedName("sophrate_sword");
        sophrate_axe = new EoniteAxe(ItemMod.toolSophrate).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_axe").setUnlocalizedName("sophrate_axe");
        sophrate_shovel = new EoniteSpade(ItemMod.toolSophrate).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_shovel").setUnlocalizedName("sophrate_shovel");
        sophrate_hoe = new EoniteHoe(ItemMod.toolSophrate).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_hoe").setUnlocalizedName("sophrate_hoe");
        sophrate_helmet = new SophrateArmor(armorSophrate, 0).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_helmet").setUnlocalizedName("sophrate_helmet");
        sophrate_chestplate = new SophrateArmor(armorSophrate, 1).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_chestplate").setUnlocalizedName("sophrate_chestplate");
        sophrate_leggings = new SophrateArmor(armorSophrate, 2).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_leggings").setUnlocalizedName("sophrate_leggings");
        sophrate_boots = new SophrateArmor(armorSophrate, 3).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_boots").setUnlocalizedName("sophrate_boots");
        sophrate_nugget = new Item().setUnlocalizedName("sophrate_nugget").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":sophrate_nugget");

        mentarium = new Item().setUnlocalizedName("Mentarium").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium");
        mentarium_sword = new EoniteSword(ItemMod.toolMentarium).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_sword").setUnlocalizedName("mentarium_sword");
        mentarium_pickaxe = new EonitePickaxe(ItemMod.toolMentarium).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_pickaxe").setUnlocalizedName("mentarium_pickaxe");
        mentarium_axe = new EoniteAxe(ItemMod.toolMentarium).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_axe").setUnlocalizedName("mentarium_axe");
        mentarium_shovel = new EoniteSpade(ItemMod.toolMentarium).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_shovel").setUnlocalizedName("mentarium_shovel");
        mentarium_hoe = new EoniteHoe(ItemMod.toolMentarium).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_hoe").setUnlocalizedName("mentarium_hoe");
        mentarium_helmet = new MentariumArmor(armorMentarium, 0).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_helmet").setUnlocalizedName("mentarium_helmet");
        mentarium_chestplate = new MentariumArmor(armorMentarium, 1).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_chestplate").setUnlocalizedName("mentarium_chestplate");
        mentarium_leggings = new MentariumArmor(armorMentarium, 2).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_leggings").setUnlocalizedName("mentarium_leggings");
        mentarium_boots = new MentariumArmor(armorMentarium, 3).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":mentarium_boots").setUnlocalizedName("mentarium_boots");

        nacre = new Item().setUnlocalizedName("Nacre").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre");
        nacre_crystal = new Item().setUnlocalizedName("nacre_crystal").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_crystal");
        nacre_plate = new Item().setUnlocalizedName("nacre_plate").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_plate");
        nacre_sword = new EoniteSword(ItemMod.toolNacre).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_sword").setUnlocalizedName("nacre_sword");
        nacre_pickaxe = new EonitePickaxe(ItemMod.toolNacre).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_pickaxe").setUnlocalizedName("nacre_pickaxe");
        nacre_axe = new EoniteAxe(ItemMod.toolNacre).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_axe").setUnlocalizedName("nacre_axe");
        nacre_shovel = new EoniteSpade(ItemMod.toolNacre).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_shovel").setUnlocalizedName("nacre_shovel");
        nacre_hoe = new EoniteHoe(ItemMod.toolNacre).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_hoe").setUnlocalizedName("nacre_hoe");
        nacre_helmet = new NacreArmor(armorNacre, 0).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_helmet").setUnlocalizedName("nacre_helmet");
        nacre_chestplate = new NacreArmor(armorNacre, 1).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_chestplate").setUnlocalizedName("nacre_chestplate");
        nacre_leggings = new NacreArmor(armorNacre, 2).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_leggings").setUnlocalizedName("nacre_leggings");
        nacre_boots = new NacreArmor(armorNacre, 3).setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":nacre_boots").setUnlocalizedName("nacre_boots");

        salt = new Item().setUnlocalizedName("salt").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":salt");
        hellish_gem = new ItemHellishGem().setUnlocalizedName("hellish_gem").setCreativeTab(ModEodia.tabEomod).setTextureName(Reference.MOD_ID + ":hellish_gem");
    }

    public static void register()
    {
        GameRegistry.registerItem(eonite, "eonite");
        GameRegistry.registerItem(eonite_sword, "eonite_sword");
        GameRegistry.registerItem(eonite_pickaxe, "eonite_pickaxe");
        GameRegistry.registerItem(eonite_axe, "eonite_axe");
        GameRegistry.registerItem(eonite_shovel, "eonite_shovel");
        GameRegistry.registerItem(eonite_hoe, "eonite_hoe");
        GameRegistry.registerItem(eonite_helmet, "eonite_helmet");
        GameRegistry.registerItem(eonite_chestplate, "eonite_chestplate");
        GameRegistry.registerItem(eonite_leggings, "eonite_leggings");
        GameRegistry.registerItem(eonite_boots, "eonite_boots");

        GameRegistry.registerItem(sophrate, "sophrate");
        GameRegistry.registerItem(sophrate_pickaxe, "sophrate_pickaxe");
        GameRegistry.registerItem(sophrate_sword, "sophrate_sword");
        GameRegistry.registerItem(sophrate_axe, "sophrate_axe");
        GameRegistry.registerItem(sophrate_shovel, "sophrate_shovel");
        GameRegistry.registerItem(sophrate_hoe, "sophrate_hoe");
        GameRegistry.registerItem(sophrate_helmet, "sophrate_helmet");
        GameRegistry.registerItem(sophrate_chestplate, "sophrate_chestplate");
        GameRegistry.registerItem(sophrate_leggings, "sophrate_leggings");
        GameRegistry.registerItem(sophrate_boots, "sophrate_boots");
        GameRegistry.registerItem(sophrate_nugget, "sophrate_nugget");

        GameRegistry.registerItem(mentarium, "mentarium");
        GameRegistry.registerItem(mentarium_sword, "mentarium_sword");
        GameRegistry.registerItem(mentarium_pickaxe, "mentarium_pickaxe");
        GameRegistry.registerItem(mentarium_axe, "mentarium_axe");
        GameRegistry.registerItem(mentarium_shovel, "mentarium_shovel");
        GameRegistry.registerItem(mentarium_hoe, "mentarium_hoe");
        GameRegistry.registerItem(mentarium_helmet, "mentarium_helmet");
        GameRegistry.registerItem(mentarium_chestplate, "mentarium_chestplate");
        GameRegistry.registerItem(mentarium_leggings, "mentarium_leggings");
        GameRegistry.registerItem(mentarium_boots, "mentarium_boots");

        GameRegistry.registerItem(nacre, "nacre");
        GameRegistry.registerItem(nacre_crystal, "nacre_crystal");
        GameRegistry.registerItem(nacre_plate, "nacre_plate");
        GameRegistry.registerItem(nacre_sword, "nacre_sword");
        GameRegistry.registerItem(nacre_pickaxe, "nacre_pickaxe");
        GameRegistry.registerItem(nacre_axe, "nacre_axe");
        GameRegistry.registerItem(nacre_shovel, "nacre_shovel");
        GameRegistry.registerItem(nacre_hoe, "nacre_hoe");
        GameRegistry.registerItem(nacre_helmet, "nacre_helmet");
        GameRegistry.registerItem(nacre_chestplate, "nacre_chestplate");
        GameRegistry.registerItem(nacre_leggings, "nacre_leggings");
        GameRegistry.registerItem(nacre_boots, "nacre_boots");

        GameRegistry.registerItem(salt, "salt");
        GameRegistry.registerItem(hellish_gem, "hellish_gem");

        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_sword, 1), new Object[]{" # ", " # ", " O " , '#', ItemMod.eonite, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_pickaxe, 1), new Object[]{"###", " O ", " O ", '#', ItemMod.eonite, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_axe, 1), new Object[]{"## ", "#O ", " O ", '#', ItemMod.eonite, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_shovel, 1), new Object[]{" # ", " O ", " O ", '#', ItemMod.eonite, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_hoe, 1), new Object[]{"## ", " O ", " O ", '#', ItemMod.eonite, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.eonite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.eonite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.eonite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.eonite_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.eonite});

        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_pickaxe, 1), new Object[]{"###", " O ", " O ", '#', ItemMod.sophrate, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_sword, 1), new Object[]{" # ", " # ", " O ", '#', ItemMod.sophrate, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_axe, 1), new Object[]{"## ", "#O ", " O ", '#', ItemMod.sophrate, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_shovel, 1), new Object[]{" # ", " O ", " O ", '#', ItemMod.sophrate, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_hoe, 1), new Object[]{"## ", " O ", " O ", '#', ItemMod.sophrate, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.sophrate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.sophrate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.sophrate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.sophrate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate_nugget, 9), new Object[]{"#", '#', ItemMod.sophrate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sophrate, 1), new Object[]{"###", "###", "###", '#', ItemMod.sophrate_nugget});

        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_sword, 1), new Object[]{" # ", " # ", " O ", '#', ItemMod.mentarium, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_pickaxe, 1), new Object[]{"###", " O ", " O ", '#', ItemMod.mentarium, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_axe, 1), new Object[]{"## ", "#O ", " O ", '#', ItemMod.mentarium, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_shovel, 1), new Object[]{" # ", " O ", " O ", '#', ItemMod.mentarium, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_hoe, 1), new Object[]{"## ", " O ", " O ", '#', ItemMod.mentarium, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.mentarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.mentarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.mentarium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mentarium_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.mentarium});

        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_crystal, 1), new Object[]{" # ", "#O#", " # ", '#', ItemMod.salt, 'O', ItemMod.nacre});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_plate, 1), new Object[]{" # ", "#O#", " # ", '#', ItemMod.nacre, 'O', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_sword, 1), new Object[]{" # ", " # ", " O ", '#', ItemMod.nacre_crystal, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_pickaxe, 1), new Object[]{"###", " O ", " O ", '#', ItemMod.nacre_crystal, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_axe, 1), new Object[]{"## ", "#O ", " O ", '#', ItemMod.nacre_crystal, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_shovel, 1), new Object[]{" # ", " O ", " O ", '#', ItemMod.nacre_crystal, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_hoe, 1), new Object[]{"## ", " O ", " O ", '#', ItemMod.nacre_crystal, 'O', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.nacre_plate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.nacre_plate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.nacre_plate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.nacre_plate});

        GameRegistry.addRecipe(new ItemStack(ItemMod.salt, 8), new Object[]{"# ", " #", '#', Blocks.sand});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre, 4), new Object[]{"#", '#', ItemMod.nacre_plate});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nacre, 1), new Object[]{"#", "O", '#', ItemMod.nacre_crystal, 'O', Items.sugar});

        GameRegistry.addRecipe(new ItemStack(ItemMod.hellish_gem, 1), new Object[]{"#O#", "OYO", "#O#", '#', Items.blaze_rod, 'O', Blocks.nether_brick, 'Y', ItemMod.nacre_crystal});
    }
}
