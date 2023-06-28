
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.MagneticPowerUseProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class MagneticFishingRodItem extends FishingRodItem {
	public MagneticFishingRodItem() {
		super(new Item.Properties().durability(5000).fireResistant());
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		super.use(world, entity, hand);
		ItemStack itemstack = entity.getItemInHand(hand);
		MagneticPowerUseProcedure.execute(world, entity, itemstack);
		return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
	}
}
