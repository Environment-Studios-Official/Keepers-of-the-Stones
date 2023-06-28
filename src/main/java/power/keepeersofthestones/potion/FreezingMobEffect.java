
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.FreezingEffectTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FreezingMobEffect extends MobEffect {
	public FreezingMobEffect() {
		super(MobEffectCategory.HARMFUL, -6684673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.freezing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezingEffectTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
