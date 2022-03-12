
package net.mcreator.pirati.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class YvyvyvMobEffect extends MobEffect {
	public YvyvyvMobEffect() {
		super(MobEffectCategory.HARMFUL, -16764109);
		setRegistryName("yvyvyv");
	}

	@Override
	public String getDescriptionId() {
		return "effect.pirati.yvyvyv";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
