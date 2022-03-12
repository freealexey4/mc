package net.mcreator.pirati.client.renderer;

public class PiratparotRenderer extends MobRenderer<PiratparotEntity, Modelcustom_model<PiratparotEntity>> {

	public PiratparotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PiratparotEntity entity) {
		return new ResourceLocation("pirati:textures/parrot.png");
	}

}
