package net.mcreator.pirati.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.pirati.entity.PiratkaEntity;
import net.mcreator.pirati.client.model.Modelcustom_model;

public class PiratkaRenderer extends MobRenderer<PiratkaEntity, Modelcustom_model<PiratkaEntity>> {
	public PiratkaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PiratkaEntity entity) {
		return new ResourceLocation("pirati:textures/texture_2.png");
	}
}
