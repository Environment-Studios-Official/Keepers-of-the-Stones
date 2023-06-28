
package power.keepeersofthestones.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ElementalMusicDiscItem extends RecordItem {
	public ElementalMusicDiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:powerful_stone")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 0);
	}
}
