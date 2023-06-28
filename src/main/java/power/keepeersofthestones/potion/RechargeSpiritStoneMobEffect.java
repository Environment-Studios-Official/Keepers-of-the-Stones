
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeSpiritStoneMobEffect extends MobEffect {
	public RechargeSpiritStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16763905);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_spirit_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
