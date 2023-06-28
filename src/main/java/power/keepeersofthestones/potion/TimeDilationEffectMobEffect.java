
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TimeDilationEffectTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TimeDilationEffectMobEffect extends MobEffect {
	public TimeDilationEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16750900);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.time_dilation_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TimeDilationEffectTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
