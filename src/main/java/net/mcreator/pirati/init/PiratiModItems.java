
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

import net.mcreator.pirati.item.UhuuuuuuuuuuuuuuuuuuuuItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PiratiModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PIRAT = register(
			new SpawnEggItem(PiratiModEntities.PIRAT, -205, -16711834, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("pirat_spawn_egg"));
	public static final Item UHUUUUUUUUUUUUUUUUUUUU = register(new UhuuuuuuuuuuuuuuuuuuuuItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
