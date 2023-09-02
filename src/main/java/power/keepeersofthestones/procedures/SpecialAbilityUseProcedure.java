package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class SpecialAbilityUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).reactive_flying) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).fire) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FLYING.get(), 20, 1, false, false));
			}
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).blue_flame) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FLYING.get(), 20, 1, false, false));
			}
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).rain) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FLYING.get(), 20, 1, false, false));
			}
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).lightning) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FLYING.get(), 20, 1, false, false));
			}
		}
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).teleportation) {
			world.setBlock(BlockPos.containing(PowerModVariables.MapVariables.get(world).bposx, PowerModVariables.MapVariables.get(world).bposy, PowerModVariables.MapVariables.get(world).bposz), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(PowerModVariables.MapVariables.get(world).oposx, PowerModVariables.MapVariables.get(world).oposy, PowerModVariables.MapVariables.get(world).oposz), Blocks.AIR.defaultBlockState(), 3);
			PowerModVariables.MapVariables.get(world).blue_portal = false;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).orange_portal = false;
			PowerModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
