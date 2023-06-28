package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;
import power.keepeersofthestones.init.PowerModGameRules;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class RandomChoiceStoneProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).selected) {
			random = Mth.nextInt(RandomSource.create(), 1, 48);
			if (random == 1) {
				if (!PowerModVariables.MapVariables.get(world).fire_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).fire_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 2) {
				if (!PowerModVariables.MapVariables.get(world).air_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).air_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 3) {
				if (!PowerModVariables.MapVariables.get(world).water_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).water_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 4) {
				if (!PowerModVariables.MapVariables.get(world).earth_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).earth_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 5) {
				if (!PowerModVariables.MapVariables.get(world).energy_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).energy_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 6) {
				if (!PowerModVariables.MapVariables.get(world).ice_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).ice_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 7) {
				if (!PowerModVariables.MapVariables.get(world).lightning_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).lightning_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 8) {
				if (!PowerModVariables.MapVariables.get(world).sound_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).sound_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 9) {
				if (!PowerModVariables.MapVariables.get(world).crystal_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).crystal_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 10) {
				if (!PowerModVariables.MapVariables.get(world).lava_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).lava_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 11) {
				if (!PowerModVariables.MapVariables.get(world).rain_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).rain_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 12) {
				if (!PowerModVariables.MapVariables.get(world).tornado_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).tornado_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 13) {
				if (!PowerModVariables.MapVariables.get(world).ocean_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).ocean_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 14) {
				if (!PowerModVariables.MapVariables.get(world).greenery_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.GREENERY_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).greenery_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 15) {
				if (!PowerModVariables.MapVariables.get(world).animals_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).animals_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 16) {
				if (!PowerModVariables.MapVariables.get(world).metal_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).metal_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 17) {
				if (!PowerModVariables.MapVariables.get(world).shadow_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).shadow_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 18) {
				if (!PowerModVariables.MapVariables.get(world).light_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).light_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 19) {
				if (!PowerModVariables.MapVariables.get(world).vacuum_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).vacuum_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 20) {
				if (!PowerModVariables.MapVariables.get(world).sun_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).sun_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 21) {
				if (!PowerModVariables.MapVariables.get(world).moon_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MOON_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).moon_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 22) {
				if (!PowerModVariables.MapVariables.get(world).creation_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.CREATION_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).creation_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 23) {
				if (!PowerModVariables.MapVariables.get(world).creation_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.DESTRUCTION_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).destruction_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 24) {
				if (!PowerModVariables.MapVariables.get(world).space_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SPACE_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).space_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 25) {
				if (!PowerModVariables.MapVariables.get(world).blood_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.BLOOD_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).blood_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 26) {
				if (!PowerModVariables.MapVariables.get(world).technology_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.TECHNOLOGY_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).technology_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 27) {
				if (!PowerModVariables.MapVariables.get(world).time_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.TIME_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).time_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 28) {
				if (!PowerModVariables.MapVariables.get(world).teleportation_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.TELEPORTATION_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).teleportation_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 29) {
				if (!PowerModVariables.MapVariables.get(world).explosion_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.EXPLOSION_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).explosion_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 30) {
				if (!PowerModVariables.MapVariables.get(world).amber_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.AMBER_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).amber_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 31) {
				if (!PowerModVariables.MapVariables.get(world).magnet_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MAGNET_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).magnet_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 32) {
				if (!PowerModVariables.MapVariables.get(world).mist_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MIST_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).mist_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 33) {
				if (!PowerModVariables.MapVariables.get(world).sand_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SAND_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).sand_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 34) {
				if (!PowerModVariables.MapVariables.get(world).speed_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SPEED_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).speed_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 35) {
				if (!PowerModVariables.MapVariables.get(world).poison_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.POISON_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).poison_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 36) {
				if (!PowerModVariables.MapVariables.get(world).mushrooms_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MUSHROOMS_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).mushrooms_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 37) {
				if (!PowerModVariables.MapVariables.get(world).mercury_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MERCURY_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).mercury_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 38) {
				if (!PowerModVariables.MapVariables.get(world).music_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MUSIC_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).music_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 39) {
				if (!PowerModVariables.MapVariables.get(world).plague_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.PLAGUE_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).plague_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 40) {
				if (!PowerModVariables.MapVariables.get(world).gravity_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.GRAVITY_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).gravity_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 41) {
				if (!PowerModVariables.MapVariables.get(world).blue_flame_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.BLUE_FLAME_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).blue_flame_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 42) {
				if (!PowerModVariables.MapVariables.get(world).spirit_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SPIRIT_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).spirit_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 43) {
				if (!PowerModVariables.MapVariables.get(world).aether_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.AETHER_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).aether_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 44) {
				if (!PowerModVariables.MapVariables.get(world).smoke_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.SMOKE_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).smoke_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 45) {
				if (!PowerModVariables.MapVariables.get(world).form_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.FORM_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).form_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 46) {
				if (!PowerModVariables.MapVariables.get(world).mind_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.MIND_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).mind_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 47) {
				if (world.getLevelData().getGameRules().getBoolean(PowerModGameRules.GETTINGSTONESWHENENTERINGTHEGAME) == false) {
					if (!PowerModVariables.MapVariables.get(world).golden_dust_stone) {
						PowerMod.queueServerWork(1, () -> {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(PowerModItems.GOLDEN_DUST_STONE.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							PowerModVariables.MapVariables.get(world).golden_dust_stone = true;
							PowerModVariables.MapVariables.get(world).syncData(world);
							{
								boolean _setval = true;
								entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.selected = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						});
					} else {
						RandomChoiceStoneProcedure.execute(world, entity);
					}
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (random == 48) {
				if (!PowerModVariables.MapVariables.get(world).darkness_stone) {
					PowerMod.queueServerWork(1, () -> {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(PowerModItems.DARKNESS_STONE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						PowerModVariables.MapVariables.get(world).darkness_stone = true;
						PowerModVariables.MapVariables.get(world).syncData(world);
						{
							boolean _setval = true;
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.selected = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
				} else {
					RandomChoiceStoneProcedure.execute(world, entity);
				}
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("power:mighty_master"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
