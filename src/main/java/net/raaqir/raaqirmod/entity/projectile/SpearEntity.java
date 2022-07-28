package net.raaqir.raaqirmod.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.world.World;

public class SpearEntity extends TridentEntity {
    public SpearEntity(EntityType<? extends TridentEntity> entityType, World world) {
        super(entityType, world);
    }
}
