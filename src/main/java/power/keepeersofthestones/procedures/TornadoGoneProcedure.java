package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TornadoGoneProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		PowerMod.queueServerWork(400, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
