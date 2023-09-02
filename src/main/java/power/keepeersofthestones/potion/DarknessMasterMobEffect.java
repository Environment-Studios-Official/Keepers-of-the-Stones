
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.DarknessMasterEffectsProcedure;
import power.keepeersofthestones.procedures.DarknessMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.DarknessMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DarknessMasterMobEffect extends MobEffect {
	public DarknessMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777165);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.darkness_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DarknessMasterEffectStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DarknessMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DarknessMasterEffectEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
