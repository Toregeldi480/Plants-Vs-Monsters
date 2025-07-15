package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.SunflowerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SunflowerRenderer extends MobEntityRenderer<SunflowerEntity, SunflowerModel> {
    public SunflowerRenderer(EntityRendererFactory.Context context) {
        super(context, new SunflowerModel(context.getPart(SunflowerModel.SUNFLOWER)), 0.8f);
    }

    @Override
    public Identifier getTexture(SunflowerEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/sunflower/sunflower.png");
    }
}
