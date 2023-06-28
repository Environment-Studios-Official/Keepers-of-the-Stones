
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.ChoiseMagicPower2Menu;
import power.keepeersofthestones.procedures.TimeUseProcedure;
import power.keepeersofthestones.procedures.TeleportationUseProcedure;
import power.keepeersofthestones.procedures.TechnologyUseProcedure;
import power.keepeersofthestones.procedures.SpeedUseProcedure;
import power.keepeersofthestones.procedures.SpaceUseProcedure;
import power.keepeersofthestones.procedures.SandUseProcedure;
import power.keepeersofthestones.procedures.PoisonUseProcedure;
import power.keepeersofthestones.procedures.PlagueUseProcedure;
import power.keepeersofthestones.procedures.MusicUseProcedure;
import power.keepeersofthestones.procedures.MushroomsUseProcedure;
import power.keepeersofthestones.procedures.MoonUseProcedure;
import power.keepeersofthestones.procedures.MistUseProcedure;
import power.keepeersofthestones.procedures.MercuryUseProcedure;
import power.keepeersofthestones.procedures.MagnetUseProcedure;
import power.keepeersofthestones.procedures.GravityUseProcedure;
import power.keepeersofthestones.procedures.ExplosionUseProcedure;
import power.keepeersofthestones.procedures.DestructionUseProcedure;
import power.keepeersofthestones.procedures.CreationUseProcedure;
import power.keepeersofthestones.procedures.CM3Procedure;
import power.keepeersofthestones.procedures.CM1Procedure;
import power.keepeersofthestones.procedures.BloodUseProcedure;
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
public class ChoiseMagicPower2ButtonMessage {
	private final int buttonID, x, y, z;

	public ChoiseMagicPower2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChoiseMagicPower2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChoiseMagicPower2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChoiseMagicPower2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ChoiseMagicPower2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			MoonUseProcedure.execute(entity);
		}
		if (buttonID == 1) {

			DestructionUseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			SpaceUseProcedure.execute(entity);
		}
		if (buttonID == 3) {

			BloodUseProcedure.execute(entity);
		}
		if (buttonID == 4) {

			TimeUseProcedure.execute(entity);
		}
		if (buttonID == 5) {

			TechnologyUseProcedure.execute(entity);
		}
		if (buttonID == 6) {

			ExplosionUseProcedure.execute(entity);
		}
		if (buttonID == 7) {

			TeleportationUseProcedure.execute(entity);
		}
		if (buttonID == 8) {

			CreationUseProcedure.execute(entity);
		}
		if (buttonID == 9) {

			MistUseProcedure.execute(entity);
		}
		if (buttonID == 10) {

			SandUseProcedure.execute(entity);
		}
		if (buttonID == 11) {

			SpeedUseProcedure.execute(entity);
		}
		if (buttonID == 12) {

			CM1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			PoisonUseProcedure.execute(entity);
		}
		if (buttonID == 14) {

			MagnetUseProcedure.execute(entity);
		}
		if (buttonID == 15) {

			MushroomsUseProcedure.execute(entity);
		}
		if (buttonID == 16) {

			MercuryUseProcedure.execute(entity);
		}
		if (buttonID == 17) {

			MusicUseProcedure.execute(entity);
		}
		if (buttonID == 18) {

			PlagueUseProcedure.execute(entity);
		}
		if (buttonID == 19) {

			GravityUseProcedure.execute(entity);
		}
		if (buttonID == 20) {

			CM3Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicPower2ButtonMessage.class, ChoiseMagicPower2ButtonMessage::buffer, ChoiseMagicPower2ButtonMessage::new, ChoiseMagicPower2ButtonMessage::handler);
	}
}
