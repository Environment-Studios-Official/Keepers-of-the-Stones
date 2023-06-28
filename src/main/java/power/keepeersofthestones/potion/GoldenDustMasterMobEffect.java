
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.GoldenDustEffectsProcedure;
import power.keepeersofthestones.procedures.GoldenDustEffectStartProcedure;
import power.keepeersofthestones.procedures.GoldenDustEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GoldenDustMasterMobEffect extends MobEffect {
	public GoldenDustMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3368704);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.golden_dust_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GoldenDustEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GoldenDustEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GoldenDustEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
