// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.ChomperEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ChomperModel extends EntityModel<ChomperEntity> {
	public static final EntityModelLayer CHOMPER = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "chomper"), "main");

	private final ModelPart root;

	public ChomperModel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(1.2F, 24.0F, 0.0F));

		ModelPartData leaves = root.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData leaf_1 = leaves.addChild("leaf_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = leaf_1.addChild("cube_r1", ModelPartBuilder.create().uv(0, 22).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r2 = leaf_1.addChild("cube_r2", ModelPartBuilder.create().uv(32, 9).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_1 = leaf_1.addChild("apex_1", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r3 = apex_1.addChild("cube_r3", ModelPartBuilder.create().uv(32, 13).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_2 = leaves.addChild("leaf_2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.7017F, 0.0F));

		ModelPartData cube_r4 = leaf_2.addChild("cube_r4", ModelPartBuilder.create().uv(16, 22).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r5 = leaf_2.addChild("cube_r5", ModelPartBuilder.create().uv(32, 17).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_2 = leaf_2.addChild("apex_2", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r6 = apex_2.addChild("cube_r6", ModelPartBuilder.create().uv(18, 32).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_3 = leaves.addChild("leaf_3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 2.9671F, 0.0F));

		ModelPartData cube_r7 = leaf_3.addChild("cube_r7", ModelPartBuilder.create().uv(0, 27).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r8 = leaf_3.addChild("cube_r8", ModelPartBuilder.create().uv(32, 21).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_3 = leaf_3.addChild("apex_3", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r9 = apex_3.addChild("cube_r9", ModelPartBuilder.create().uv(32, 25).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_4 = leaves.addChild("leaf_4", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5272F, 0.0F));

		ModelPartData cube_r10 = leaf_4.addChild("cube_r10", ModelPartBuilder.create().uv(16, 27).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r11 = leaf_4.addChild("cube_r11", ModelPartBuilder.create().uv(32, 29).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_4 = leaf_4.addChild("apex_4", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r12 = apex_4.addChild("cube_r12", ModelPartBuilder.create().uv(30, 33).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData stem = root.addChild("stem", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData cube_r13 = stem.addChild("cube_r13", ModelPartBuilder.create().uv(8, 34).cuboid(-1.0F, -2.9F, -0.75F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.7F, 1.4F, 0.925F, 0.0F, 0.0F));

		ModelPartData cube_r14 = stem.addChild("cube_r14", ModelPartBuilder.create().uv(0, 34).cuboid(-1.0F, -5.8981F, -0.811F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 3.0F, 0.2007F, 0.0F, 0.0F));

		ModelPartData cube_r15 = stem.addChild("cube_r15", ModelPartBuilder.create().uv(32, 0).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		ModelPartData head = root.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(-0.8F, 0.0F, 0.5F));

		ModelPartData cube_r16 = head.addChild("cube_r16", ModelPartBuilder.create().uv(0, 32).cuboid(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -11.0F, -0.3F, 0.0873F, 0.0F, 0.0F));

		ModelPartData upper = head.addChild("upper", ModelPartBuilder.create(), ModelTransform.of(0.0F, -12.2653F, 0.997F, -0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r17 = upper.addChild("cube_r17", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -3.0F, -7.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -0.7F, -1.3F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r18 = upper.addChild("cube_r18", ModelPartBuilder.create().uv(7, 42).cuboid(-4.0F, 0.7F, -7.4F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -1.7F, -1.1F, -0.0262F, 0.0F, 0.0F));

		ModelPartData cube_r19 = upper.addChild("cube_r19", ModelPartBuilder.create().uv(7, 42).cuboid(-0.8F, 0.7F, 3.2F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(7, 42).cuboid(-0.8F, 0.7F, -4.2F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -1.7F, -1.1F, -1.5708F, 1.5446F, -1.5708F));

		ModelPartData upper_teeth = upper.addChild("upper_teeth", ModelPartBuilder.create().uv(0, 6).cuboid(-3.4F, -13.3F, -6.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -13.3F, -5.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -13.3F, -4.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -13.3F, -3.4F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-0.1F, -13.3F, -6.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-1.2F, -13.3F, -6.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -13.3F, -6.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -13.3F, -3.4F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -13.3F, -4.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -13.3F, -5.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(1.0F, -13.3F, -6.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-2.3F, -13.3F, -6.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.3F, -0.8F));

		ModelPartData hair = upper.addChild("hair", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r20 = hair.addChild("cube_r20", ModelPartBuilder.create().uv(24, 0).cuboid(-0.7F, -5.2F, -7.3F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 0).cuboid(-0.7F, -5.2F, -5.6F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 0).cuboid(-0.7F, -5.2F, -3.9F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 0).cuboid(-0.7F, -5.2F, -2.2F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0524F, 0.0F, 0.0F));

		ModelPartData lower = head.addChild("lower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r21 = lower.addChild("cube_r21", ModelPartBuilder.create().uv(7, 42).cuboid(-0.8F, 0.7F, 3.2F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(7, 42).cuboid(-0.8F, 0.7F, -4.2F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -13.0F, -0.5F, 1.5708F, 1.2654F, 1.5708F));

		ModelPartData cube_r22 = lower.addChild("cube_r22", ModelPartBuilder.create().uv(7, 42).cuboid(-4.0F, 0.7F, -7.4F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 12).cuboid(-4.0F, 1.0F, -7.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -13.0F, -0.5F, 0.3054F, 0.0F, 0.0F));

		ModelPartData lower_teeth = lower.addChild("lower_teeth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -10.0F, -7.0F));

		ModelPartData cube_r23 = lower_teeth.addChild("cube_r23", ModelPartBuilder.create().uv(0, 6).cuboid(2.1F, -1.0F, 1.8F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -1.0F, 2.9F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(2.1F, -1.0F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(1.0F, -1.0F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-0.1F, -1.0F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-1.2F, -1.0F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-2.3F, -1.0F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -1.0F, 1.8F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -1.0F, 2.9F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-3.4F, -1.0F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData tonque = head.addChild("tonque", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -8.0F));

		ModelPartData cube_r24 = tonque.addChild("cube_r24", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7F, -0.7041F, -2.1088F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.6F, 4.5F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r25 = tonque.addChild("cube_r25", ModelPartBuilder.create().uv(-2, -2).cuboid(-1.2F, -0.3F, -4.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -12.5F, 8.0F, 0.1396F, 0.0F, 0.0F));

		ModelPartData nodes = head.addChild("nodes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData node_1 = nodes.addChild("node_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r26 = node_1.addChild("cube_r26", ModelPartBuilder.create().uv(40, 0).cuboid(-1.1F, -0.9F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, -12.2F, 2.2F, -2.9087F, -1.4773F, -1.8204F));

		ModelPartData cube_r27 = node_1.addChild("cube_r27", ModelPartBuilder.create().uv(40, 0).cuboid(0.8F, -2.2F, 1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -11.6F, 2.2F, -3.0934F, -1.48F, -1.6335F));

		ModelPartData cube_r28 = node_1.addChild("cube_r28", ModelPartBuilder.create().uv(40, 0).cuboid(0.8F, -3.9F, 0.9F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -11.3F, 1.9F, -0.0818F, -1.4867F, 1.6385F));

		ModelPartData cube_r29 = node_1.addChild("cube_r29", ModelPartBuilder.create().uv(40, 0).cuboid(0.7F, -0.4F, 0.7F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 0).cuboid(-1.3F, -0.9F, 0.6F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -11.3F, 1.9F, -0.5507F, -1.321F, 2.1107F));

		ModelPartData cube_r30 = node_1.addChild("cube_r30", ModelPartBuilder.create().uv(40, 0).cuboid(-1.1F, -0.9F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.6F, -11.3F, 1.9F, 0.3217F, -1.482F, 1.2365F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(ChomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		root.render(matrices, vertexConsumer, light, overlay, color);
	}
}