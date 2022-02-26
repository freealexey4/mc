package net.mcreator.pirati.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class PiratPriObnovlieniiTaktaSushchnostiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (true) {
			entity.hurt(DamageSource.GENERIC, 3);
		}
	}
}
