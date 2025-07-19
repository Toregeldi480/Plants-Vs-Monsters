package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.RepeaterEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RepeaterRenderer extends MobEntityRenderer<RepeaterEntity, RepeaterModel> {
    public RepeaterRenderer(EntityRendererFactory.Context context) {
        super(context, new RepeaterModel(context.getPart(RepeaterModel.REPEATER)), 0.8f);
    }

    @Override
    public void render(RepeaterEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(RepeaterEntity entity) {
        if(entity.isUpgraded()) {
            return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/gatling_pea/gatling_pea.png");
        }
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/repeater/repeater.png");
    }
}