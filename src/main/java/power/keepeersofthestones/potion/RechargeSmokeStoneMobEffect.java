
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeSmokeStoneMobEffect extends MobEffect {
	public RechargeSmokeStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6710887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_smoke_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
