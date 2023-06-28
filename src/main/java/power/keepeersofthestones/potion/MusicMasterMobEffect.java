
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MusicMasterEffectsProcedure;
import power.keepeersofthestones.procedures.MusicMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.MusicMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MusicMasterMobEffect extends MobEffect {
	public MusicMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750055);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.music_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MusicMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MusicMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MusicMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
