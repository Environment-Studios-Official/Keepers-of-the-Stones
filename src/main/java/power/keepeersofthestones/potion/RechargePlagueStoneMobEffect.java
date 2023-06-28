
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargePlagueStoneMobEffect extends MobEffect {
	public RechargePlagueStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434829);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_plague_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
