
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.PowerLockStartProcedure;
import power.keepeersofthestones.procedures.PowerLockEndProcedure;
import power.keepeersofthestones.procedures.DetransformKeyPriNazhatiiKlavishiProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PowerLockMobEffect extends MobEffect {
	public PowerLockMobEffect() {
		super(MobEffectCategory.HARMFUL, -13312);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.power_lock";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		PowerLockStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DetransformKeyPriNazhatiiKlavishiProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PowerLockEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
