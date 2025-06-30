package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.CherryBombEntity;
import com.toregeldi.entity.custom.PeashooterEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CherryBombRenderer extends MobEntityRenderer<CherryBombEntity, CherryBombModel> {
    public CherryBombRenderer(EntityRendererFactory.Context context) {
        super(context, new CherryBombModel(context.getPart(CherryBombModel.CHERRY_BOMB)), 0.1f);
    }

    @Override
    public Identifier getTexture(CherryBombEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/cherry_bomb/cherry_bomb.png");
    }
}
