package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.PeashooterEntity;
import com.toregeldi.entity.custom.RepeaterEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RepeaterRenderer extends MobEntityRenderer<RepeaterEntity, RepeaterModel> {
    public RepeaterRenderer(EntityRendererFactory.Context context) {
        super(context, new RepeaterModel(context.getPart(RepeaterModel.REPEATER)), 0.8f);
    }

    @Override
    public Identifier getTexture(RepeaterEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/repeater/repeater.png");
    }
}