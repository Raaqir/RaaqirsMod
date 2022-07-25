package net.raaqir.raaqirmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.block.custom.RegenBlock;
import net.raaqir.raaqirmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block VIBRANIUM_BLOCK =registerBlock("vibranium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.VIBRANIUM);

    public static final Block VIBRANIUM_ORE =registerBlock("vibranium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 10)), ModItemGroup.VIBRANIUM);
    public static final Block DEEPSLATE_VIBRANIUM_ORE =registerBlock("deepslate_vibranium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 10)), ModItemGroup.VIBRANIUM);

    public static final Block URU_ORE =registerBlock("uru_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 10)), ModItemGroup.URU);
    public static final Block DEEPSLATE_uru_ORE =registerBlock("deepslate_uru_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 10)), ModItemGroup.URU);

    public static final Block BESKAR_ORE =registerBlock("beskar_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 10)), ModItemGroup.BESKAR);
    public static final Block DEEPSLATE_BESKAR_ORE =registerBlock("deepslate_beskar_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 10)), ModItemGroup.BESKAR);



    public static final Block REGEN_BLOCK =registerBlock("regen_block",
            new RegenBlock(FabricBlockSettings.of(Material.STONE)), ModItemGroup.VIBRANIUM);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(RaaqirsMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(RaaqirsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        RaaqirsMod.LOGGER.debug("Registering ModBlocks for " + RaaqirsMod.MOD_ID);
    }
}
