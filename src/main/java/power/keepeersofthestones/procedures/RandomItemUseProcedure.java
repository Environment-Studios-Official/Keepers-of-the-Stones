package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModItems;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.client.Minecraft;

public class RandomItemUseProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double random = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.RANDOM_ITEM.get()) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 1200);
			random = Mth.nextInt(RandomSource.create(), 1, 10);
			if (random == 1) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.BRICKS);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 2) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.GRANITE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 3) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.DIORITE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 4) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.ANDESITE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 5) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.COBBLED_DEEPSLATE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 6) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.BLACKSTONE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 7) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 8) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.MUD);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 9) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.SANDSTONE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
			if (random == 10) {
				PowerMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.RED_SANDSTONE);
						_setstack.setCount(64);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
		}
	}
}
