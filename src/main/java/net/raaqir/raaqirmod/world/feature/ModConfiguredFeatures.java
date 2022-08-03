package net.raaqir.raaqirmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_VIBRANIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.VIBRANIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_VIBRANIUM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_BESKAR_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BESKAR_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BESKAR_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_URU_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.URU_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_URU_ORE.getDefaultState()));



    public static final List<OreFeatureConfig.Target> NETHER_BESKAR_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_BESKAR_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_URU_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_URU_ORE.getDefaultState()));



    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VIBRANIUM_ORE =
            ConfiguredFeatures.register("vibranium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_VIBRANIUM_ORES, 6));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BESKAR_ORE =
            ConfiguredFeatures.register("beskar_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_BESKAR_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> URU_ORE =
            ConfiguredFeatures.register("uru_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_URU_ORES, 3));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_BESKAR_ORE =
            ConfiguredFeatures.register("nether_beskar_ore", Feature.ORE, new OreFeatureConfig(NETHER_BESKAR_ORES, 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_URU_ORE =
            ConfiguredFeatures.register("nether_uru_ore", Feature.ORE, new OreFeatureConfig(NETHER_URU_ORES, 5));




    public static void registerConfiguredFeatures() {
        RaaqirsMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + RaaqirsMod.MOD_ID);
    }
}
