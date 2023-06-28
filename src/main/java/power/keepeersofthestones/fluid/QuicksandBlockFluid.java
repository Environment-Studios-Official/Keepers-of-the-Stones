
package power.keepeersofthestones.fluid;

import power.keepeersofthestones.init.PowerModFluids;
import power.keepeersofthestones.init.PowerModFluidTypes;
import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class QuicksandBlockFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PowerModFluidTypes.QUICKSAND_BLOCK_TYPE.get(), () -> PowerModFluids.QUICKSAND_BLOCK.get(), () -> PowerModFluids.FLOWING_QUICKSAND_BLOCK.get())
			.explosionResistance(10000f).tickRate(100).levelDecreasePerBlock(8).slopeFindDistance(16).block(() -> (LiquidBlock) PowerModBlocks.QUICKSAND_BLOCK.get());

	private QuicksandBlockFluid() {
		super(PROPERTIES);
	}

	public static class Source extends QuicksandBlockFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QuicksandBlockFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
