
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.SpiritMasterEffectsProcedure;
import power.keepeersofthestones.procedures.SpiritMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.SpiritMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SpiritMasterMobEffect extends MobEffect {
	public SpiritMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16763905);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.spirit_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SpiritMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SpiritMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpiritMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
