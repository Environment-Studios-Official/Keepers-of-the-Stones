
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerMod.MODID);
	public static final RegistryObject<CreativeModeTab> BATTERIES = REGISTRY.register("batteries",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.batteries")).icon(() -> new ItemStack(PowerModItems.EMPTY_BATTERY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.EMPTY_BATTERY.get());
				tabData.accept(PowerModItems.FIRE_BATTERY.get());
				tabData.accept(PowerModItems.AIR_BATTERY.get());
				tabData.accept(PowerModItems.WATER_BATTERY.get());
				tabData.accept(PowerModItems.EARTH_BATTERY.get());
				tabData.accept(PowerModItems.ENERGY_BATTERY.get());
				tabData.accept(PowerModItems.ICE_BATTERY.get());
				tabData.accept(PowerModItems.LIGHTNING_BATTERY.get());
				tabData.accept(PowerModItems.SOUND_BATTERY.get());
				tabData.accept(PowerModItems.CRYSTAL_BATTERY.get());
				tabData.accept(PowerModItems.LAVA_BATTERY.get());
				tabData.accept(PowerModItems.RAIN_BATTERY.get());
				tabData.accept(PowerModItems.TORNADO_BATTERY.get());
				tabData.accept(PowerModItems.OCEAN_BATTERY.get());
				tabData.accept(PowerModItems.GREENERY_BATTERY.get());
				tabData.accept(PowerModItems.ANIMALS_BATTERY.get());
				tabData.accept(PowerModItems.METAL_BATTERY.get());
				tabData.accept(PowerModItems.LIGHT_BATTERY.get());
				tabData.accept(PowerModItems.SHADOW_BATTERY.get());
				tabData.accept(PowerModItems.VACUUM_BATTERY.get());
				tabData.accept(PowerModItems.SUN_BATTERY.get());
				tabData.accept(PowerModItems.MOON_BATTERY.get());
				tabData.accept(PowerModItems.SPACE_BATTERY.get());
				tabData.accept(PowerModItems.BLOOD_BATTERY.get());
				tabData.accept(PowerModItems.TIME_BATTERY.get());
				tabData.accept(PowerModItems.TECHNOLOGY_BATTERY.get());
				tabData.accept(PowerModItems.TELEPORTATION_BATTERY.get());
				tabData.accept(PowerModItems.EXPLOSION_BATTERY.get());
				tabData.accept(PowerModItems.MIST_BATTERY.get());
				tabData.accept(PowerModItems.SAND_BATTERY.get());
				tabData.accept(PowerModItems.SPEED_BATTERY.get());
				tabData.accept(PowerModItems.POISON_BATTERY.get());
				tabData.accept(PowerModItems.MAGNET_BATTERY.get());
				tabData.accept(PowerModItems.MUSHROOMS_BATTERY.get());
				tabData.accept(PowerModItems.MERCURY_BATTERY.get());
				tabData.accept(PowerModItems.MUSIC_BATTERY.get());
				tabData.accept(PowerModItems.PLAGUE_BATTERY.get());
				tabData.accept(PowerModItems.GRAVITY_BATTERY.get());
				tabData.accept(PowerModItems.BLUE_FLAME_BATTERY.get());
				tabData.accept(PowerModItems.SPIRIT_BATTERY.get());
				tabData.accept(PowerModItems.SMOKE_BATTERY.get());
				tabData.accept(PowerModItems.FORM_BATTERY.get());
				tabData.accept(PowerModItems.MIND_BATTERY.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ENERGIUM = REGISTRY.register("energium",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.energium")).icon(() -> new ItemStack(PowerModItems.ENERGIUM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModBlocks.ENERGIUM_ORE.get().asItem());
				tabData.accept(PowerModBlocks.ENERGIUM_BLOCK.get().asItem());
				tabData.accept(PowerModItems.RAW_ENERGIUM.get());
				tabData.accept(PowerModItems.ENERGIUM_INGOT.get());
				tabData.accept(PowerModItems.ENERGIUM_SWORD.get());
				tabData.accept(PowerModItems.ENERGIUM_PICKAXE.get());
				tabData.accept(PowerModItems.ENERGIUM_AXE.get());
				tabData.accept(PowerModItems.ENERGIUM_SHOVEL.get());
				tabData.accept(PowerModItems.ENERGIUM_HOE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> TECHNOLOGIES = REGISTRY.register("technologies",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.technologies")).icon(() -> new ItemStack(PowerModItems.ROCKET_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModBlocks.BATTERY_CHARGER.get().asItem());
				tabData.accept(PowerModItems.ROCKET_ITEM.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ARTIFACTS = REGISTRY.register("artifacts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.artifacts")).icon(() -> new ItemStack(PowerModItems.BOOK_OF_ELEMENTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.ELEMENTAL_MUSIC_DISC.get());
				tabData.accept(PowerModItems.BOOK_OF_ELEMENTS.get());
				tabData.accept(PowerModItems.ELEMENTAL_COIN.get());
				tabData.accept(PowerModItems.DINOERA.get());
				tabData.accept(PowerModItems.PINCH_OF_GOLDEN_DUST.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> STONES = REGISTRY.register("stones",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.stones")).icon(() -> new ItemStack(PowerModItems.GOLDEN_DUST_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.SPACE_STONE.get());
				tabData.accept(PowerModItems.SAND_STONE.get());
				tabData.accept(PowerModItems.TORNADO_STONE.get());
				tabData.accept(PowerModItems.EARTH_STONE.get());
				tabData.accept(PowerModItems.ANIMALS_STONE.get());
				tabData.accept(PowerModItems.TIME_STONE.get());
				tabData.accept(PowerModItems.BLOOD_STONE.get());
				tabData.accept(PowerModItems.FIRE_STONE.get());
				tabData.accept(PowerModItems.EXPLOSION_STONE.get());
				tabData.accept(PowerModItems.LAVA_STONE.get());
				tabData.accept(PowerModItems.AMBER_STONE.get());
				tabData.accept(PowerModItems.GOLDEN_DUST_STONE.get());
				tabData.accept(PowerModItems.ENERGY_STONE.get());
				tabData.accept(PowerModItems.LIGHT_STONE.get());
				tabData.accept(PowerModItems.SUN_STONE.get());
				tabData.accept(PowerModItems.POISON_STONE.get());
				tabData.accept(PowerModItems.GREENERY_STONE.get());
				tabData.accept(PowerModItems.VACUUM_STONE.get());
				tabData.accept(PowerModItems.OCEAN_STONE.get());
				tabData.accept(PowerModItems.AETHER_STONE.get());
				tabData.accept(PowerModItems.BLUE_FLAME_STONE.get());
				tabData.accept(PowerModItems.SPEED_STONE.get());
				tabData.accept(PowerModItems.WATER_STONE.get());
				tabData.accept(PowerModItems.AIR_STONE.get());
				tabData.accept(PowerModItems.RAIN_STONE.get());
				tabData.accept(PowerModItems.ICE_STONE.get());
				tabData.accept(PowerModItems.MUSIC_STONE.get());
				tabData.accept(PowerModItems.SPIRIT_STONE.get());
				tabData.accept(PowerModItems.TECHNOLOGY_STONE.get());
				tabData.accept(PowerModItems.TELEPORTATION_STONE.get());
				tabData.accept(PowerModItems.MIST_STONE.get());
				tabData.accept(PowerModItems.MUSHROOMS_STONE.get());
				tabData.accept(PowerModItems.SOUND_STONE.get());
				tabData.accept(PowerModItems.CRYSTAL_STONE.get());
				tabData.accept(PowerModItems.LIGHTNING_STONE.get());
				tabData.accept(PowerModItems.MAGNET_STONE.get());
				tabData.accept(PowerModItems.FORM_STONE.get());
				tabData.accept(PowerModItems.MIND_STONE.get());
				tabData.accept(PowerModItems.GRAVITY_STONE.get());
				tabData.accept(PowerModItems.MERCURY_STONE.get());
				tabData.accept(PowerModItems.SMOKE_STONE.get());
				tabData.accept(PowerModItems.CREATION_STONE.get());
				tabData.accept(PowerModItems.METAL_STONE.get());
				tabData.accept(PowerModItems.MOON_STONE.get());
				tabData.accept(PowerModItems.PLAGUE_STONE.get());
				tabData.accept(PowerModItems.SHADOW_STONE.get());
				tabData.accept(PowerModItems.DESTRUCTION_STONE.get());
				tabData.accept(PowerModItems.DARKNESS_STONE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> AMPLIFER_CRYSTAL_TAB = REGISTRY.register("amplifer_crystal_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.amplifer_crystal_tab")).icon(() -> new ItemStack(PowerModItems.AMPLIFER_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.AMPLIFER_CRYSTAL.get());
				tabData.accept(PowerModBlocks.AMPLIFER_ORE.get().asItem());
				tabData.accept(PowerModBlocks.DEEPSLATE_AMPLIFER_ORE.get().asItem());
				tabData.accept(PowerModBlocks.AMPLIFER_BLOCK.get().asItem());
				tabData.accept(PowerModItems.AMPLIFER_RING.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> REINFORCED_BATTERIES = REGISTRY.register("reinforced_batteries",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.reinforced_batteries")).icon(() -> new ItemStack(PowerModItems.EMPTY_REINFORCED_BATTERY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.EMPTY_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.FIRE_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.AIR_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.WATER_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.EARTH_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.ENERGY_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.ICE_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.LIGHTNING_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SOUND_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.CRYSTAL_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.LAVA_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.RAIN_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.TORNADO_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.OCEAN_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.GREENERY_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.ANIMALS_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.METAL_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.LIGHT_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SHADOW_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.VACUUM_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SUN_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MOON_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SPACE_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.TIME_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.BLOOD_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.TECHNOLOGY_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.TELEPORTATION_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.EXPLOSION_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MIST_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SAND_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SPEED_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.POISON_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MAGNET_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MUSHROOMS_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MERCURY_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MUSIC_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.PLAGUE_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.BLUE_FLAME_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.GRAVITY_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SMOKE_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.SPIRIT_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.FORM_REINFORCED_BATTERY.get());
				tabData.accept(PowerModItems.MIND_REINFORCED_BATTERY.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SHARDS = REGISTRY.register("shards",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.shards")).icon(() -> new ItemStack(PowerModItems.WILD_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.WILD_SHARD.get());
				tabData.accept(PowerModItems.BOGGY_SHARD.get());
				tabData.accept(PowerModItems.BURN_SHARD.get());
				tabData.accept(PowerModItems.THUNDERSTORM_SHARD.get());
				tabData.accept(PowerModItems.VOLCANIC_SHARD.get());
				tabData.accept(PowerModItems.CRYSTALLIZED_SHARD.get());
				tabData.accept(PowerModItems.DEPTH_SHARD.get());
				tabData.accept(PowerModItems.FROZEN_SHARD.get());
				tabData.accept(PowerModItems.TWILIGHT_SHARD.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WILD_BATTERIES = REGISTRY.register("wild_batteries",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.power.wild_batteries")).icon(() -> new ItemStack(PowerModItems.EMPTY_WILD_BATTERIES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerModItems.EMPTY_WILD_BATTERIES.get());
				tabData.accept(PowerModItems.WILD_FIRE_BATTERY.get());
				tabData.accept(PowerModItems.WILD_AIR_BATTERY.get());
				tabData.accept(PowerModItems.WILD_WATER_BATTERY.get());
				tabData.accept(PowerModItems.WILD_EARTH_BATTERY.get());
				tabData.accept(PowerModItems.WILD_ENERGY_BATTERY.get());
				tabData.accept(PowerModItems.WILD_ICE_BATTERY.get());
				tabData.accept(PowerModItems.WILD_LIGHTNING_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SOUND_BATTERY.get());
				tabData.accept(PowerModItems.WILD_CRYSTAL_BATTERY.get());
				tabData.accept(PowerModItems.WILD_LAVA_BATTERY.get());
				tabData.accept(PowerModItems.WILD_RAIN_BATTERY.get());
				tabData.accept(PowerModItems.WILD_TORNADO_BATTERY.get());
				tabData.accept(PowerModItems.WILD_OCEAN_BATTERY.get());
				tabData.accept(PowerModItems.WILD_GREENERY_BATTERY.get());
				tabData.accept(PowerModItems.WILD_ANIMALS_BATTERY.get());
				tabData.accept(PowerModItems.WILD_METAL_BATTERY.get());
				tabData.accept(PowerModItems.WILD_LIGHT_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SHADOW_BATTERY.get());
				tabData.accept(PowerModItems.WILD_VACUUM_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SUN_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MOON_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SPACE_BATTERY.get());
				tabData.accept(PowerModItems.WILD_TIME_BATTERY.get());
				tabData.accept(PowerModItems.WILD_BLOOD_BATTERY.get());
				tabData.accept(PowerModItems.WILD_TECHNOLOGY_BATTERY.get());
				tabData.accept(PowerModItems.WILD_TELEPORTATION_BATTERY.get());
				tabData.accept(PowerModItems.WILD_EXPLOSION_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MIST_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SAND_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SPEED_BATTERY.get());
				tabData.accept(PowerModItems.WILD_POISON_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MAGNET_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MUSHROOMS_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MERCURY_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MUSIC_BATTERY.get());
				tabData.accept(PowerModItems.WILD_PLAGUE_BATTERY.get());
				tabData.accept(PowerModItems.WILD_BLUE_FLAME_BATTERY.get());
				tabData.accept(PowerModItems.WILD_GRAVITY_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SMOKE_BATTERY.get());
				tabData.accept(PowerModItems.WILD_SPIRIT_BATTERY.get());
				tabData.accept(PowerModItems.WILD_FORM_BATTERY.get());
				tabData.accept(PowerModItems.WILD_MIND_BATTERY.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PowerModItems.TYRANNOSAURUS_REX_SPAWN_EGG.get());
			tabData.accept(PowerModItems.RAPTOR_SPAWN_EGG.get());
			tabData.accept(PowerModItems.PLESIOSAURUS_SPAWN_EGG.get());
			tabData.accept(PowerModItems.PTERODACTYL_SPAWN_EGG.get());
		}
	}
}
