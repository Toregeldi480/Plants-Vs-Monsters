package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.ChomperEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ChomperRenderer extends MobEntityRenderer<ChomperEntity, ChomperModel> {
    public ChomperRenderer(EntityRendererFactory.Context context) {
        super(context, new ChomperModel(context.getPart(ChomperModel.CHOMPER)), 0.8f);
    }

    @Override
    public Identifier getTexture(ChomperEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/chomper/chomper.png");
    }
}
