
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMusicStoneMobEffect extends MobEffect {
	public RechargeMusicStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6750055);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_music_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
