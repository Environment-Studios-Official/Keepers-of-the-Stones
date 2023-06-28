
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMindStoneMobEffect extends MobEffect {
	public RechargeMindStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52429);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_mind_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
