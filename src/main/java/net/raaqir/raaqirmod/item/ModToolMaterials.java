package net.raaqir.raaqirmod.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    //todo Make and Register URU
    URU(4, 8780, 20.0F, 20.0F, 100, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.URU});
    }),
    BESKAR(4, 6969, 15.0F, 10.0F, 50, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.BESKAR});
    }),
    PURE_VIBRANIUM(4, 4021, 10.0F, 6.0F, 30, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.PURE_VIBRANIUM});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}