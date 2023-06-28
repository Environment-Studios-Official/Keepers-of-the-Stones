
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.WildCallStartEffectProcedure;
import power.keepeersofthestones.procedures.WildCallSearchingProcedure;
import power.keepeersofthestones.procedures.WildCallEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WildCallMobEffect extends MobEffect {
	public WildCallMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751053);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.wild_call";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		WildCallStartEffectProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WildCallSearchingProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		WildCallEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
