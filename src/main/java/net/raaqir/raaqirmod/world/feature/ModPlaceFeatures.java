package net.raaqir.raaqirmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlaceFeatures {

    public static final RegistryEntry<PlacedFeature> VIBRANIUM_ORE_PLACED = PlacedFeatures.register("vibranium_ore_placed",
            ModConfiguredFeatures.VIBRANIUM_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(40), YOffset.belowTop(120))));
    public static final RegistryEntry<PlacedFeature> BESKAR_ORE_PLACED = PlacedFeatures.register("beskar_ore_placed",
            ModConfiguredFeatures.BESKAR_ORE, modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> NETHER_BESKAR_ORE_PLACED = PlacedFeatures.register("nether_beskar_ore_placed",
            ModConfiguredFeatures.NETHER_BESKAR_ORE, modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(120))));

    public static final RegistryEntry<PlacedFeature> URU_ORE_PLACED = PlacedFeatures.register("uru_ore_placed",
            ModConfiguredFeatures.URU_ORE, modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> NETHER_URU_ORE_PLACED = PlacedFeatures.register("nether_uru_ore_placed",
            ModConfiguredFeatures.NETHER_URU_ORE, modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(120))));






    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
