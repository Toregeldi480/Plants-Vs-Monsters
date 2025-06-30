// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.toregeldi.entity.client;

import com.toregeldi.PlantsVsMonsters;
import com.toregeldi.entity.custom.CherryBombEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class CherryBombModel extends EntityModel<CherryBombEntity> {
	public static final EntityModelLayer CHERRY_BOMB = new EntityModelLayer(Identifier.of(PlantsVsMonsters.MOD_ID, "cherry_bomb"), "main");

	private final ModelPart main;
	private final ModelPart stems;
	private final ModelPart leaves;
	private final ModelPart head;

	public CherryBombModel(ModelPart root) {
		this.main = root.getChild("main");
		this.stems = main.getChild("stems");
		this.leaves = main.getChild("leaves");
		this.head = main.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData stems = main.addChild("stems", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData stem_1 = stems.addChild("stem_1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = stem_1.addChild("cube_r1", ModelPartBuilder.create().uv(28, 25).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.2F, -12.2F, 0.0F, 0.0F, 0.0F, -0.925F));

		ModelPartData cube_r2 = stem_1.addChild("cube_r2", ModelPartBuilder.create().uv(30, 30).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.9F, -13.2F, 0.0F, 0.0F, 0.0F, -0.576F));

		ModelPartData cube_r3 = stem_1.addChild("cube_r3", ModelPartBuilder.create().uv(0, 30).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.2F, -7.0F, 0.0F, 0.0F, 0.0F, -0.0698F));

		ModelPartData stem_2 = stems.addChild("stem_2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r4 = stem_2.addChild("cube_r4", ModelPartBuilder.create().uv(8, 30).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -7.9F, 0.0F, 0.0F, 0.0F, 0.1222F));

		ModelPartData cube_r5 = stem_2.addChild("cube_r5", ModelPartBuilder.create().uv(4, 30).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.3F, 0.0F, 0.0F, 0.0F, -2.1293F));

		ModelPartData leaves = main.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_1 = leaves.addChild("leaf_1", ModelPartBuilder.create(), ModelTransform.of(0.4F, -15.0F, 0.3F, 2.8972F, 0.925F, 3.1416F));

		ModelPartData cube_r6 = leaf_1.addChild("cube_r6", ModelPartBuilder.create().uv(32, 10).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.6F, 1.5F, -2.0F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r7 = leaf_1.addChild("cube_r7", ModelPartBuilder.create().uv(32, 2).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2F, 1.6F, -2.2F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r8 = leaf_1.addChild("cube_r8", ModelPartBuilder.create().uv(12, 30).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, 1.3F, -1.9F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r9 = leaf_1.addChild("cube_r9", ModelPartBuilder.create().uv(28, 19).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, 0.5F, -0.7F, 0.3817F, 0.2765F, 0.1091F));

		ModelPartData leaf_2 = leaves.addChild("leaf_2", ModelPartBuilder.create(), ModelTransform.of(0.2F, 0.0F, 0.0F, 0.0F, -0.0698F, 0.0F));

		ModelPartData cube_r10 = leaf_2.addChild("cube_r10", ModelPartBuilder.create().uv(32, 4).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.6F, -13.5F, -2.0F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r11 = leaf_2.addChild("cube_r11", ModelPartBuilder.create().uv(32, 0).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2F, -13.4F, -2.2F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r12 = leaf_2.addChild("cube_r12", ModelPartBuilder.create().uv(18, 30).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -13.7F, -1.9F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r13 = leaf_2.addChild("cube_r13", ModelPartBuilder.create().uv(28, 16).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -14.5F, -0.7F, 0.3817F, 0.2765F, 0.1091F));

		ModelPartData leaf_3 = leaves.addChild("leaf_3", ModelPartBuilder.create(), ModelTransform.of(0.5F, -15.0F, 0.1F, 2.4949F, -0.8565F, -2.5398F));

		ModelPartData cube_r14 = leaf_3.addChild("cube_r14", ModelPartBuilder.create().uv(32, 8).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.6F, 1.5F, -2.0F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r15 = leaf_3.addChild("cube_r15", ModelPartBuilder.create().uv(32, 6).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2F, 1.6F, -2.2F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r16 = leaf_3.addChild("cube_r16", ModelPartBuilder.create().uv(24, 30).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, 1.3F, -1.9F, 0.7831F, 0.2765F, 0.1091F));

		ModelPartData cube_r17 = leaf_3.addChild("cube_r17", ModelPartBuilder.create().uv(28, 22).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, 0.5F, -0.7F, 0.3817F, 0.2765F, 0.1091F));

		ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(0, 16).cuboid(2.0F, -7.0F, -3.0F, 7.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eye_4_r1 = eyes.addChild("eye_4_r1", ModelPartBuilder.create().uv(2, 2).cuboid(-1.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -2.5F, -4.1F, 0.0F, 0.0F, -0.1745F));

		ModelPartData eye_3_r1 = eyes.addChild("eye_3_r1", ModelPartBuilder.create().uv(2, 2).cuboid(-1.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.9F, -3.2F, -4.1F, 0.0F, 0.0F, 0.1745F));

		ModelPartData eye_2_r1 = eyes.addChild("eye_2_r1", ModelPartBuilder.create().uv(1, 2).cuboid(-2.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -3.7F, -5.1F, 0.0F, 0.0F, -0.1658F));

		ModelPartData eye_1_r1 = eyes.addChild("eye_1_r1", ModelPartBuilder.create().uv(2, 2).cuboid(-1.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.8F, -3.8F, -5.1F, 0.0F, 0.0F, 0.1309F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(CherryBombEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		main.render(matrices, vertexConsumer, light, overlay, color);
	}
}
