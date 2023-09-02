
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.BuildInMusicPlayerMenu;
import power.keepeersofthestones.procedures.StopSoundProcedure;
import power.keepeersofthestones.procedures.PlayMusicWardProcedure;
import power.keepeersofthestones.procedures.PlayMusicWaitProcedure;
import power.keepeersofthestones.procedures.PlayMusicStradProcedure;
import power.keepeersofthestones.procedures.PlayMusicStalProcedure;
import power.keepeersofthestones.procedures.PlayMusicPigstepProcedure;
import power.keepeersofthestones.procedures.PlayMusicOthersideProcedure;
import power.keepeersofthestones.procedures.PlayMusicMellohiProcedure;
import power.keepeersofthestones.procedures.PlayMusicMallProcedure;
import power.keepeersofthestones.procedures.PlayMusicFarProcedure;
import power.keepeersofthestones.procedures.PlayMusicChirpProcedure;
import power.keepeersofthestones.procedures.PlayMusicCatProcedure;
import power.keepeersofthestones.procedures.PlayMusicBlocksProcedure;
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
public class BuildInMusicPlayerButtonMessage {
	private final int buttonID, x, y, z;

	public BuildInMusicPlayerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BuildInMusicPlayerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BuildInMusicPlayerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BuildInMusicPlayerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = BuildInMusicPlayerMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			StopSoundProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			PlayMusicCatProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			PlayMusicBlocksProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			PlayMusicFarProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			PlayMusicMallProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			PlayMusicMellohiProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			PlayMusicChirpProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			PlayMusicStalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			PlayMusicStradProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			PlayMusicWardProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			PlayMusicWaitProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			PlayMusicPigstepProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			PlayMusicOthersideProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(BuildInMusicPlayerButtonMessage.class, BuildInMusicPlayerButtonMessage::buffer, BuildInMusicPlayerButtonMessage::new, BuildInMusicPlayerButtonMessage::handler);
	}
}
