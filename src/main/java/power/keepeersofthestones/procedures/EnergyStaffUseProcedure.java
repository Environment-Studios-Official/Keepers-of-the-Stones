package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EnergyStaffUseProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.ENERGY_ABSORPTION.get()) {
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 800);
				if (!(sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).recharge_spell_energy) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.AIR_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.WATER_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.EARTH_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.ICE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.LIGHTNING_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.CRYSTAL_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.LAVA_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.RAIN_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.TORNADO_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.OCEAN_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.GREENERY_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.ANIMALS_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.METAL_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.LIGHT_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SHADOW_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SUN_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MOON_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.CREATION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.TELEPORTATION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.EXPLOSION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.AMBER_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MIST_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SAND_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SPEED_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.POISON_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MAGNET_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MUSHROOMS_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MERCURY_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MUSIC_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.PLAGUE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.GRAVITY_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.BLUE_FLAME_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SPIRIT_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.AETHER_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SMOKE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FORM_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MIND_MASTER.get());
				}
				{
					boolean _setval = true;
					sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.recharge_spell_energy = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				PowerMod.queueServerWork(800, () -> {
					{
						boolean _setval = false;
						sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.recharge_spell_energy = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				});
			}
		}
	}
}
