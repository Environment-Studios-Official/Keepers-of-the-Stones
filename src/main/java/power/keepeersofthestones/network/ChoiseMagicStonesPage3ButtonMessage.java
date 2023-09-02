
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage3Menu;
import power.keepeersofthestones.procedures.SpiritGetProcedure;
import power.keepeersofthestones.procedures.SmokeGetProcedure;
import power.keepeersofthestones.procedures.PreviousPage2Procedure;
import power.keepeersofthestones.procedures.MindGetProcedure;
import power.keepeersofthestones.procedures.GoldenDustGetProcedure;
import power.keepeersofthestones.procedures.FormGetProcedure;
import power.keepeersofthestones.procedures.DarknessGetProcedure;
import power.keepeersofthestones.procedures.BlueFlameGetProcedure;
import power.keepeersofthestones.procedures.AetherGetProcedure;
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
public class ChoiseMagicStonesPage3ButtonMessage {
	private final int buttonID, x, y, z;

	public ChoiseMagicStonesPage3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChoiseMagicStonesPage3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChoiseMagicStonesPage3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChoiseMagicStonesPage3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		Level world = entity.level();
		HashMap guistate = ChoiseMagicStonesPage3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SpiritGetProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			FormGetProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			AetherGetProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			MindGetProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			GoldenDustGetProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			BlueFlameGetProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			DarknessGetProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			SmokeGetProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			PreviousPage2Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicStonesPage3ButtonMessage.class, ChoiseMagicStonesPage3ButtonMessage::buffer, ChoiseMagicStonesPage3ButtonMessage::new, ChoiseMagicStonesPage3ButtonMessage::handler);
	}
}
