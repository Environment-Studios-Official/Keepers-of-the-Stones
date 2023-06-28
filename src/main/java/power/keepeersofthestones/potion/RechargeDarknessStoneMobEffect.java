
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeDarknessStoneMobEffect extends MobEffect {
	public RechargeDarknessStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777165);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_darkness_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
