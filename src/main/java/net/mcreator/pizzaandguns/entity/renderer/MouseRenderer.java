package net.mcreator.pizzaandguns.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.pizzaandguns.entity.MouseEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MouseRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MouseEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("pizza_and_guns:textures/mouse_re_paint.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer body1;
		private final ModelRenderer body2;
		private final ModelRenderer body4;
		private final ModelRenderer body3;
		private final ModelRenderer body5;
		private final ModelRenderer body6;
		private final ModelRenderer body7;
		private final ModelRenderer wing1;
		private final ModelRenderer wing2;
		private final ModelRenderer wing3;
		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 32;
			body1 = new ModelRenderer(this);
			body1.setRotationPoint(-7.0F, 22.0F, -7.0F);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(15.0F, 20.0F, -5.0F);
			setRotationAngle(body2, 1.5708F, 0.0F, 0.0F);
			body2.setTextureOffset(41, 18).addBox(-17.0F, 0.0F, 0.0F, 5.0F, 9.0F, 2.0F, 0.0F, false);
			body4 = new ModelRenderer(this);
			body4.setRotationPoint(0.0F, 21.0F, 0.5F);
			body3 = new ModelRenderer(this);
			body3.setRotationPoint(0.0F, -1.0F, -3.0F);
			body4.addChild(body3);
			setRotationAngle(body3, 0.0F, -1.5708F, 0.0F);
			body3.setTextureOffset(20, 3).addBox(-3.0F, 1.0F, -0.5F, 10.0F, 3.0F, 3.0F, 0.0F, false);
			body5 = new ModelRenderer(this);
			body5.setRotationPoint(0.0F, 22.0F, 3.5F);
			body5.setTextureOffset(21, 3).addBox(0.0F, 1.0F, 0.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			body6 = new ModelRenderer(this);
			body6.setRotationPoint(0.0F, 23.0F, 6.0F);
			body6.setTextureOffset(22, 3).addBox(0.0F, 0.0F, 4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			body7 = new ModelRenderer(this);
			body7.setRotationPoint(0.0F, 23.0F, 8.0F);
			body7.setTextureOffset(24, 5).addBox(1.5F, -7.0F, -12.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body7.setTextureOffset(24, 5).addBox(-3.5F, -7.0F, -12.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			wing1 = new ModelRenderer(this);
			wing1.setRotationPoint(-3.0F, 16.0F, -2.5F);
			setRotationAngle(wing1, 0.0F, 1.5708F, 0.0F);
			wing1.setTextureOffset(20, 0).addBox(-7.0F, 5.0F, 3.5F, 10.0F, 3.0F, 3.0F, 0.0F, false);
			wing2 = new ModelRenderer(this);
			wing2.setRotationPoint(-9.0F, 20.0F, 3.5F);
			setRotationAngle(wing2, 0.0F, -1.5708F, 0.0F);
			wing2.setTextureOffset(14, 3).addBox(-9.0F, -1.0F, -12.5F, 10.0F, 2.0F, 6.0F, 0.0F, false);
			wing3 = new ModelRenderer(this);
			wing3.setRotationPoint(0.0F, 19.0F, -5.0F);
			wing3.setTextureOffset(45, 20).addBox(3.0F, 4.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			wing3.setTextureOffset(45, 20).addBox(-3.0F, 4.0F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			wing3.setTextureOffset(45, 20).addBox(-3.0F, 4.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			wing3.setTextureOffset(45, 20).addBox(3.0F, 4.0F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body1.render(matrixStack, buffer, packedLight, packedOverlay);
			body2.render(matrixStack, buffer, packedLight, packedOverlay);
			body4.render(matrixStack, buffer, packedLight, packedOverlay);
			body5.render(matrixStack, buffer, packedLight, packedOverlay);
			body6.render(matrixStack, buffer, packedLight, packedOverlay);
			body7.render(matrixStack, buffer, packedLight, packedOverlay);
			wing1.render(matrixStack, buffer, packedLight, packedOverlay);
			wing2.render(matrixStack, buffer, packedLight, packedOverlay);
			wing3.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
