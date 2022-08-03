package net.raaqir.raaqirmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.raaqir.raaqirmod.block.ModBlocks;
import net.raaqir.raaqirmod.entity.ModEntities;
import net.raaqir.raaqirmod.entity.client.CraftminRenderer;

public class RaaqirModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POWER_EXTRACTOR, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.CRAFTMIN, CraftminRenderer::new);


    }
}
