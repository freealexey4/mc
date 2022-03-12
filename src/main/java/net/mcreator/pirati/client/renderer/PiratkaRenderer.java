package net.mcreator.pirati.client.renderer;

public class PiratkaRenderer extends MobRenderer<PiratkaEntity, Modelcustom_model<PiratkaEntity>> {

	public PiratkaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PiratkaEntity entity) {
		return new ResourceLocation("pirati:textures/texture_2.png");
	}

}
