package com.toregeldi;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.client.*;
import com.toregeldi.entity.client.projectile.PeaBulletModel;
import com.toregeldi.entity.client.projectile.PeaBulletRenderer;
import com.toregeldi.entity.client.projectile.SnowPeaBulletRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class PlantsVsMonstersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PEASHOOTER, PeashooterRenderer::new);
        EntityRendererRegistry.register(ModEntities.REPEATER, RepeaterRenderer::new);
        EntityRendererRegistry.register(ModEntities.SNOW_PEA, SnowPeaRenderer::new);
        EntityRendererRegistry.register(ModEntities.PEA_BULLET, PeaBulletRenderer::new);
        EntityRendererRegistry.register(ModEntities.SNOW_PEA_BULLET, SnowPeaBulletRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(PeashooterModel.PEASHOOTER, PeashooterModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(RepeaterModel.REPEATER, RepeaterModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SnowPeaModel.SNOW_PEA, SnowPeaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(PeaBulletModel.PEA_BULLET, PeaBulletModel::getTexturedModelData);
    }


}