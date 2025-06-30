// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.RepeaterEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RepeaterModel extends EntityModel<RepeaterEntity> {
	public static final EntityModelLayer REPEATER = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "repeater"), "main");

	private final ModelPart main;
	private final ModelPart stem;
	private final ModelPart head;
	private final ModelPart leaves;

	public RepeaterModel(ModelPart root) {
		this.main = root.getChild("main");
		this.stem = main.getChild("stem");
		this.head = main.getChild("head");
		this.leaves = main.getChild("leaves");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData stem = main.addChild("stem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData upper = stem.addChild("upper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.0F, 1.0F));

		ModelPartData cube_r1 = upper.addChild("cube_r1", ModelPartBuilder.create().uv(34, 5).cuboid(-1.0F, -5.9F, -0.75F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData lower = stem.addChild("lower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = lower.addChild("cube_r2", ModelPartBuilder.create().uv(16, 32).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(0, 24).cuboid(-3.0F, -8.0F, -4.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(0, 16).cuboid(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-4.0F, -7.0F, -5.0F, 8.0F, 7.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 1.0F));

		ModelPartData nodes = head.addChild("nodes", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -3.0F, 4.0F));

		ModelPartData node_1 = nodes.addChild("node_1", ModelPartBuilder.create(), ModelTransform.of(4.0F, 0.3F, 0.0F, -1.5595F, -0.0421F, 1.3088F));

		ModelPartData cube_r3 = node_1.addChild("cube_r3", ModelPartBuilder.create().uv(6, 43).cuboid(-0.4892F, -4.6572F, -0.4139F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.9149F, 0.5667F, 1.1293F));

		ModelPartData cube_r4 = node_1.addChild("cube_r4", ModelPartBuilder.create().uv(39, 2).cuboid(-0.6578F, -1.9199F, 0.1735F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, 0.6842F, 0.8302F, 0.8763F));

		ModelPartData cube_r5 = node_1.addChild("cube_r5", ModelPartBuilder.create().uv(14, 42).cuboid(-0.9272F, -1.0746F, -0.7187F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData node_2 = nodes.addChild("node_2", ModelPartBuilder.create(), ModelTransform.of(2.9F, 0.0F, 0.0F, -1.3741F, 0.008F, 2.8764F));

		ModelPartData cube_r6 = node_2.addChild("cube_r6", ModelPartBuilder.create().uv(6, 43).cuboid(-0.4892F, -4.6572F, -0.4139F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.9149F, 0.5667F, 1.1293F));

		ModelPartData cube_r7 = node_2.addChild("cube_r7", ModelPartBuilder.create().uv(39, 2).cuboid(-0.6578F, -1.9199F, 0.1735F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, 0.6842F, 0.8302F, 0.8763F));

		ModelPartData cube_r8 = node_2.addChild("cube_r8", ModelPartBuilder.create().uv(14, 42).cuboid(-0.9272F, -1.0746F, -0.7187F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData node_3 = nodes.addChild("node_3", ModelPartBuilder.create(), ModelTransform.of(3.7F, -1.5F, 0.0F, -1.2906F, 0.0712F, -2.2167F));

		ModelPartData cube_r9 = node_3.addChild("cube_r9", ModelPartBuilder.create().uv(6, 43).cuboid(-0.4892F, -4.6572F, -0.4139F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.9149F, 0.5667F, 1.1293F));

		ModelPartData cube_r10 = node_3.addChild("cube_r10", ModelPartBuilder.create().uv(39, 2).cuboid(-0.6578F, -1.9199F, 0.1735F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, 0.6842F, 0.8302F, 0.8763F));

		ModelPartData cube_r11 = node_3.addChild("cube_r11", ModelPartBuilder.create().uv(14, 42).cuboid(-0.9272F, -1.0746F, -0.7187F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData node_4 = nodes.addChild("node_4", ModelPartBuilder.create(), ModelTransform.of(4.6F, -1.1F, 0.0F, -1.302F, 0.2417F, -1.2685F));

		ModelPartData cube_r12 = node_4.addChild("cube_r12", ModelPartBuilder.create().uv(6, 43).cuboid(-0.4892F, -4.6572F, -0.4139F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.9149F, 0.5667F, 1.1293F));

		ModelPartData cube_r13 = node_4.addChild("cube_r13", ModelPartBuilder.create().uv(39, 2).cuboid(-0.6578F, -1.9199F, 0.1735F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, 0.6842F, 0.8302F, 0.8763F));

		ModelPartData cube_r14 = node_4.addChild("cube_r14", ModelPartBuilder.create().uv(14, 42).cuboid(-0.9272F, -1.0746F, -0.7187F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData node_5 = nodes.addChild("node_5", ModelPartBuilder.create(), ModelTransform.of(4.6F, -0.3F, 0.0F, -1.302F, 0.2417F, 0.2849F));

		ModelPartData cube_r15 = node_5.addChild("cube_r15", ModelPartBuilder.create().uv(6, 43).cuboid(-0.4892F, -4.6572F, -0.4139F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.9149F, 0.5667F, 1.1293F));

		ModelPartData cube_r16 = node_5.addChild("cube_r16", ModelPartBuilder.create().uv(39, 2).cuboid(-0.6578F, -1.9199F, 0.1735F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, 0.6842F, 0.8302F, 0.8763F));

		ModelPartData cube_r17 = node_5.addChild("cube_r17", ModelPartBuilder.create().uv(14, 42).cuboid(-0.9272F, -1.0746F, -0.7187F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(26, 16).cuboid(1.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(34, 14).cuboid(1.0F, -2.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 9).cuboid(1.0F, 1.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -2.0F, -11.0F));

		ModelPartData cube_r18 = nose.addChild("cube_r18", ModelPartBuilder.create().uv(42, 25).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r19 = nose.addChild("cube_r19", ModelPartBuilder.create().uv(42, 11).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData leaves = main.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_1 = leaves.addChild("leaf_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r20 = leaf_1.addChild("cube_r20", ModelPartBuilder.create().uv(26, 25).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r21 = leaf_1.addChild("cube_r21", ModelPartBuilder.create().uv(24, 35).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_1 = leaf_1.addChild("apex_1", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r22 = apex_1.addChild("cube_r22", ModelPartBuilder.create().uv(36, 35).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_2 = leaves.addChild("leaf_2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.7017F, 0.0F));

		ModelPartData cube_r23 = leaf_2.addChild("cube_r23", ModelPartBuilder.create().uv(26, 30).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r24 = leaf_2.addChild("cube_r24", ModelPartBuilder.create().uv(0, 37).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_2 = leaf_2.addChild("apex_2", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r25 = apex_2.addChild("cube_r25", ModelPartBuilder.create().uv(24, 39).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_3 = leaves.addChild("leaf_3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 2.9671F, 0.0F));

		ModelPartData cube_r26 = leaf_3.addChild("cube_r26", ModelPartBuilder.create().uv(0, 32).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r27 = leaf_3.addChild("cube_r27", ModelPartBuilder.create().uv(36, 39).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_3 = leaf_3.addChild("apex_3", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r28 = apex_3.addChild("cube_r28", ModelPartBuilder.create().uv(0, 41).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_4 = leaves.addChild("leaf_4", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5272F, 0.0F));

		ModelPartData cube_r29 = leaf_4.addChild("cube_r29", ModelPartBuilder.create().uv(34, 0).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r30 = leaf_4.addChild("cube_r30", ModelPartBuilder.create().uv(12, 41).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_4 = leaf_4.addChild("apex_4", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r31 = apex_4.addChild("cube_r31", ModelPartBuilder.create().uv(0, 41).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(RepeaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		main.render(matrices, vertexConsumer, light, overlay, color);
	}
}