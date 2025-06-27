// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client.projectile;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.projectile.PeaBulletEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PeaBulletModel extends EntityModel<PeaBulletEntity> {
	public static final EntityModelLayer PEA_BULLET = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "pea_bullet"), "main");
	private final ModelPart bb_main;

	public PeaBulletModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0f, 0, -1.0f, 2.0f, 2.0F, 2.0f, new Dilation(0.0F)), ModelTransform.NONE);
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(PeaBulletEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		bb_main.render(matrices, vertexConsumer, light, overlay, color);
	}
}