package com.toregeldi.entity.client.projectile;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.projectile.SnowPeaBulletEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SnowPeaBulletRenderer extends EntityRenderer<SnowPeaBulletEntity> {
    private static final Identifier TEXTURE = Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/pea_bullet/snow_pea_bullet.png");
    public final PeaBulletModel model;
    public SnowPeaBulletRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new PeaBulletModel(context.getPart(PeaBulletModel.PEA_BULLET));
    }

    @Override
    public void render(SnowPeaBulletEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        matrices.scale(1f, 1f, 1f);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TEXTURE));
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 0xff36b0cc);
        matrices.pop();

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(SnowPeaBulletEntity entity) {
        return TEXTURE;
    }
}
