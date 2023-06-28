
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModShieldProperties {
	private static final List<RegistryObject<Item>> shields = List.of(PowerModItems.SHIELD_OF_EARTH, PowerModItems.ICE_SHIELD, PowerModItems.SOUND_BARRIER, PowerModItems.ENERGY_SHIELD, PowerModItems.CRYSTAL_SHIELD, PowerModItems.MAGMA_SHIELD,
			PowerModItems.CORAL_SHIELD, PowerModItems.WOODEN_SHIELD, PowerModItems.IRON_SHIELD, PowerModItems.TECHNOBARRIER, PowerModItems.AMBER_SHIELD, PowerModItems.SAND_SHIELD, PowerModItems.GOLDEN_SHIELD, PowerModItems.DARK_SHIELD);

	@SubscribeEvent
	public static void initShields(final FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			for (RegistryObject<Item> shieldItem : shields)
				ItemProperties.register(shieldItem.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
