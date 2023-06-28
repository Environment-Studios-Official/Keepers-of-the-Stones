
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeAetherStoneMobEffect extends MobEffect {
	public RechargeAetherStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16724839);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_aether_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
