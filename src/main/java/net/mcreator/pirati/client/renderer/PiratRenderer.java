package net.mcreator.pirati.client.renderer;

public class PiratRenderer extends MobRenderer<PiratEntity, Modelcustom_model<PiratEntity>> {

	public PiratRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PiratEntity entity) {
		return new ResourceLocation("pirati:textures/texture.png");
	}

}
