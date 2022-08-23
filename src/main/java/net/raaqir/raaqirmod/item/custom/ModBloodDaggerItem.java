package net.raaqir.raaqirmod.item.custom;


import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class ModBloodDaggerItem extends SwordItem {
    public ModBloodDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {

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


        stack.addEnchantment(Enchantments.SHARPNESS, 1);
        super.onCraft(stack, world, player);
    }

}
