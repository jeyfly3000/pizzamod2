// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrhino_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer horns;
	private final ModelRenderer left_horn;
	private final ModelRenderer bone;
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer neck;

	public Modelrhino_model() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -10.0F);
		head.setTextureOffset(0, 5).addBox(-8.0F, -20.0F, -14.0F, 16.0F, 15.0F, 16.0F, 0.0F, false);

		horns = new ModelRenderer(this);
		horns.setRotationPoint(-5.0F, -13.0F, -9.0F);
		head.addChild(horns);
		setRotationAngle(horns, 1.0472F, 0.0F, 0.0F);
		horns.setTextureOffset(97, 48).addBox(2.0F, -14.0F, 0.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);
		horns.setTextureOffset(88, 47).addBox(3.0F, -21.0F, 1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		horns.setTextureOffset(115, 91).addBox(4.0F, -28.0F, 2.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		left_horn = new ModelRenderer(this);
		left_horn.setRotationPoint(-33.0F, 27.0F, 19.0F);
		horns.addChild(left_horn);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		horns.addChild(bone);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 8.0F, -8.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 1.0F, 3.5F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		rotation.setTextureOffset(0, 55).addBox(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F, false);
		rotation.setTextureOffset(0, 91).addBox(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(8.0F, -13.0F, 21.0F);
		leg1.setTextureOffset(96, 0).addBox(-20.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-8.0F, -13.0F, 21.0F);
		leg2.setTextureOffset(96, 0).addBox(12.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(8.0F, -13.0F, -3.5F);
		leg3.setTextureOffset(64, 0).addBox(-20.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-8.0F, -13.0F, -3.5F);
		leg4.setTextureOffset(64, 0).addBox(12.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F, true);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -6.0F, 8.0F);
		neck.setTextureOffset(68, 73).addBox(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		jaw.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}