// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.SunflowerEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;


public class SunflowerModel extends EntityModel<SunflowerEntity> {
	public static final EntityModelLayer SUNFLOWER = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "sunflower"), "main");

	private final ModelPart root;

	public SunflowerModel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leaves = root.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_1 = leaves.addChild("leaf_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = leaf_1.addChild("cube_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r2 = leaf_1.addChild("cube_r2", ModelPartBuilder.create().uv(16, 21).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData cube_r3 = leaf_1.addChild("cube_r3", ModelPartBuilder.create().uv(20, 10).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData leaf_2 = leaves.addChild("leaf_2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.7017F, 0.0F));

		ModelPartData cube_r4 = leaf_2.addChild("cube_r4", ModelPartBuilder.create().uv(16, 16).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r5 = leaf_2.addChild("cube_r5", ModelPartBuilder.create().uv(28, 21).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData cube_r6 = leaf_2.addChild("cube_r6", ModelPartBuilder.create().uv(16, 25).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData leaf_3 = leaves.addChild("leaf_3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 2.9671F, 0.0F));

		ModelPartData cube_r7 = leaf_3.addChild("cube_r7", ModelPartBuilder.create().uv(20, 0).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r8 = leaf_3.addChild("cube_r8", ModelPartBuilder.create().uv(16, 29).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData cube_r9 = leaf_3.addChild("cube_r9", ModelPartBuilder.create().uv(28, 25).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData leaf_4 = leaves.addChild("leaf_4", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5272F, 0.0F));

		ModelPartData cube_r10 = leaf_4.addChild("cube_r10", ModelPartBuilder.create().uv(0, 30).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData cube_r11 = leaf_4.addChild("cube_r11", ModelPartBuilder.create().uv(20, 5).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r12 = leaf_4.addChild("cube_r12", ModelPartBuilder.create().uv(28, 29).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData stem = root.addChild("stem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r13 = stem.addChild("cube_r13", ModelPartBuilder.create().uv(8, 21).cuboid(-1.0F, -5.9F, -0.75F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r14 = stem.addChild("cube_r14", ModelPartBuilder.create().uv(0, 21).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData head = root.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.6F, -0.4F));

		ModelPartData cube_r15 = head.addChild("cube_r15", ModelPartBuilder.create().uv(12, 33).cuboid(-4.0F, -4.0F, -1.0F, 1.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(32, 10).cuboid(5.0F, -4.0F, -1.0F, 1.0F, 8.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 13).cuboid(-3.0F, -5.0F, -1.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 10).cuboid(-3.0F, 4.0F, -1.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-3.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -14.1F, -0.5F, -0.1571F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);

	}

	@Override
	public void setAngles(SunflowerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		root.render(matrices, vertexConsumer, light, overlay, color);
	}
}