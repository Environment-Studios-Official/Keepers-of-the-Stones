
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.ChoiseMagicPower1Menu;
import power.keepeersofthestones.procedures.WaterUseProcedure;
import power.keepeersofthestones.procedures.VacuumUseProcedure;
import power.keepeersofthestones.procedures.TornadoUseProcedure;
import power.keepeersofthestones.procedures.SunUseProcedure;
import power.keepeersofthestones.procedures.SoundUseProcedure;
import power.keepeersofthestones.procedures.ShadowUseProcedure;
import power.keepeersofthestones.procedures.RainUseProcedure;
import power.keepeersofthestones.procedures.OceanUseProcedure;
import power.keepeersofthestones.procedures.MetalUseProcedure;
import power.keepeersofthestones.procedures.LightningUseProcedure;
import power.keepeersofthestones.procedures.LightUseProcedure;
import power.keepeersofthestones.procedures.LavaUseProcedure;
import power.keepeersofthestones.procedures.IceUseProcedure;
import power.keepeersofthestones.procedures.GreeneryUseProcedure;
import power.keepeersofthestones.procedures.FireUseProcedure;
import power.keepeersofthestones.procedures.EnergyUseProcedure;
import power.keepeersofthestones.procedures.EarthUseProcedure;
import power.keepeersofthestones.procedures.CrystalUseProcedure;
import power.keepeersofthestones.procedures.CM2Procedure;
import power.keepeersofthestones.procedures.AnimalsUseProcedure;
import power.keepeersofthestones.procedures.AirUseProcedure;
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
public class ChoiseMagicPower1ButtonMessage {
	private final int buttonID, x, y, z;

	public ChoiseMagicPower1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChoiseMagicPower1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChoiseMagicPower1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChoiseMagicPower1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ChoiseMagicPower1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			FireUseProcedure.execute(entity);
		}
		if (buttonID == 1) {

			AirUseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			WaterUseProcedure.execute(entity);
		}
		if (buttonID == 3) {

			EarthUseProcedure.execute(entity);
		}
		if (buttonID == 4) {

			EnergyUseProcedure.execute(entity);
		}
		if (buttonID == 5) {

			IceUseProcedure.execute(entity);
		}
		if (buttonID == 6) {

			LightningUseProcedure.execute(entity);
		}
		if (buttonID == 7) {

			SoundUseProcedure.execute(entity);
		}
		if (buttonID == 8) {

			CrystalUseProcedure.execute(entity);
		}
		if (buttonID == 9) {

			LavaUseProcedure.execute(entity);
		}
		if (buttonID == 10) {

			RainUseProcedure.execute(entity);
		}
		if (buttonID == 11) {

			OceanUseProcedure.execute(entity);
		}
		if (buttonID == 12) {

			GreeneryUseProcedure.execute(entity);
		}
		if (buttonID == 13) {

			TornadoUseProcedure.execute(entity);
		}
		if (buttonID == 14) {

			CM2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 15) {

			AnimalsUseProcedure.execute(entity);
		}
		if (buttonID == 16) {

			MetalUseProcedure.execute(entity);
		}
		if (buttonID == 17) {

			LightUseProcedure.execute(entity);
		}
		if (buttonID == 18) {

			ShadowUseProcedure.execute(entity);
		}
		if (buttonID == 19) {

			VacuumUseProcedure.execute(entity);
		}
		if (buttonID == 20) {

			SunUseProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicPower1ButtonMessage.class, ChoiseMagicPower1ButtonMessage::buffer, ChoiseMagicPower1ButtonMessage::new, ChoiseMagicPower1ButtonMessage::handler);
	}
}
