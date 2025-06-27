package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.PeashooterEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PeashooterRenderer extends MobEntityRenderer<PeashooterEntity, PeashooterModel> {
    public PeashooterRenderer(EntityRendererFactory.Context context) {
        super(context, new PeashooterModel(context.getPart(PeashooterModel.PEASHOOTER)), 0.8f);
    }

    @Override
    public Identifier getTexture(PeashooterEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/peashooter/peashooter.png");
    }
}
