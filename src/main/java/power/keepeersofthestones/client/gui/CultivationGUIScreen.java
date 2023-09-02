package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.CultivationGUIMenu;
import power.keepeersofthestones.network.CultivationGUIButtonMessage;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CultivationGUIScreen extends AbstractContainerScreen<CultivationGUIMenu> {
	private final static HashMap<String, Object> guistate = CultivationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_water_lily;
	Button button_oak_sapling;
	Button button_birch_sapling;
	Button button_spruce_sapling;
	Button button_acacia_sapling;
	Button button_dark_sapling;
	Button button_jungle_sapling;
	Button button_wheat;
	Button button_potato;
	Button button_carrot;
	Button button_beetroot;
	Button button_melon;
	Button button_pumpkin;
	Button button_sugar_cane;
	Button button_bamboo;

	public CultivationGUIScreen(CultivationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 354;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/cultivation_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.power.cultivation_gui.label_select_a_plant_to_get"), 113, 6, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_water_lily = Button.builder(Component.translatable("gui.power.cultivation_gui.button_water_lily"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(0, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 257, this.topPos + 133, 77, 20).build();
		guistate.put("button:button_water_lily", button_water_lily);
		this.addRenderableWidget(button_water_lily);
		button_oak_sapling = Button.builder(Component.translatable("gui.power.cultivation_gui.button_oak_sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(1, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 25, 77, 20).build();
		guistate.put("button:button_oak_sapling", button_oak_sapling);
		this.addRenderableWidget(button_oak_sapling);
		button_birch_sapling = Button.builder(Component.translatable("gui.power.cultivation_gui.button_birch_sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(2, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 25, 77, 20).build();
		guistate.put("button:button_birch_sapling", button_birch_sapling);
		this.addRenderableWidget(button_birch_sapling);
		button_spruce_sapling = Button.builder(Component.translatable("gui.power.cultivation_gui.button_spruce_sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(3, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 133, 77, 20).build();
		guistate.put("button:button_spruce_sapling", button_spruce_sapling);
		this.addRenderableWidget(button_spruce_sapling);
		button_acacia_sapling = Button.builder(Component.translatable("gui.power.cultivation_gui.button_acacia_sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(4, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 257, this.topPos + 25, 77, 20).build();
		guistate.put("button:button_acacia_sapling", button_acacia_sapling);
		this.addRenderableWidget(button_acacia_sapling);
		button_dark_sapling = Button.builder(Component.translatable("gui.power.cultivation_gui.button_dark_sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(5, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 52, 77, 20).build();
		guistate.put("button:button_dark_sapling", button_dark_sapling);
		this.addRenderableWidget(button_dark_sapling);
		button_jungle_sapling = Button.builder(Component.translatable("gui.power.cultivation_gui.button_jungle_sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(6, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 52, 77, 20).build();
		guistate.put("button:button_jungle_sapling", button_jungle_sapling);
		this.addRenderableWidget(button_jungle_sapling);
		button_wheat = Button.builder(Component.translatable("gui.power.cultivation_gui.button_wheat"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(7, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 79, 77, 20).build();
		guistate.put("button:button_wheat", button_wheat);
		this.addRenderableWidget(button_wheat);
		button_potato = Button.builder(Component.translatable("gui.power.cultivation_gui.button_potato"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(8, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 79, 77, 20).build();
		guistate.put("button:button_potato", button_potato);
		this.addRenderableWidget(button_potato);
		button_carrot = Button.builder(Component.translatable("gui.power.cultivation_gui.button_carrot"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(9, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 257, this.topPos + 79, 77, 20).build();
		guistate.put("button:button_carrot", button_carrot);
		this.addRenderableWidget(button_carrot);
		button_beetroot = Button.builder(Component.translatable("gui.power.cultivation_gui.button_beetroot"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(10, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 133, 77, 20).build();
		guistate.put("button:button_beetroot", button_beetroot);
		this.addRenderableWidget(button_beetroot);
		button_melon = Button.builder(Component.translatable("gui.power.cultivation_gui.button_melon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(11, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 106, 77, 20).build();
		guistate.put("button:button_melon", button_melon);
		this.addRenderableWidget(button_melon);
		button_pumpkin = Button.builder(Component.translatable("gui.power.cultivation_gui.button_pumpkin"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(12, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 106, 77, 20).build();
		guistate.put("button:button_pumpkin", button_pumpkin);
		this.addRenderableWidget(button_pumpkin);
		button_sugar_cane = Button.builder(Component.translatable("gui.power.cultivation_gui.button_sugar_cane"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(13, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 257, this.topPos + 106, 77, 20).build();
		guistate.put("button:button_sugar_cane", button_sugar_cane);
		this.addRenderableWidget(button_sugar_cane);
		button_bamboo = Button.builder(Component.translatable("gui.power.cultivation_gui.button_bamboo"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIButtonMessage(14, x, y, z));
				CultivationGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}).bounds(this.leftPos + 257, this.topPos + 52, 77, 20).build();
		guistate.put("button:button_bamboo", button_bamboo);
		this.addRenderableWidget(button_bamboo);
	}
}
