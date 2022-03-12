
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pirati.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.pirati.entity.PirrrraaaticEntity;
import net.mcreator.pirati.entity.PiratparotEntity;
import net.mcreator.pirati.entity.PiratkaEntity;
import net.mcreator.pirati.entity.PiratEntity;
import net.mcreator.pirati.entity.GghghghghghghghghghghghghghghghghghghghghghEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PiratiModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<PiratEntity> PIRAT = register("pirat",
			EntityType.Builder.<PiratEntity>of(PiratEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PiratEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<GghghghghghghghghghghghghghghghghghghghghghEntity> GGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGH = register(
			"entitybulletgghghghghghghghghghghghghghghghghghghghghgh",
			EntityType.Builder
					.<GghghghghghghghghghghghghghghghghghghghghghEntity>of(GghghghghghghghghghghghghghghghghghghghghghEntity::new, MobCategory.MISC)
					.setCustomClientFactory(GghghghghghghghghghghghghghghghghghghghghghEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PiratkaEntity> PIRATKA = register("piratka",
			EntityType.Builder.<PiratkaEntity>of(PiratkaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PiratkaEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PiratparotEntity> PIRATPAROT = register("piratparot",
			EntityType.Builder.<PiratparotEntity>of(PiratparotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PiratparotEntity::new).sized(1f, 1f));
	public static final EntityType<PirrrraaaticEntity> PIRRRRAAATIC = register("entitybulletpirrrraaatic",
			EntityType.Builder.<PirrrraaaticEntity>of(PirrrraaaticEntity::new, MobCategory.MISC).setCustomClientFactory(PirrrraaaticEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PiratEntity.init();
			PiratkaEntity.init();
			PiratparotEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PIRAT, PiratEntity.createAttributes().build());
		event.put(PIRATKA, PiratkaEntity.createAttributes().build());
		event.put(PIRATPAROT, PiratparotEntity.createAttributes().build());
	}
}
