package net.raaqir.raaqirmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.entity.ModEntities;
import net.raaqir.raaqirmod.item.custom.*;

public class ModItems {

/// Material Items
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



/// Uru Items
public static final Item URU_PICKAXE = registrItem("uru_pickaxe",
            new ModPickaxeItem(ModToolMaterials.URU, 9, 1f,  new FabricItemSettings().group(ModItemGroup.URU)));

public static final Item URU_AXE = registrItem("uru_axe",
            new ModAxeItem(ModToolMaterials.URU, 16, 1f,  new FabricItemSettings().group(ModItemGroup.URU)));

public static final Item URU_SHOVEL = registrItem("uru_shovel",
            new ShovelItem(ModToolMaterials.URU, 7, 1f,  new FabricItemSettings().group(ModItemGroup.URU)));

public static final Item URU_HOE = registrItem("uru_hoe",
            new ModHoeItem(ModToolMaterials.URU, 8, 1f,  new FabricItemSettings().group(ModItemGroup.URU)));

public static final Item URU_SWORD = registrItem("uru_sword",
            new SwordItem(ModToolMaterials.URU, 17, 4f,  new FabricItemSettings().group(ModItemGroup.URU)));


/// Beskar Items
public static final Item BESKAR_PICKAXE = registrItem("beskar_pickaxe",
            new ModPickaxeItem(ModToolMaterials.BESKAR, 8, 1f,  new FabricItemSettings().group(ModItemGroup.BESKAR)));

public static final Item BESKAR_AXE = registrItem("beskar_axe",
            new ModAxeItem(ModToolMaterials.BESKAR, 14, 1f,  new FabricItemSettings().group(ModItemGroup.BESKAR)));

public static final Item BESKAR_SHOVEL = registrItem("beskar_shovel",
            new ShovelItem(ModToolMaterials.BESKAR, 6, 1f,  new FabricItemSettings().group(ModItemGroup.BESKAR)));

public static final Item BESKAR_HOE = registrItem("beskar_hoe",
            new ModHoeItem(ModToolMaterials.BESKAR, 7, 1f,  new FabricItemSettings().group(ModItemGroup.BESKAR)));

public static final Item BESKAR_SWORD = registrItem("beskar_sword",
            new ModBeskarSwordItem(ModToolMaterials.BESKAR, 12, 3f, new FabricItemSettings().group(ModItemGroup.BESKAR)));



/// Vib Items
public static final Item VIBRANIUM_SWORD = registrItem("vibranium_sword",
            new ModVibSwordItem(ModToolMaterials.PURE_VIBRANIUM, 10, 2f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

public static final Item VIBRANIUM_PICKAXE = registrItem("vibranium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.PURE_VIBRANIUM, 7, 1f,  new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

public static final Item VIBRANIUM_AXE = registrItem("vibranium_axe",
            new ModAxeItem(ModToolMaterials.PURE_VIBRANIUM, 11, 1f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_SHOVEL = registrItem("vibranium_shovel",
            new ShovelItem(ModToolMaterials.PURE_VIBRANIUM, 3, 1f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_HOE = registrItem("vibranium_hoe",
            new ModHoeItem(ModToolMaterials.PURE_VIBRANIUM, 3, 2f, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));


/// Vib Armor Items
 public static final Item VIBRANIUM_HELMET = registrItem("vibranium_helmet",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_CHESTPLATE = registrItem("vibranium_chestplate",
            new ModArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

 public static final Item VIBRANIUM_LEGGINGS = registrItem("vibranium_leggings",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));


 public static final Item VIBRANIUM_BOOTS = registrItem("vibranium_boots",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));


 /// Uru Armor Items
 public static final Item URU_HELMET = registrItem("uru_helmet",
            new ArmorItem(ModArmorMaterials.URU, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.URU)));

 public static final Item URU_CHESTPLATE = registrItem("uru_chestplate",
            new ModArmorItem(ModArmorMaterials.URU, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.URU)));

 public static final Item URU_LEGGINGS = registrItem("uru_leggings",
            new ArmorItem(ModArmorMaterials.URU, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.URU)));


 public static final Item URU_BOOTS = registrItem("uru_boots",
            new ArmorItem(ModArmorMaterials.URU, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.URU)));



/// Mob Spawn Egg
 public static final Item CRAFTMIN_SPAWN_EGG = registrItem("craftmin_spawn_egg",
            new SpawnEggItem(ModEntities.CRAFTMIN, 0xae0000, 0x23950c,
                    new FabricItemSettings().group(ModItemGroup.VIBRANIUM).maxCount(1)));



    private static Item registrItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RaaqirsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RaaqirsMod.LOGGER.debug("Registering Mod Items for " + RaaqirsMod.MOD_ID);
    }
}
