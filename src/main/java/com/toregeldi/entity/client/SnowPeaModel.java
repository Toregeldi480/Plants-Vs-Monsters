// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.SnowPeaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SnowPeaModel extends EntityModel<SnowPeaEntity> {
	public static final EntityModelLayer SNOW_PEA = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "snow_pea"), "main");
	private final ModelPart stem;
//	private final ModelPart upper;
//	private final ModelPart lower;
	private final ModelPart head;
//	private final ModelPart nodes;
//	private final ModelPart node_1;
//	private final ModelPart node_2;
//	private final ModelPart node_3;
//	private final ModelPart node_4;
//	private final ModelPart node_5;
//	private final ModelPart nose;
	private final ModelPart leafs;
//	private final ModelPart leaf_1;
//	private final ModelPart apex_1;
//	private final ModelPart leaf_2;
//	private final ModelPart apex_2;
//	private final ModelPart leaf_3;
//	private final ModelPart apex_3;
//	private final ModelPart leaf_4;
//	private final ModelPart apex_4;
	public SnowPeaModel(ModelPart root) {
		this.stem = root.getChild("stem");
//		this.upper = root.getChild("upper");
//		this.lower = root.getChild("lower");
		this.head = root.getChild("head");
//		this.nodes = root.getChild("nodes");
//		this.node_1 = root.getChild("node_1");
//		this.node_2 = root.getChild("node_2");
//		this.node_3 = root.getChild("node_3");
//		this.node_4 = root.getChild("node_4");
//		this.node_5 = root.getChild("node_5");
//		this.nose = root.getChild("nose");
		this.leafs = root.getChild("leafs");
//		this.leaf_1 = root.getChild("leaf_1");
//		this.apex_1 = root.getChild("apex_1");
//		this.leaf_2 = root.getChild("leaf_2");
//		this.apex_2 = root.getChild("apex_2");
//		this.leaf_3 = root.getChild("leaf_3");
//		this.apex_3 = root.getChild("apex_3");
//		this.leaf_4 = root.getChild("leaf_4");
//		this.apex_4 = root.getChild("apex_4");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData stem = modelPartData.addChild("stem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData upper = stem.addChild("upper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.0F, 1.0F));

		ModelPartData cube_r1 = upper.addChild("cube_r1", ModelPartBuilder.create().uv(34, 5).cuboid(-1.0F, -5.9F, -0.75F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData lower = stem.addChild("lower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = lower.addChild("cube_r2", ModelPartBuilder.create().uv(16, 32).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 24).cuboid(-3.0F, -8.0F, -4.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -7.0F, -5.0F, 8.0F, 7.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.0F, 1.0F));

		ModelPartData nodes = head.addChild("nodes", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -3.0F, 4.0F));

		ModelPartData node_1 = nodes.addChild("node_1", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 4).cuboid(-1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 7).cuboid(-1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.6F, -0.6F, 0.0F, -1.5595F, -0.0421F, 1.3088F));

		ModelPartData node_2 = nodes.addChild("node_2", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9F, -1.7F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.9F, -1.7F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 4).cuboid(0.1F, -2.7F, 1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 7).cuboid(0.1F, -3.7F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.9F, -0.7F, 0.4F, -1.7232F, 0.008F, 2.8764F));

		ModelPartData node_3 = nodes.addChild("node_3", ModelPartBuilder.create().uv(0, 0).cuboid(-1.7F, -0.2F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.7F, -0.2F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 4).cuboid(-0.7F, -1.2F, 1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 7).cuboid(-0.7F, -2.2F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.6F, -0.8F, 1.5F, -1.5542F, 0.0716F, 1.4109F));

		ModelPartData node_4 = nodes.addChild("node_4", ModelPartBuilder.create().uv(0, 0).cuboid(-2.6F, -0.6F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.6F, -0.6F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 4).cuboid(-1.6F, -1.6F, 1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 7).cuboid(-1.6F, -2.6F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.9F, -0.2F, 1.2F, -1.5352F, -0.1122F, -1.3644F));

		ModelPartData node_5 = nodes.addChild("node_5", ModelPartBuilder.create().uv(0, 0).cuboid(-2.6F, -1.4F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.6F, -1.4F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 4).cuboid(-1.6F, -2.4F, 1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 7).cuboid(-1.6F, -3.4F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8F, -0.5F, 0.1F, -1.5166F, 0.0718F, -0.0613F));

		ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(26, 16).cuboid(1.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, new Dilation(0.0F))
		.uv(34, 14).cuboid(1.0F, -2.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 9).cuboid(1.0F, 1.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -2.0F, -11.0F));

		ModelPartData cube_r3 = nose.addChild("cube_r3", ModelPartBuilder.create().uv(42, 25).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r4 = nose.addChild("cube_r4", ModelPartBuilder.create().uv(42, 11).cuboid(-2.0F, -1.5F, 0.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData leafs = modelPartData.addChild("leafs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leaf_1 = leafs.addChild("leaf_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = leaf_1.addChild("cube_r5", ModelPartBuilder.create().uv(26, 25).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r6 = leaf_1.addChild("cube_r6", ModelPartBuilder.create().uv(24, 35).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_1 = leaf_1.addChild("apex_1", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r7 = apex_1.addChild("cube_r7", ModelPartBuilder.create().uv(36, 35).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_2 = leafs.addChild("leaf_2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.7017F, 0.0F));

		ModelPartData cube_r8 = leaf_2.addChild("cube_r8", ModelPartBuilder.create().uv(26, 30).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r9 = leaf_2.addChild("cube_r9", ModelPartBuilder.create().uv(0, 37).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_2 = leaf_2.addChild("apex_2", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r10 = apex_2.addChild("cube_r10", ModelPartBuilder.create().uv(24, 39).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_3 = leafs.addChild("leaf_3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 2.9671F, 0.0F));

		ModelPartData cube_r11 = leaf_3.addChild("cube_r11", ModelPartBuilder.create().uv(0, 32).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r12 = leaf_3.addChild("cube_r12", ModelPartBuilder.create().uv(36, 39).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_3 = leaf_3.addChild("apex_3", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r13 = apex_3.addChild("cube_r13", ModelPartBuilder.create().uv(0, 41).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));

		ModelPartData leaf_4 = leafs.addChild("leaf_4", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5272F, 0.0F));

		ModelPartData cube_r14 = leaf_4.addChild("cube_r14", ModelPartBuilder.create().uv(34, 0).cuboid(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 0.0F, 3.0F, -0.09F, 0.9853F, -0.1026F));

		ModelPartData cube_r15 = leaf_4.addChild("cube_r15", ModelPartBuilder.create().uv(12, 41).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 1.0F, 0.0F, 1.0472F, 0.3054F));

		ModelPartData apex_4 = leaf_4.addChild("apex_4", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 0.0F, 7.0F));

		ModelPartData cube_r16 = apex_4.addChild("cube_r16", ModelPartBuilder.create().uv(0, 41).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3142F, 1.0042F, 0.3656F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SnowPeaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		stem.render(matrices, vertexConsumer, light, overlay, color);
		head.render(matrices, vertexConsumer, light, overlay, color);
		leafs.render(matrices, vertexConsumer, light, overlay, color);
	}
}