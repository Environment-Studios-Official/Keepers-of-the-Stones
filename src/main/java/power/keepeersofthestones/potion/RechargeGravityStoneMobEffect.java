
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeGravityStoneMobEffect extends MobEffect {
	public RechargeGravityStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_gravity_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
