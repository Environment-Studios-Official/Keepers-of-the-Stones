
package power.keepeersofthestones.fluid;

import power.keepeersofthestones.init.PowerModFluids;
import power.keepeersofthestones.init.PowerModFluidTypes;
import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class MercuryLiquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PowerModFluidTypes.MERCURY_LIQUID_TYPE.get(), () -> PowerModFluids.MERCURY_LIQUID.get(), () -> PowerModFluids.FLOWING_MERCURY_LIQUID.get())
			.explosionResistance(1000000f).tickRate(1).levelDecreasePerBlock(7).slopeFindDistance(16).block(() -> (LiquidBlock) PowerModBlocks.MERCURY_LIQUID.get());

	private MercuryLiquidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MercuryLiquidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MercuryLiquidFluid {
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
