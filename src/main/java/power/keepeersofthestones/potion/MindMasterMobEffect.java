
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MindMasterEffectsProcedure;
import power.keepeersofthestones.procedures.MindMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.MindMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MindMasterMobEffect extends MobEffect {
	public MindMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52429);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.mind_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MindMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MindMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MindMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
