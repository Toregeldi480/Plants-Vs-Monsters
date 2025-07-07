package com.toregeldi;

import com.toregeldi.entity.ModEntities;
import com.toregeldi.entity.client.*;
import com.toregeldi.entity.client.projectile.PeaBulletModel;
import com.toregeldi.entity.client.projectile.PeaBulletRenderer;
import com.toregeldi.entity.client.projectile.SnowPeaBulletRenderer;
import com.toregeldi.gui.PlayerSunGUI;
import com.toregeldi.network.SunValuePayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

@Environment(EnvType.CLIENT)
public class PlantsVsMonstersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PEASHOOTER, PeashooterRenderer::new);
        EntityRendererRegistry.register(ModEntities.REPEATER, RepeaterRenderer::new);
        EntityRendererRegistry.register(ModEntities.SNOW_PEA, SnowPeaRenderer::new);
        EntityRendererRegistry.register(ModEntities.PEA_BULLET, PeaBulletRenderer::new);
        EntityRendererRegistry.register(ModEntities.SNOW_PEA_BULLET, SnowPeaBulletRenderer::new);
        EntityRendererRegistry.register(ModEntities.CHERRY_BOMB, CherryBombRenderer::new);
        EntityRendererRegistry.register(ModEntities.POTATO_MINE, PotatoMineRenderer::new);
        EntityRendererRegistry.register(ModEntities.SUN_ORB, SunOrbRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(PeashooterModel.PEASHOOTER, PeashooterModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(RepeaterModel.REPEATER, RepeaterModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SnowPeaModel.SNOW_PEA, SnowPeaModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(PeaBulletModel.PEA_BULLET, PeaBulletModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(CherryBombModel.CHERRY_BOMB, CherryBombModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(PotatoMineModel.POTATO_MINE, PotatoMineModel::getTexturedModelData);

        HudRenderCallback.EVENT.register(new PlayerSunGUI());
        ClientPlayNetworking.registerGlobalReceiver(SunValuePayload.ID, ((payload, context) ->
                context.client().execute(() -> PlayerSunGUI.getSunAmountFromServer(payload.sunValue()))));
    }


}