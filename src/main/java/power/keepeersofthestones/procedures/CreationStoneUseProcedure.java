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
import net.minecraft.world.effect.MobEffectInstance;

public class CreationStoneUseProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.CREATION_STONE.get()) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if (!(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(PowerModMobEffects.RECHARGE_CREATION_STONE.get()))) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) == 0 && entity instanceof Player) {
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.CREATION_MASTER.get(), 18000, 0, false, false));
						} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.CREATION_MASTER.get(), 24000, 0, false, false));
						} else {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.CREATION_MASTER.get(), 12000, 0, false, false));
						}
						PowerMod.queueServerWork(2, () -> {
							itemstack.shrink(1);
						});
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).destruction) {
					if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).battery) {
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE.get());
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(PowerModItems.DESTRUCTION_STONE.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MERGE_BALANCE.get(), 18000, 0, false, false));
						} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE.get());
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(PowerModItems.DESTRUCTION_STONE.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MERGE_BALANCE.get(), 24000, 0, false, false));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE.get());
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(PowerModItems.DESTRUCTION_STONE.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MERGE_BALANCE.get(), 12000, 0, false, false));
						}
						PowerMod.queueServerWork(2, () -> {
							itemstack.shrink(1);
						});
					}
				}
			}
		}
	}
}
