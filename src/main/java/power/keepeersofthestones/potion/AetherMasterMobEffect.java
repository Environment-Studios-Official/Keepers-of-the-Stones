
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.AetherMasterEffectsProcedure;
import power.keepeersofthestones.procedures.AetherMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.AetherMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AetherMasterMobEffect extends MobEffect {
	public AetherMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724839);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.aether_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		AetherMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AetherMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		AetherMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
