
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.CultivationGUIMenu;
import power.keepeersofthestones.procedures.GetWheatProcedure;
import power.keepeersofthestones.procedures.GetWaterLilyProcedure;
import power.keepeersofthestones.procedures.GetSugarCaneProcedure;
import power.keepeersofthestones.procedures.GetSpruceSaplingProcedure;
import power.keepeersofthestones.procedures.GetPumpkinProcedure;
import power.keepeersofthestones.procedures.GetPotatoProcedure;
import power.keepeersofthestones.procedures.GetOakSaplingProcedure;
import power.keepeersofthestones.procedures.GetMelonProcedure;
import power.keepeersofthestones.procedures.GetJungleSaplingProcedure;
import power.keepeersofthestones.procedures.GetDarkSaplingProcedure;
import power.keepeersofthestones.procedures.GetCarrotProcedure;
import power.keepeersofthestones.procedures.GetBirchSaplingProcedure;
import power.keepeersofthestones.procedures.GetBeetrootProcedure;
import power.keepeersofthestones.procedures.GetBambooProcedure;
import power.keepeersofthestones.procedures.GetAcaciaSaplingProcedure;
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
public class CultivationGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CultivationGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CultivationGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CultivationGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CultivationGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CultivationGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GetWaterLilyProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			GetOakSaplingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			GetBirchSaplingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GetSpruceSaplingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			GetAcaciaSaplingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			GetDarkSaplingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			GetJungleSaplingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			GetWheatProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			GetPotatoProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			GetCarrotProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			GetBeetrootProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			GetMelonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			GetPumpkinProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			GetSugarCaneProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 14) {

			GetBambooProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(CultivationGUIButtonMessage.class, CultivationGUIButtonMessage::buffer, CultivationGUIButtonMessage::new, CultivationGUIButtonMessage::handler);
	}
}
