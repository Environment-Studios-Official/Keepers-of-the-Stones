
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.features.ores.EnergiumOreFeature;
import power.keepeersofthestones.world.features.ores.DeepslateAmpliferOreFeature;
import power.keepeersofthestones.world.features.ores.AmpliferOreFeature;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PowerModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PowerMod.MODID);
	public static final RegistryObject<Feature<?>> ENERGIUM_ORE = REGISTRY.register("energium_ore", EnergiumOreFeature::new);
	public static final RegistryObject<Feature<?>> AMPLIFER_ORE = REGISTRY.register("amplifer_ore", AmpliferOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_AMPLIFER_ORE = REGISTRY.register("deepslate_amplifer_ore", DeepslateAmpliferOreFeature::new);
}
