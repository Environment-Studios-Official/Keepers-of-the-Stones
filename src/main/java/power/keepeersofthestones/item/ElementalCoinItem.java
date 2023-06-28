
package power.keepeersofthestones.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElementalCoinItem extends Item {
	public ElementalCoinItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
