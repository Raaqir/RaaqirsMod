package net.raaqir.raaqirmod.item.custom;



import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.KnockbackEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

import static net.minecraft.enchantment.EnchantmentHelper.getEquipmentLevel;
import static net.minecraft.enchantment.EnchantmentHelper.getKnockback;

public class ModVibSwordItem extends SwordItem {
    public ModVibSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {

        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    ///Causes the mob you hit to float
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 10, 1), attacker);
        return super.postHit(stack, target, attacker);
    }

    ///Adds the enchantment to item, when crafted(onCraft)
    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {


        stack.addEnchantment(Enchantments.UNBREAKING, 2);
        stack.addEnchantment(Enchantments.KNOCKBACK, 1);
        super.onCraft(stack, world, player);
    }

}
