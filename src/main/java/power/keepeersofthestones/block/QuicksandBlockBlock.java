
package power.keepeersofthestones.block;

import power.keepeersofthestones.procedures.DamagedQuicksandProcedure;
import power.keepeersofthestones.init.PowerModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class QuicksandBlockBlock extends LiquidBlock {
	public QuicksandBlockBlock() {
		super(() -> PowerModFluids.QUICKSAND_BLOCK.get(), BlockBehaviour.Properties.of(Material.WATER).strength(10000f).noCollission().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		DamagedQuicksandProcedure.execute(entity);
	}
}
