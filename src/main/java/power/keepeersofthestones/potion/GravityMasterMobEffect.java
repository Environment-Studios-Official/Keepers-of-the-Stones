
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.GravityMasterEffectsProcedure;
import power.keepeersofthestones.procedures.GravityMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.GravityMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GravityMasterMobEffect extends MobEffect {
	public GravityMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.gravity_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GravityMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GravityMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GravityMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
