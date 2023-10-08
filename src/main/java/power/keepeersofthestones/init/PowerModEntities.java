
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.entity.WhirlpoolProjectileEntity;
import power.keepeersofthestones.entity.WaterFlowProjectileEntity;
import power.keepeersofthestones.entity.VacuumWebProjectileEntity;
import power.keepeersofthestones.entity.VacuumSpiralProjectileEntity;
import power.keepeersofthestones.entity.TyrannosaurusRexEntity;
import power.keepeersofthestones.entity.TransformSphereProjectileEntity;
import power.keepeersofthestones.entity.ToxicCloudProjectileEntity;
import power.keepeersofthestones.entity.TornadoEntityEntity;
import power.keepeersofthestones.entity.TornadoCreateProjectileEntity;
import power.keepeersofthestones.entity.TimeDilationProjectileEntity;
import power.keepeersofthestones.entity.TigerClawProjectileEntity;
import power.keepeersofthestones.entity.ThrowingHammerProjectileEntity;
import power.keepeersofthestones.entity.SunExplodeProjectileEntity;
import power.keepeersofthestones.entity.SporesProjectileEntity;
import power.keepeersofthestones.entity.SpikeProjectileEntity;
import power.keepeersofthestones.entity.SmokeScreenProjectileEntity;
import power.keepeersofthestones.entity.ShurikenProjectileEntity;
import power.keepeersofthestones.entity.ShadowEntity;
import power.keepeersofthestones.entity.ShadowBallProjectileEntity;
import power.keepeersofthestones.entity.SandFlurryProjectileEntity;
import power.keepeersofthestones.entity.RocketEntity;
import power.keepeersofthestones.entity.RaptorEntity;
import power.keepeersofthestones.entity.RainBowProjectileEntity;
import power.keepeersofthestones.entity.PterodactylEntity;
import power.keepeersofthestones.entity.PortalBlastProjectileEntity;
import power.keepeersofthestones.entity.PlesiosaurusEntity;
import power.keepeersofthestones.entity.PlasmaBallProjectileEntity;
import power.keepeersofthestones.entity.PieceOfEarthProjectileEntity;
import power.keepeersofthestones.entity.MusketProjectileEntity;
import power.keepeersofthestones.entity.MoonStonesProjectileEntity;
import power.keepeersofthestones.entity.MindZombieEntity;
import power.keepeersofthestones.entity.MercuryBallProjectileEntity;
import power.keepeersofthestones.entity.MentalAttackProjectileEntity;
import power.keepeersofthestones.entity.MegawattProjectileEntity;
import power.keepeersofthestones.entity.MassInfectionProjectileEntity;
import power.keepeersofthestones.entity.MagicFireballProjectileEntity;
import power.keepeersofthestones.entity.LavaBallProjectileEntity;
import power.keepeersofthestones.entity.KunaiProjectileEntity;
import power.keepeersofthestones.entity.IceSpearProjectileEntity;
import power.keepeersofthestones.entity.IceBallProjectileEntity;
import power.keepeersofthestones.entity.GoldenSphereProjectileEntity;
import power.keepeersofthestones.entity.GoldenCrossbowProjectileEntity;
import power.keepeersofthestones.entity.GlowEntity;
import power.keepeersofthestones.entity.FlashLightProjectileEntity;
import power.keepeersofthestones.entity.FirebirdFeatherProjectileEntity;
import power.keepeersofthestones.entity.ExplosiveFlowProjectileEntity;
import power.keepeersofthestones.entity.EnergySphereProjectileEntity;
import power.keepeersofthestones.entity.ElectromagneticPulseProjectileEntity;
import power.keepeersofthestones.entity.EctoplasmAttackProjectileEntity;
import power.keepeersofthestones.entity.DiscoBallProjectileEntity;
import power.keepeersofthestones.entity.DestructionSphereProjectileEntity;
import power.keepeersofthestones.entity.DarknessBallProjectileEntity;
import power.keepeersofthestones.entity.ClusterSharpProjectileEntity;
import power.keepeersofthestones.entity.BoomerangProjectileEntity;
import power.keepeersofthestones.entity.BlueFireballProjectileEntity;
import power.keepeersofthestones.entity.BlackHoleProjectileEntity;
import power.keepeersofthestones.entity.BlackHeartProjectileEntity;
import power.keepeersofthestones.entity.AmberStreaksProjectileEntity;
import power.keepeersofthestones.entity.AirFlowProjectileEntity;
import power.keepeersofthestones.entity.AcusticalExplodeProjectileEntity;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PowerMod.MODID);
	public static final RegistryObject<EntityType<TornadoEntityEntity>> TORNADO_ENTITY = register("tornado_entity", EntityType.Builder.<TornadoEntityEntity>of(TornadoEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TornadoEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TyrannosaurusRexEntity>> TYRANNOSAURUS_REX = register("tyrannosaurus_rex",
			EntityType.Builder.<TyrannosaurusRexEntity>of(TyrannosaurusRexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TyrannosaurusRexEntity::new)

					.sized(1.5f, 2.5f));
	public static final RegistryObject<EntityType<RaptorEntity>> RAPTOR = register("raptor",
			EntityType.Builder.<RaptorEntity>of(RaptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RaptorEntity::new)

					.sized(1.2f, 2f));
	public static final RegistryObject<EntityType<PlesiosaurusEntity>> PLESIOSAURUS = register("plesiosaurus",
			EntityType.Builder.<PlesiosaurusEntity>of(PlesiosaurusEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlesiosaurusEntity::new)

					.sized(1.5f, 2.5f));
	public static final RegistryObject<EntityType<PterodactylEntity>> PTERODACTYL = register("pterodactyl",
			EntityType.Builder.<PterodactylEntity>of(PterodactylEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PterodactylEntity::new)

					.sized(1.2f, 2f));
	public static final RegistryObject<EntityType<RocketEntity>> ROCKET = register("rocket",
			EntityType.Builder.<RocketEntity>of(RocketEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RocketEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GlowEntity>> GLOW = register("glow",
			EntityType.Builder.<GlowEntity>of(GlowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<ShadowEntity>> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<MindZombieEntity>> MIND_ZOMBIE = register("mind_zombie",
			EntityType.Builder.<MindZombieEntity>of(MindZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(20).setUpdateInterval(3).setCustomClientFactory(MindZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AirFlowProjectileEntity>> AIR_FLOW_PROJECTILE = register("projectile_air_flow_projectile", EntityType.Builder.<AirFlowProjectileEntity>of(AirFlowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(AirFlowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MagicFireballProjectileEntity>> MAGIC_FIREBALL_PROJECTILE = register("projectile_magic_fireball_projectile",
			EntityType.Builder.<MagicFireballProjectileEntity>of(MagicFireballProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterFlowProjectileEntity>> WATER_FLOW_PROJECTILE = register("projectile_water_flow_projectile", EntityType.Builder.<WaterFlowProjectileEntity>of(WaterFlowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WaterFlowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PieceOfEarthProjectileEntity>> PIECE_OF_EARTH_PROJECTILE = register("projectile_piece_of_earth_projectile",
			EntityType.Builder.<PieceOfEarthProjectileEntity>of(PieceOfEarthProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PieceOfEarthProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnergySphereProjectileEntity>> ENERGY_SPHERE_PROJECTILE = register("projectile_energy_sphere_projectile",
			EntityType.Builder.<EnergySphereProjectileEntity>of(EnergySphereProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EnergySphereProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBallProjectileEntity>> ICE_BALL_PROJECTILE = register("projectile_ice_ball_projectile", EntityType.Builder.<IceBallProjectileEntity>of(IceBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IceBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PlasmaBallProjectileEntity>> PLASMA_BALL_PROJECTILE = register("projectile_plasma_ball_projectile", EntityType.Builder.<PlasmaBallProjectileEntity>of(PlasmaBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PlasmaBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AcusticalExplodeProjectileEntity>> ACUSTICAL_EXPLODE_PROJECTILE = register("projectile_acustical_explode_projectile",
			EntityType.Builder.<AcusticalExplodeProjectileEntity>of(AcusticalExplodeProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AcusticalExplodeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ClusterSharpProjectileEntity>> CLUSTER_SHARP_PROJECTILE = register("projectile_cluster_sharp_projectile",
			EntityType.Builder.<ClusterSharpProjectileEntity>of(ClusterSharpProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ClusterSharpProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaBallProjectileEntity>> LAVA_BALL_PROJECTILE = register("projectile_lava_ball_projectile", EntityType.Builder.<LavaBallProjectileEntity>of(LavaBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LavaBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TornadoCreateProjectileEntity>> TORNADO_CREATE_PROJECTILE = register("projectile_tornado_create_projectile",
			EntityType.Builder.<TornadoCreateProjectileEntity>of(TornadoCreateProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TornadoCreateProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WhirlpoolProjectileEntity>> WHIRLPOOL_PROJECTILE = register("projectile_whirlpool_projectile", EntityType.Builder.<WhirlpoolProjectileEntity>of(WhirlpoolProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WhirlpoolProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RainBowProjectileEntity>> RAIN_BOW_PROJECTILE = register("projectile_rain_bow_projectile", EntityType.Builder.<RainBowProjectileEntity>of(RainBowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RainBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpikeProjectileEntity>> SPIKE_PROJECTILE = register("projectile_spike_projectile", EntityType.Builder.<SpikeProjectileEntity>of(SpikeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SpikeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TigerClawProjectileEntity>> TIGER_CLAW_PROJECTILE = register("projectile_tiger_claw_projectile", EntityType.Builder.<TigerClawProjectileEntity>of(TigerClawProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(TigerClawProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShurikenProjectileEntity>> SHURIKEN_PROJECTILE = register("projectile_shuriken_projectile", EntityType.Builder.<ShurikenProjectileEntity>of(ShurikenProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShurikenProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlashLightProjectileEntity>> FLASH_LIGHT_PROJECTILE = register("projectile_flash_light_projectile", EntityType.Builder.<FlashLightProjectileEntity>of(FlashLightProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FlashLightProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShadowBallProjectileEntity>> SHADOW_BALL_PROJECTILE = register("projectile_shadow_ball_projectile", EntityType.Builder.<ShadowBallProjectileEntity>of(ShadowBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShadowBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VacuumSpiralProjectileEntity>> VACUUM_SPIRAL_PROJECTILE = register("projectile_vacuum_spiral_projectile",
			EntityType.Builder.<VacuumSpiralProjectileEntity>of(VacuumSpiralProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumSpiralProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VacuumWebProjectileEntity>> VACUUM_WEB_PROJECTILE = register("projectile_vacuum_web_projectile", EntityType.Builder.<VacuumWebProjectileEntity>of(VacuumWebProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VacuumWebProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SunExplodeProjectileEntity>> SUN_EXPLODE_PROJECTILE = register("projectile_sun_explode_projectile", EntityType.Builder.<SunExplodeProjectileEntity>of(SunExplodeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SunExplodeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MoonStonesProjectileEntity>> MOON_STONES_PROJECTILE = register("projectile_moon_stones_projectile", EntityType.Builder.<MoonStonesProjectileEntity>of(MoonStonesProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MoonStonesProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackHoleProjectileEntity>> BLACK_HOLE_PROJECTILE = register("projectile_black_hole_projectile", EntityType.Builder.<BlackHoleProjectileEntity>of(BlackHoleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlackHoleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackHeartProjectileEntity>> BLACK_HEART_PROJECTILE = register("projectile_black_heart_projectile", EntityType.Builder.<BlackHeartProjectileEntity>of(BlackHeartProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlackHeartProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TimeDilationProjectileEntity>> TIME_DILATION_PROJECTILE = register("projectile_time_dilation_projectile",
			EntityType.Builder.<TimeDilationProjectileEntity>of(TimeDilationProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TimeDilationProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MegawattProjectileEntity>> MEGAWATT_PROJECTILE = register("projectile_megawatt_projectile", EntityType.Builder.<MegawattProjectileEntity>of(MegawattProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MegawattProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosiveFlowProjectileEntity>> EXPLOSIVE_FLOW_PROJECTILE = register("projectile_explosive_flow_projectile",
			EntityType.Builder.<ExplosiveFlowProjectileEntity>of(ExplosiveFlowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosiveFlowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PortalBlastProjectileEntity>> PORTAL_BLAST_PROJECTILE = register("projectile_portal_blast_projectile",
			EntityType.Builder.<PortalBlastProjectileEntity>of(PortalBlastProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PortalBlastProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceSpearProjectileEntity>> ICE_SPEAR_PROJECTILE = register("projectile_ice_spear_projectile", EntityType.Builder.<IceSpearProjectileEntity>of(IceSpearProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IceSpearProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldenCrossbowProjectileEntity>> GOLDEN_CROSSBOW_PROJECTILE = register("projectile_golden_crossbow_projectile",
			EntityType.Builder.<GoldenCrossbowProjectileEntity>of(GoldenCrossbowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GoldenCrossbowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DestructionSphereProjectileEntity>> DESTRUCTION_SPHERE_PROJECTILE = register("projectile_destruction_sphere_projectile",
			EntityType.Builder.<DestructionSphereProjectileEntity>of(DestructionSphereProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DestructionSphereProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmberStreaksProjectileEntity>> AMBER_STREAKS_PROJECTILE = register("projectile_amber_streaks_projectile",
			EntityType.Builder.<AmberStreaksProjectileEntity>of(AmberStreaksProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(AmberStreaksProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiProjectileEntity>> KUNAI_PROJECTILE = register("projectile_kunai_projectile", EntityType.Builder.<KunaiProjectileEntity>of(KunaiProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KunaiProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SandFlurryProjectileEntity>> SAND_FLURRY_PROJECTILE = register("projectile_sand_flurry_projectile", EntityType.Builder.<SandFlurryProjectileEntity>of(SandFlurryProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SandFlurryProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BoomerangProjectileEntity>> BOOMERANG_PROJECTILE = register("projectile_boomerang_projectile", EntityType.Builder.<BoomerangProjectileEntity>of(BoomerangProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BoomerangProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ToxicCloudProjectileEntity>> TOXIC_CLOUD_PROJECTILE = register("projectile_toxic_cloud_projectile", EntityType.Builder.<ToxicCloudProjectileEntity>of(ToxicCloudProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ToxicCloudProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElectromagneticPulseProjectileEntity>> ELECTROMAGNETIC_PULSE_PROJECTILE = register("projectile_electromagnetic_pulse_projectile",
			EntityType.Builder.<ElectromagneticPulseProjectileEntity>of(ElectromagneticPulseProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElectromagneticPulseProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SporesProjectileEntity>> SPORES_PROJECTILE = register("projectile_spores_projectile", EntityType.Builder.<SporesProjectileEntity>of(SporesProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SporesProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MercuryBallProjectileEntity>> MERCURY_BALL_PROJECTILE = register("projectile_mercury_ball_projectile",
			EntityType.Builder.<MercuryBallProjectileEntity>of(MercuryBallProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MercuryBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiscoBallProjectileEntity>> DISCO_BALL_PROJECTILE = register("projectile_disco_ball_projectile", EntityType.Builder.<DiscoBallProjectileEntity>of(DiscoBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DiscoBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MusketProjectileEntity>> MUSKET_PROJECTILE = register("projectile_musket_projectile", EntityType.Builder.<MusketProjectileEntity>of(MusketProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MusketProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MassInfectionProjectileEntity>> MASS_INFECTION_PROJECTILE = register("projectile_mass_infection_projectile",
			EntityType.Builder.<MassInfectionProjectileEntity>of(MassInfectionProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MassInfectionProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThrowingHammerProjectileEntity>> THROWING_HAMMER_PROJECTILE = register("projectile_throwing_hammer_projectile",
			EntityType.Builder.<ThrowingHammerProjectileEntity>of(ThrowingHammerProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ThrowingHammerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlueFireballProjectileEntity>> BLUE_FIREBALL_PROJECTILE = register("projectile_blue_fireball_projectile",
			EntityType.Builder.<BlueFireballProjectileEntity>of(BlueFireballProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BlueFireballProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EctoplasmAttackProjectileEntity>> ECTOPLASM_ATTACK_PROJECTILE = register("projectile_ectoplasm_attack_projectile",
			EntityType.Builder.<EctoplasmAttackProjectileEntity>of(EctoplasmAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EctoplasmAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FirebirdFeatherProjectileEntity>> FIREBIRD_FEATHER_PROJECTILE = register("projectile_firebird_feather_projectile",
			EntityType.Builder.<FirebirdFeatherProjectileEntity>of(FirebirdFeatherProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FirebirdFeatherProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SmokeScreenProjectileEntity>> SMOKE_SCREEN_PROJECTILE = register("projectile_smoke_screen_projectile",
			EntityType.Builder.<SmokeScreenProjectileEntity>of(SmokeScreenProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SmokeScreenProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TransformSphereProjectileEntity>> TRANSFORM_SPHERE_PROJECTILE = register("projectile_transform_sphere_projectile",
			EntityType.Builder.<TransformSphereProjectileEntity>of(TransformSphereProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TransformSphereProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MentalAttackProjectileEntity>> MENTAL_ATTACK_PROJECTILE = register("projectile_mental_attack_projectile",
			EntityType.Builder.<MentalAttackProjectileEntity>of(MentalAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MentalAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldenSphereProjectileEntity>> GOLDEN_SPHERE_PROJECTILE = register("projectile_golden_sphere_projectile",
			EntityType.Builder.<GoldenSphereProjectileEntity>of(GoldenSphereProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GoldenSphereProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarknessBallProjectileEntity>> DARKNESS_BALL_PROJECTILE = register("projectile_darkness_ball_projectile",
			EntityType.Builder.<DarknessBallProjectileEntity>of(DarknessBallProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DarknessBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TornadoEntityEntity.init();
			TyrannosaurusRexEntity.init();
			RaptorEntity.init();
			PlesiosaurusEntity.init();
			PterodactylEntity.init();
			RocketEntity.init();
			GlowEntity.init();
			ShadowEntity.init();
			MindZombieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TORNADO_ENTITY.get(), TornadoEntityEntity.createAttributes().build());
		event.put(TYRANNOSAURUS_REX.get(), TyrannosaurusRexEntity.createAttributes().build());
		event.put(RAPTOR.get(), RaptorEntity.createAttributes().build());
		event.put(PLESIOSAURUS.get(), PlesiosaurusEntity.createAttributes().build());
		event.put(PTERODACTYL.get(), PterodactylEntity.createAttributes().build());
		event.put(ROCKET.get(), RocketEntity.createAttributes().build());
		event.put(GLOW.get(), GlowEntity.createAttributes().build());
		event.put(SHADOW.get(), ShadowEntity.createAttributes().build());
		event.put(MIND_ZOMBIE.get(), MindZombieEntity.createAttributes().build());
	}
}
