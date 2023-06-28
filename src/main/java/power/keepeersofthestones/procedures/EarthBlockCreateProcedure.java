package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EarthBlockCreateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PowerMod.queueServerWork(3, () -> {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.DIRT.defaultBlockState(), 3);
		});
	}
}
