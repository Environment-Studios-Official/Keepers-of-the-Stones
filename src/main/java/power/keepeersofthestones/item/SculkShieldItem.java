
package power.keepeersofthestones.item;

import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item;

public class SculkShieldItem extends ShieldItem {
	public SculkShieldItem() {
		super(new Item.Properties().durability(5000).fireResistant());
	}
}
