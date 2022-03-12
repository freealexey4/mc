
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pirati.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.pirati.item.UuuuuItem;
import net.mcreator.pirati.item.UhuuuuuuuuuuuuuuuuuuuuItem;
import net.mcreator.pirati.item.QqqqItem;
import net.mcreator.pirati.item.PirrrraaaticItem;
import net.mcreator.pirati.item.GghghghghghghghghghghghghghghghghghghghghghItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PiratiModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PIRAT = register(
			new SpawnEggItem(PiratiModEntities.PIRAT, -205, -16711834, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("pirat_spawn_egg"));
	public static final Item UHUUUUUUUUUUUUUUUUUUUU = register(new UhuuuuuuuuuuuuuuuuuuuuItem());
	public static final Item UUUUU = register(new UuuuuItem());
	public static final Item GGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGH = register(new GghghghghghghghghghghghghghghghghghghghghghItem());
	public static final Item QQQQ = register(new QqqqItem());
	public static final Item PIRATKA = register(
			new SpawnEggItem(PiratiModEntities.PIRATKA, -16724788, -52429, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("piratka_spawn_egg"));
	public static final Item PIRATPAROT = register(
			new SpawnEggItem(PiratiModEntities.PIRATPAROT, -16711783, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("piratparot_spawn_egg"));
	public static final Item PIRRRRAAATIC = register(new PirrrraaaticItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
