package net.raaqir.raaqirmod.entity.client;

import net.minecraft.util.Identifier;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.entity.custom.CraftminEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CraftminModel extends AnimatedGeoModel<CraftminEntity> {
    @Override
    public Identifier getModelResource(CraftminEntity object) {
        return new Identifier(RaaqirsMod.MOD_ID, "geo/craftmin.geo.json");
    }

    @Override
    public Identifier getTextureResource(CraftminEntity object) {
        return new Identifier(RaaqirsMod.MOD_ID, "textures/enitiy/craftmin/craftmin.png");
    }

    @Override
    public Identifier getAnimationResource(CraftminEntity animatable) {
        return new Identifier(RaaqirsMod.MOD_ID, "animations/craftmin.animation.json");
    }




}
