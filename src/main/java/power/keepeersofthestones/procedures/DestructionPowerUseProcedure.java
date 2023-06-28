package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModItems;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class DestructionPowerUseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.DESTRUCTION_POWER.get()) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 1200);
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = true;
				_player.onUpdateAbilities();
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 20, Level.ExplosionInteraction.BLOCK);
			PowerMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player) {
					_player.getAbilities().invulnerable = false;
					_player.onUpdateAbilities();
				}
			});
		}
	}
}
