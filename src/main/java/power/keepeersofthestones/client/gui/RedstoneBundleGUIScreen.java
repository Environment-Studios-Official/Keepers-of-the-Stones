package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.RedstoneBundleGUIMenu;
import power.keepeersofthestones.network.RedstoneBundleGUIButtonMessage;
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

public class RedstoneBundleGUIScreen extends AbstractContainerScreen<RedstoneBundleGUIMenu> {
	private final static HashMap<String, Object> guistate = RedstoneBundleGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_piston;
	Button button_piston_extension;
	Button button_observer;
	Button button_redstone_block;
	Button button_comparator;
	Button button_redstone_lamp;
	Button button_repeater;
	Button button_lever;
	Button button_redstone_torch;
	Button button_hopper;
	Button button_dropper;
	Button button_dispenser;

	public RedstoneBundleGUIScreen(RedstoneBundleGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/redstone_bundle_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.redstone_bundle_gui.label_select_the_mechanism_to_add"), 77, 6, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_piston = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_piston"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(0, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 24, 135, 20).build();
		guistate.put("button:button_piston", button_piston);
		this.addRenderableWidget(button_piston);
		button_piston_extension = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_piston_extension"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(1, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 51, 135, 20).build();
		guistate.put("button:button_piston_extension", button_piston_extension);
		this.addRenderableWidget(button_piston_extension);
		button_observer = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_observer"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(2, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 78, 135, 20).build();
		guistate.put("button:button_observer", button_observer);
		this.addRenderableWidget(button_observer);
		button_redstone_block = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_redstone_block"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(3, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 105, 135, 20).build();
		guistate.put("button:button_redstone_block", button_redstone_block);
		this.addRenderableWidget(button_redstone_block);
		button_comparator = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_comparator"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(4, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 132, 77, 20).build();
		guistate.put("button:button_comparator", button_comparator);
		this.addRenderableWidget(button_comparator);
		button_redstone_lamp = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_redstone_lamp"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(5, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 159, 93, 20).build();
		guistate.put("button:button_redstone_lamp", button_redstone_lamp);
		this.addRenderableWidget(button_redstone_lamp);
		button_repeater = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_repeater"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(6, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 104, this.topPos + 132, 72, 20).build();
		guistate.put("button:button_repeater", button_repeater);
		this.addRenderableWidget(button_repeater);
		button_lever = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_lever"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(7, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 113, this.topPos + 159, 51, 20).build();
		guistate.put("button:button_lever", button_lever);
		this.addRenderableWidget(button_lever);
		button_redstone_torch = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_redstone_torch"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(8, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 167, this.topPos + 159, 98, 20).build();
		guistate.put("button:button_redstone_torch", button_redstone_torch);
		this.addRenderableWidget(button_redstone_torch);
		button_hopper = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_hopper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(9, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 185, this.topPos + 132, 56, 20).build();
		guistate.put("button:button_hopper", button_hopper);
		this.addRenderableWidget(button_hopper);
		button_dropper = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_dropper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(10, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 158, this.topPos + 105, 61, 20).build();
		guistate.put("button:button_dropper", button_dropper);
		this.addRenderableWidget(button_dropper);
		button_dispenser = Button.builder(Component.translatable("gui.power.redstone_bundle_gui.button_dispenser"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(11, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 158, this.topPos + 78, 72, 20).build();
		guistate.put("button:button_dispenser", button_dispenser);
		this.addRenderableWidget(button_dispenser);
	}
}
