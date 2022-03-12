
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pirati.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.pirati.client.renderer.PiratparotRenderer;
import net.mcreator.pirati.client.renderer.PiratkaRenderer;
import net.mcreator.pirati.client.renderer.PiratRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PiratiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PiratiModEntities.PIRAT, PiratRenderer::new);
		event.registerEntityRenderer(PiratiModEntities.GGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGH, ThrownItemRenderer::new);
		event.registerEntityRenderer(PiratiModEntities.PIRATKA, PiratkaRenderer::new);
		event.registerEntityRenderer(PiratiModEntities.PIRATPAROT, PiratparotRenderer::new);
	}
}
