package net.raaqir.raaqirmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.raaqir.raaqirmod.entity.ModEntities;
import net.raaqir.raaqirmod.entity.custom.CraftminEntity;

public class ModRegistries {
    public static void registerModStuff() {
        registerAttributes();
    }



    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CRAFTMIN, CraftminEntity.setAttributes());
    }
}
