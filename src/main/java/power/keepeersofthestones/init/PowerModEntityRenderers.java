
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.renderer.TyrannosaurusRexRenderer;
import power.keepeersofthestones.client.renderer.TornadoEntityRenderer;
import power.keepeersofthestones.client.renderer.TornadoCreateProjectileRenderer;
import power.keepeersofthestones.client.renderer.ShadowRenderer;
import power.keepeersofthestones.client.renderer.RocketRenderer;
import power.keepeersofthestones.client.renderer.RaptorRenderer;
import power.keepeersofthestones.client.renderer.RainBowProjectileRenderer;
import power.keepeersofthestones.client.renderer.PterodactylRenderer;
import power.keepeersofthestones.client.renderer.PlesiosaurusRenderer;
import power.keepeersofthestones.client.renderer.MusketProjectileRenderer;
import power.keepeersofthestones.client.renderer.MindZombieRenderer;
import power.keepeersofthestones.client.renderer.GoldenCrossbowProjectileRenderer;
import power.keepeersofthestones.client.renderer.GlowRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PowerModEntities.TORNADO_ENTITY.get(), TornadoEntityRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TYRANNOSAURUS_REX.get(), TyrannosaurusRexRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAPTOR.get(), RaptorRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PLESIOSAURUS.get(), PlesiosaurusRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PTERODACTYL.get(), PterodactylRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ROCKET.get(), RocketRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GLOW.get(), GlowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW.get(), ShadowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MIND_ZOMBIE.get(), MindZombieRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AIR_FLOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MAGIC_FIREBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WATER_FLOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PIECE_OF_EARTH_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ENERGY_SPHERE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PLASMA_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ACUSTICAL_EXPLODE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.CLUSTER_SHARP_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.LAVA_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TORNADO_CREATE_PROJECTILE.get(), TornadoCreateProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WHIRLPOOL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAIN_BOW_PROJECTILE.get(), RainBowProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SPIKE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIGER_CLAW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHURIKEN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.FLASH_LIGHT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_SPIRAL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_WEB_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SUN_EXPLODE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MOON_STONES_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HOLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HEART_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIME_DILATION_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MEGAWATT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.EXPLOSIVE_FLOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PORTAL_BLAST_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_SPEAR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GOLDEN_CROSSBOW_PROJECTILE.get(), GoldenCrossbowProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DESTRUCTION_SPHERE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AMBER_STREAKS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.KUNAI_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SAND_FLURRY_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BOOMERANG_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TOXIC_CLOUD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ELECTROMAGNETIC_PULSE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SPORES_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MERCURY_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DISCO_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MUSKET_PROJECTILE.get(), MusketProjectileRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MASS_INFECTION_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.THROWING_HAMMER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLUE_FIREBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ECTOPLASM_ATTACK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.FIREBIRD_FEATHER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SMOKE_SCREEN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TRANSFORM_SPHERE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MENTAL_ATTACK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GOLDEN_SPHERE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DARKNESS_BALL_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
