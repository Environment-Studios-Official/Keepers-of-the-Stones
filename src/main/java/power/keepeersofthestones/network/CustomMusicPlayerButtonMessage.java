
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.CustomMusicPlayerMenu;
import power.keepeersofthestones.procedures.StopSoundProcedure;
import power.keepeersofthestones.procedures.PlayMusic9Procedure;
import power.keepeersofthestones.procedures.PlayMusic8Procedure;
import power.keepeersofthestones.procedures.PlayMusic7Procedure;
import power.keepeersofthestones.procedures.PlayMusic6Procedure;
import power.keepeersofthestones.procedures.PlayMusic5Procedure;
import power.keepeersofthestones.procedures.PlayMusic4Procedure;
import power.keepeersofthestones.procedures.PlayMusic3Procedure;
import power.keepeersofthestones.procedures.PlayMusic2Procedure;
import power.keepeersofthestones.procedures.PlayMusic1Procedure;
import power.keepeersofthestones.procedures.PlayMusic10Procedure;
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
public class CustomMusicPlayerButtonMessage {
	private final int buttonID, x, y, z;

	public CustomMusicPlayerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CustomMusicPlayerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CustomMusicPlayerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CustomMusicPlayerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CustomMusicPlayerMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			StopSoundProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			PlayMusic1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			PlayMusic2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			PlayMusic3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			PlayMusic4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			PlayMusic5Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			PlayMusic6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			PlayMusic7Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			PlayMusic8Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			PlayMusic9Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			PlayMusic10Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(CustomMusicPlayerButtonMessage.class, CustomMusicPlayerButtonMessage::buffer, CustomMusicPlayerButtonMessage::new, CustomMusicPlayerButtonMessage::handler);
	}
}
