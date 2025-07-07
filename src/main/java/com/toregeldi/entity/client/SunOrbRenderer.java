package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.SunOrbEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class SunOrbRenderer extends EntityRenderer<SunOrbEntity> {
    private static final Identifier TEXTURE = Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/sun_orb/sun_orb.png");
    private static final RenderLayer LAYER = RenderLayer.getItemEntityTranslucentCull(TEXTURE);

    public SunOrbRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    protected int getBlockLight(SunOrbEntity entity, BlockPos pos) {
        return 15;
    }

    @Override
    public void render(SunOrbEntity experienceOrbEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        int j = 7;
        float h = (float)(j % 4 * 16 + 0) / 16.0F;
        float k = (float)(j % 4 * 16 + 16) / 16.0F;
        float l = (float)(j / 4 * 16 + 0) / 16.0F;
        float m = (float)(j / 4 * 16 + 16) / 16.0F;
        matrixStack.multiply(this.dispatcher.getRotation());
        matrixStack.scale(1.0F, 1.0F, 1.0F);
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(LAYER);
        MatrixStack.Entry entry = matrixStack.peek();
        vertex(vertexConsumer, entry, -0.5F, -0.25F, 252, 239, 60, h, m, i);
        vertex(vertexConsumer, entry, 0.5F, -0.25F, 252, 239, 60, k, m, i);
        vertex(vertexConsumer, entry, 0.5F, 0.75F, 252, 239, 60, k, l, i);
        vertex(vertexConsumer, entry, -0.5F, 0.75F, 252, 239, 60, h, l, i);
        matrixStack.pop();
        super.render(experienceOrbEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }


    private static void vertex(VertexConsumer vertexConsumer, MatrixStack.Entry matrix, float x, float y, int red, int green, int blue, float u, float v, int light) {
        vertexConsumer.vertex(matrix, x, y, 0.0F).color(red, green, blue, 255).texture(u, v).overlay(OverlayTexture.DEFAULT_UV).light(light).normal(matrix, 0.0F, 1.0F, 0.0F);
    }

    @Override
    public Identifier getTexture(SunOrbEntity entity) {
        return TEXTURE;
    }
}