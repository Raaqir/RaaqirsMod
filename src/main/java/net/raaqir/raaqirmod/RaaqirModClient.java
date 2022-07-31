package net.raaqir.raaqirmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.raaqir.raaqirmod.entity.ModEntities;
import net.raaqir.raaqirmod.entity.client.CraftminRenderer;

public class RaaqirModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.CRAFTMIN, CraftminRenderer::new);


    }
}
