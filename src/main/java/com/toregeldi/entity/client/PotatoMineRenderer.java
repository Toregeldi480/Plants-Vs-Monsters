package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.PotatoMineEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PotatoMineRenderer extends MobEntityRenderer<PotatoMineEntity, PotatoMineModel> {
    public PotatoMineRenderer(EntityRendererFactory.Context context) {
        super(context, new PotatoMineModel(context.getPart(PotatoMineModel.POTATO_MINE)), 0.1f);
    }
    @Override
    public Identifier getTexture(PotatoMineEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/potato_mine/potato_mine.png");
    }
}
