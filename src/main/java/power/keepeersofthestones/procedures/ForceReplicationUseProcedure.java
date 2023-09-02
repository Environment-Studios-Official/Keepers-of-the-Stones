package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class ForceReplicationUseProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).battery) {
			if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PowerModMobEffects.FIRE_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(PowerModMobEffects.FIRE_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FIRE_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(PowerModMobEffects.AIR_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(PowerModMobEffects.AIR_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.AIR_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(PowerModMobEffects.WATER_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(PowerModMobEffects.WATER_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.WATER_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(PowerModMobEffects.EARTH_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(PowerModMobEffects.EARTH_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.EARTH_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(PowerModMobEffects.ENERGY_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(PowerModMobEffects.ENERGY_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ENERGY_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(PowerModMobEffects.ICE_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(PowerModMobEffects.ICE_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ICE_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(PowerModMobEffects.LIGHTNING_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(PowerModMobEffects.LIGHTNING_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LIGHTNING_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(PowerModMobEffects.SOUND_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(PowerModMobEffects.SOUND_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SOUND_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(PowerModMobEffects.CRYSTAL_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(PowerModMobEffects.CRYSTAL_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.CRYSTAL_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(PowerModMobEffects.LAVA_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(PowerModMobEffects.LAVA_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LAVA_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(PowerModMobEffects.RAIN_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(PowerModMobEffects.RAIN_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RAIN_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt33 && _livEnt33.hasEffect(PowerModMobEffects.TORNADO_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(PowerModMobEffects.TORNADO_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TORNADO_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt36 && _livEnt36.hasEffect(PowerModMobEffects.OCEAN_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(PowerModMobEffects.OCEAN_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.OCEAN_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt39 && _livEnt39.hasEffect(PowerModMobEffects.GREENERY_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt40 && _livEnt40.hasEffect(PowerModMobEffects.GREENERY_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.GREENERY_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt42 && _livEnt42.hasEffect(PowerModMobEffects.ANIMALS_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt43 && _livEnt43.hasEffect(PowerModMobEffects.ANIMALS_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ANIMALS_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt45 && _livEnt45.hasEffect(PowerModMobEffects.METAL_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt46 && _livEnt46.hasEffect(PowerModMobEffects.METAL_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.METAL_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt48 && _livEnt48.hasEffect(PowerModMobEffects.LIGHT_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt49 && _livEnt49.hasEffect(PowerModMobEffects.LIGHT_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LIGHT_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt51 && _livEnt51.hasEffect(PowerModMobEffects.SHADOW_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt52 && _livEnt52.hasEffect(PowerModMobEffects.SHADOW_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SHADOW_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt54 && _livEnt54.hasEffect(PowerModMobEffects.VACUUM_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt55 && _livEnt55.hasEffect(PowerModMobEffects.VACUUM_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.VACUUM_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt57 && _livEnt57.hasEffect(PowerModMobEffects.SUN_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt58 && _livEnt58.hasEffect(PowerModMobEffects.SUN_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SUN_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt60 && _livEnt60.hasEffect(PowerModMobEffects.MOON_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt61 && _livEnt61.hasEffect(PowerModMobEffects.MOON_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MOON_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt63 && _livEnt63.hasEffect(PowerModMobEffects.SPACE_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt64 && _livEnt64.hasEffect(PowerModMobEffects.SPACE_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPACE_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt66 && _livEnt66.hasEffect(PowerModMobEffects.BLOOD_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt67 && _livEnt67.hasEffect(PowerModMobEffects.BLOOD_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.BLOOD_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt69 && _livEnt69.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt70 && _livEnt70.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TECHNOLOGY_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt72 && _livEnt72.hasEffect(PowerModMobEffects.TIME_MASTER_EFFECT.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt73 && _livEnt73.hasEffect(PowerModMobEffects.TIME_MASTER_EFFECT.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TIME_MASTER_EFFECT.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt75 && _livEnt75.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt76 && _livEnt76.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TELEPORTATION_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt78 && _livEnt78.hasEffect(PowerModMobEffects.EXPLOSION_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt79 && _livEnt79.hasEffect(PowerModMobEffects.EXPLOSION_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.EXPLOSION_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt81 && _livEnt81.hasEffect(PowerModMobEffects.MIST_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt82 && _livEnt82.hasEffect(PowerModMobEffects.MIST_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MIST_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt84 && _livEnt84.hasEffect(PowerModMobEffects.SAND_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt85 && _livEnt85.hasEffect(PowerModMobEffects.SAND_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SAND_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt87 && _livEnt87.hasEffect(PowerModMobEffects.SPEED_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt88 && _livEnt88.hasEffect(PowerModMobEffects.SPEED_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPEED_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt90 && _livEnt90.hasEffect(PowerModMobEffects.POISON_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt91 && _livEnt91.hasEffect(PowerModMobEffects.POISON_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.POISON_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt93 && _livEnt93.hasEffect(PowerModMobEffects.MAGNET_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt94 && _livEnt94.hasEffect(PowerModMobEffects.MAGNET_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MAGNET_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt96 && _livEnt96.hasEffect(PowerModMobEffects.MUSHROOMS_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt97 && _livEnt97.hasEffect(PowerModMobEffects.MUSHROOMS_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MUSHROOMS_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt99 && _livEnt99.hasEffect(PowerModMobEffects.MERCURY_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt100 && _livEnt100.hasEffect(PowerModMobEffects.MERCURY_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MERCURY_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt102 && _livEnt102.hasEffect(PowerModMobEffects.MUSIC_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt103 && _livEnt103.hasEffect(PowerModMobEffects.MUSIC_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MUSIC_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt105 && _livEnt105.hasEffect(PowerModMobEffects.PLAGUE_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt106 && _livEnt106.hasEffect(PowerModMobEffects.PLAGUE_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.PLAGUE_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt108 && _livEnt108.hasEffect(PowerModMobEffects.GRAVITY_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt109 && _livEnt109.hasEffect(PowerModMobEffects.GRAVITY_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.GRAVITY_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt111 && _livEnt111.hasEffect(PowerModMobEffects.BLUE_FLAME_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt112 && _livEnt112.hasEffect(PowerModMobEffects.BLUE_FLAME_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.BLUE_FLAME_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt114 && _livEnt114.hasEffect(PowerModMobEffects.SPIRIT_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt115 && _livEnt115.hasEffect(PowerModMobEffects.SPIRIT_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPIRIT_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt117 && _livEnt117.hasEffect(PowerModMobEffects.SMOKE_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt118 && _livEnt118.hasEffect(PowerModMobEffects.SMOKE_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SMOKE_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt120 && _livEnt120.hasEffect(PowerModMobEffects.FORM_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt121 && _livEnt121.hasEffect(PowerModMobEffects.FORM_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FORM_MASTER.get(), 6000, 0, false, false));
				}
			}
			if (entity instanceof LivingEntity _livEnt123 && _livEnt123.hasEffect(PowerModMobEffects.MIND_MASTER.get())) {
				if (!(sourceentity instanceof LivingEntity _livEnt124 && _livEnt124.hasEffect(PowerModMobEffects.MIND_MASTER.get()))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MIND_MASTER.get(), 6000, 0, false, false));
				}
			}
		}
	}
}
