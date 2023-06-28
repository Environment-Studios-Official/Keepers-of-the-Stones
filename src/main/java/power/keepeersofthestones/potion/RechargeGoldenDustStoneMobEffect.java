
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeGoldenDustStoneMobEffect extends MobEffect {
	public RechargeGoldenDustStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3368704);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_golden_dust_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
