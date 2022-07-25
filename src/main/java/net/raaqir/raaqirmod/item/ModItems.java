package net.raaqir.raaqirmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.item.custom.*;

public class ModItems {

public static final Item RAW_VIBRANIUM = registrItem("raw_vibranium",
        new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

public static final Item PURE_VIBRANIUM = registrItem("pure_vibranium",
            new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

public static final Item RAW_BESKAR = registrItem("raw_beskar",
        new Item(new FabricItemSettings().group(ModItemGroup.BESKAR)));

public static final Item URU = registrItem("uru",
        new Item(new FabricItemSettings().group(ModItemGroup.URU)));

public static final Item BESKAR = registrItem("beskar",
            new Item(new FabricItemSettings().group(ModItemGroup.BESKAR)));

public static final Item VIBRANIUM = registrItem("vibranium",
            new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));





public static final Item VIBRANIUM_SWORD = registrItem("vibranium_sword",
            new ModVibSwordItem(ModToolMaterials.PURE_VIBRANIUM, 10, 2f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

public static final Item VIBRANIUM_PICKAXE = registrItem("vibranium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.PURE_VIBRANIUM, 7, 0f,  new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

public static final Item VIBRANIUM_AXE = registrItem("vibranium_axe",
            new ModAxeItem(ModToolMaterials.PURE_VIBRANIUM, 13, 1f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_SHOVEL = registrItem("vibranium_shovel",
            new ShovelItem(ModToolMaterials.PURE_VIBRANIUM, 3, 1f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_HOE = registrItem("vibranium_hoe",
            new ModHoeItem(ModToolMaterials.PURE_VIBRANIUM, 3, 2f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));



 public static final Item VIBRANIUM_HELMET = registrItem("vibranium_helmet",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_CHESTPLATE = registrItem("vibranium_chestplate",
            new ModArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_LEGGINGS = registrItem("vibranium_leggings",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));


 public static final Item VIBRANIUM_BOOTS = registrItem("vibranium_boots",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));



    private static Item registrItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RaaqirsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RaaqirsMod.LOGGER.debug("Registering Mod Items for " + RaaqirsMod.MOD_ID);
    }
}
