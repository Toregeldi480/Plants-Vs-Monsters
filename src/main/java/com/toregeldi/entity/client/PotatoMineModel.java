// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.PotatoMineEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PotatoMineModel extends EntityModel<PotatoMineEntity> {
	public static final EntityModelLayer POTATO_MINE = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "potato_mine"), "main");

	private final ModelPart main;

	public PotatoMineModel(ModelPart root) {
		this.main = root.getChild("main");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = main.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -3.0F, -5.0F, 10.0F, 3.0F, 10.0F, new Dilation(0.0F))
				.uv(22, 13).cuboid(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
				.uv(0, 13).cuboid(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(22, 24).cuboid(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(0, 24).cuboid(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -5.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData stick = main.addChild("stick", ModelPartBuilder.create().uv(8, 35).cuboid(-0.5F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(0, 39).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(PotatoMineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		main.resetTransform();
		main.pivotY += 4.0f;
		if(entity.readyToExplode <= 0) {
			main.pivotY -= 4.0f;
		}
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		main.render(matrices, vertexConsumer, light, overlay, color);
	}
}