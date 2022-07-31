package net.raaqir.raaqirmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.raaqir.raaqirmod.RaaqirsMod;
import net.raaqir.raaqirmod.entity.custom.CraftminEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CraftminRenderer extends GeoEntityRenderer<CraftminEntity> {
    public CraftminRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CraftminModel());
    }

    @Override
    public Identifier getTextureResource(CraftminEntity instance) {
        return new Identifier(RaaqirsMod.MOD_ID, "textures/entity/craftmin/craftmin.png");
    }
}
