package com.toregeldi.entity.client.projectile;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.client.PeashooterModel;
import com.toregeldi.entity.custom.PeashooterEntity;
import com.toregeldi.entity.custom.projectile.PeaBulletEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.ShulkerBulletEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PeaBulletRenderer extends EntityRenderer<PeaBulletEntity> {
    private static final Identifier TEXTURE = Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/pea_bullet/pea_bullet.png");
    public final PeaBulletModel model;
    public PeaBulletRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new PeaBulletModel(context.getPart(PeaBulletModel.PEA_BULLET));
    }

    @Override
    public void render(PeaBulletEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        matrices.scale(1f, 1f, 1f);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TEXTURE));
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 0xff00ff00);
        matrices.pop();

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(PeaBulletEntity entity) {
        return TEXTURE;
    }
}
