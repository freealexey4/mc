package net.mcreator.pirati.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pirati.entity.PiratEntity;
import net.mcreator.pirati.client.model.Modelcustom_model;

public class PiratRenderer extends MobRenderer<PiratEntity, Modelcustom_model<PiratEntity>> {
	public PiratRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PiratEntity entity) {
		return new ResourceLocation("pirati:textures/texture.png");
	}
}
