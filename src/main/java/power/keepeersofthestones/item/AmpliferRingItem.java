
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.RemoveRechargeByRingProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class AmpliferRingItem extends Item {
	public AmpliferRingItem() {
		super(new Item.Properties().durability(25).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		RemoveRechargeByRingProcedure.execute(entity, itemstack);
		return ar;
	}
}
