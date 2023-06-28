
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.ChoiseMagicPower3Menu;
import power.keepeersofthestones.procedures.SpiritUseProcedure;
import power.keepeersofthestones.procedures.SmokeUseProcedure;
import power.keepeersofthestones.procedures.MindUseProcedure;
import power.keepeersofthestones.procedures.FormUseProcedure;
import power.keepeersofthestones.procedures.CM2Procedure;
import power.keepeersofthestones.procedures.BlueFlameUseProcedure;
import power.keepeersofthestones.procedures.AetherUseProcedure;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChoiseMagicPower3ButtonMessage {
	private final int buttonID, x, y, z;

	public ChoiseMagicPower3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChoiseMagicPower3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChoiseMagicPower3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChoiseMagicPower3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = ChoiseMagicPower3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SpiritUseProcedure.execute(entity);
		}
		if (buttonID == 1) {

			FormUseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			AetherUseProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MindUseProcedure.execute(entity);
		}
		if (buttonID == 4) {

			BlueFlameUseProcedure.execute(entity);
		}
		if (buttonID == 5) {

			SmokeUseProcedure.execute(entity);
		}
		if (buttonID == 6) {

			CM2Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicPower3ButtonMessage.class, ChoiseMagicPower3ButtonMessage::buffer, ChoiseMagicPower3ButtonMessage::new, ChoiseMagicPower3ButtonMessage::handler);
	}
}
