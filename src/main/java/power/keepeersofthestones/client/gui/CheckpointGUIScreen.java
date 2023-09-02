package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.CheckpointGUIMenu;
import power.keepeersofthestones.network.CheckpointGUIButtonMessage;
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

public class CheckpointGUIScreen extends AbstractContainerScreen<CheckpointGUIMenu> {
	private final static HashMap<String, Object> guistate = CheckpointGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_checkpoint;
	Button button_set_checkpoint;
	Button button_return_to_the_past;
	Button button_return_to_the_present;

	public CheckpointGUIScreen(CheckpointGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/checkpoint_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.checkpoint_gui.label_returning_to_the_last_point"), 15, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.checkpoint_gui.label_time_travel"), 60, 79, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_checkpoint = Button.builder(Component.translatable("gui.power.checkpoint_gui.button_checkpoint"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(0, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 24, this.topPos + 25, 126, 20).build();
		guistate.put("button:button_checkpoint", button_checkpoint);
		this.addRenderableWidget(button_checkpoint);
		button_set_checkpoint = Button.builder(Component.translatable("gui.power.checkpoint_gui.button_set_checkpoint"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(1, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 24, this.topPos + 52, 126, 20).build();
		guistate.put("button:button_set_checkpoint", button_set_checkpoint);
		this.addRenderableWidget(button_set_checkpoint);
		button_return_to_the_past = Button.builder(Component.translatable("gui.power.checkpoint_gui.button_return_to_the_past"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(2, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 24, this.topPos + 97, 126, 20).build();
		guistate.put("button:button_return_to_the_past", button_return_to_the_past);
		this.addRenderableWidget(button_return_to_the_past);
		button_return_to_the_present = Button.builder(Component.translatable("gui.power.checkpoint_gui.button_return_to_the_present"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(3, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 24, this.topPos + 124, 134, 20).build();
		guistate.put("button:button_return_to_the_present", button_return_to_the_present);
		this.addRenderableWidget(button_return_to_the_present);
	}
}
