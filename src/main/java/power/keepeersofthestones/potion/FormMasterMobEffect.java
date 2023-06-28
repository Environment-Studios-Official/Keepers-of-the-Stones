
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.FormMasterEffectsProcedure;
import power.keepeersofthestones.procedures.FormMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.FormMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FormMasterMobEffect extends MobEffect {
	public FormMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407770);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.form_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FormMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FormMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FormMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
