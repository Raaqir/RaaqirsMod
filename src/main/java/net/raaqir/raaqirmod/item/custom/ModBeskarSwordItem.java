package net.raaqir.raaqirmod.item.custom;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class ModBeskarSwordItem extends SwordItem {

    public ModBeskarSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);

        getDefaultStack().addEnchantment(Enchantments.UNBREAKING, 2);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {

        //Adds the enchantment to item, when crafted(onCraft)
        stack.addEnchantment(Enchantments.UNBREAKING, 2);
        super.onCraft(stack, world, player);
    }

}


