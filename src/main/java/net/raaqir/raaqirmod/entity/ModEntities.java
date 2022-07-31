package net.raaqir.raaqirmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.entity.custom.CraftminEntity;

public class ModEntities {
    public static final EntityType<CraftminEntity> CRAFTMIN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(RaaqirsMod.MOD_ID, "craftmin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CraftminEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 0.6f)).build());

}
