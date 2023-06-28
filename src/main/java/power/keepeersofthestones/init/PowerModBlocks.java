
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.block.VacuumWebBlockBlock;
import power.keepeersofthestones.block.QuicksandBlockBlock;
import power.keepeersofthestones.block.OrangePortalBlock;
import power.keepeersofthestones.block.MoonBlockBlock;
import power.keepeersofthestones.block.MercuryLiquidBlock;
import power.keepeersofthestones.block.EnergiumOreBlock;
import power.keepeersofthestones.block.EnergiumBlockBlock;
import power.keepeersofthestones.block.DinoeraPortalBlock;
import power.keepeersofthestones.block.DetonatorTNTBlock;
import power.keepeersofthestones.block.DeepslateAmpliferOreBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BluePortalBlock;
import power.keepeersofthestones.block.BlackHoleBlockBlock;
import power.keepeersofthestones.block.BatteryChargerBlock;
import power.keepeersofthestones.block.AmpliferOreBlock;
import power.keepeersofthestones.block.AmpliferBlockBlock;
import power.keepeersofthestones.block.AcidBlock;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerMod.MODID);
	public static final RegistryObject<Block> ENERGIUM_ORE = REGISTRY.register("energium_ore", () -> new EnergiumOreBlock());
	public static final RegistryObject<Block> ENERGIUM_BLOCK = REGISTRY.register("energium_block", () -> new EnergiumBlockBlock());
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> MERCURY_LIQUID = REGISTRY.register("mercury_liquid", () -> new MercuryLiquidBlock());
	public static final RegistryObject<Block> DINOERA_PORTAL = REGISTRY.register("dinoera_portal", () -> new DinoeraPortalBlock());
	public static final RegistryObject<Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
	public static final RegistryObject<Block> AMPLIFER_ORE = REGISTRY.register("amplifer_ore", () -> new AmpliferOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_AMPLIFER_ORE = REGISTRY.register("deepslate_amplifer_ore", () -> new DeepslateAmpliferOreBlock());
	public static final RegistryObject<Block> AMPLIFER_BLOCK = REGISTRY.register("amplifer_block", () -> new AmpliferBlockBlock());
	public static final RegistryObject<Block> CLUSTER_BLOCK = REGISTRY.register("cluster_block", () -> new ClusterBlockBlock());
	public static final RegistryObject<Block> VACUUM_WEB_BLOCK = REGISTRY.register("vacuum_web_block", () -> new VacuumWebBlockBlock());
	public static final RegistryObject<Block> BLACK_HOLE_BLOCK = REGISTRY.register("black_hole_block", () -> new BlackHoleBlockBlock());
	public static final RegistryObject<Block> BLUE_PORTAL = REGISTRY.register("blue_portal", () -> new BluePortalBlock());
	public static final RegistryObject<Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", () -> new OrangePortalBlock());
	public static final RegistryObject<Block> DETONATOR_TNT = REGISTRY.register("detonator_tnt", () -> new DetonatorTNTBlock());
	public static final RegistryObject<Block> QUICKSAND_BLOCK = REGISTRY.register("quicksand_block", () -> new QuicksandBlockBlock());
	public static final RegistryObject<Block> MOON_BLOCK = REGISTRY.register("moon_block", () -> new MoonBlockBlock());
}
