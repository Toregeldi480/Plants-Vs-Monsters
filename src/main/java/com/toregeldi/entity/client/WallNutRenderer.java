package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.WallNutEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class WallNutRenderer extends MobEntityRenderer<WallNutEntity, WallNutModel> {
    public WallNutRenderer(EntityRendererFactory.Context context) {
        super(context, new WallNutModel(context.getPart(WallNutModel.WALL_NUT)), 0.8f);
    }

    @Override
    public Identifier getTexture(WallNutEntity entity) {
        return Identifier.of(PlantsVsMonsters.MOD_ID, "textures/entity/wall_nut/wall_nut.png");
    }
}
