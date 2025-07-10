package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.SnowPeaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SnowPeaRenderer extends MobEntityRenderer<SnowPeaEntity, SnowPeaModel> {
    public SnowPeaRenderer(EntityRendererFactory.Context context) {
        super(context, new SnowPeaModel(context.getPart(SnowPeaModel.SNOW_PEA)), 0.8f);
    }

    @Override
    public Identifier getTexture(SnowPeaEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/snow_pea/snow_pea.png");
    }
}
