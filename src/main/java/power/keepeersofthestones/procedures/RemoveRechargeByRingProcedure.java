package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class RemoveRechargeByRingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_FIRE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_AIR_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_WATER_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_EARTH_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_ENERGY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_ICE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_LIGHTNING_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SOUND_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_CRYSTAL_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_LAVA_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_RAIN_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TORNADO_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_OCEAN_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_GREENERY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_ANIMALS_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_METAL_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_LIGHT_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SHADOW_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_VACUUM_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SUN_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MOON_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_CREATION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SPACE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_BLOOD_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TECHNOLOGY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TIME_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TELEPORTATION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_EXPLOSION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_AMBER_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MAGNET_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MIST_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SAND_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SPEED_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_POISON_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MUSHROOMS_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MERCURY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MUSIC_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_PLAGUE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_GRAVITY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_BLUE_FLAME_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SPIRIT_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_AETHER_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SMOKE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_FORM_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_GOLDEN_DUST_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MIND_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_DARKNESS_STONE.get());
	}
}
