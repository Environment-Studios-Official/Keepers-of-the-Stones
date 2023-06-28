
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.PlagueMasterEffectsProcedure;
import power.keepeersofthestones.procedures.PlagueMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.PlagueMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PlagueMasterMobEffect extends MobEffect {
	public PlagueMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434829);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.plague_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		PlagueMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PlagueMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PlagueMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
