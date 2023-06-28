
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.fluid.types.QuicksandBlockFluidType;
import power.keepeersofthestones.fluid.types.MercuryLiquidFluidType;
import power.keepeersofthestones.fluid.types.AcidFluidType;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class PowerModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PowerMod.MODID);
	public static final RegistryObject<FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
	public static final RegistryObject<FluidType> MERCURY_LIQUID_TYPE = REGISTRY.register("mercury_liquid", () -> new MercuryLiquidFluidType());
	public static final RegistryObject<FluidType> QUICKSAND_BLOCK_TYPE = REGISTRY.register("quicksand_block", () -> new QuicksandBlockFluidType());
}
