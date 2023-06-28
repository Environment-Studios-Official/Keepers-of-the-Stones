
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeFormStoneMobEffect extends MobEffect {
	public RechargeFormStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407770);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_form_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
