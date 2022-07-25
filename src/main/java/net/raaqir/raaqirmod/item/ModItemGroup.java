package net.raaqir.raaqirmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.raaqir.raaqirmod.RaaqirsMod;

public class ModItemGroup {
    public static final ItemGroup VIBRANIUM = FabricItemGroupBuilder.build(
            new Identifier(RaaqirsMod.MOD_ID, "vibranium"), () -> new ItemStack(ModItems.VIBRANIUM));

    public static final ItemGroup URU= FabricItemGroupBuilder.build(
            new Identifier(RaaqirsMod.MOD_ID, "uru"), () -> new ItemStack(ModItems.URU));

    public static final ItemGroup BESKAR= FabricItemGroupBuilder.build(
            new Identifier(RaaqirsMod.MOD_ID, "beskar"), () -> new ItemStack(ModItems.BESKAR));
}
