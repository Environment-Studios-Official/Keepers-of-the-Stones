package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.CheckPointTPMenu;
import power.keepeersofthestones.network.CheckPointTPButtonMessage;
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

public class CheckPointTPScreen extends AbstractContainerScreen<CheckPointTPMenu> {
	private final static HashMap<String, Object> guistate = CheckPointTPMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_11;
	Button button_21;
	Button button_31;

	public CheckPointTPScreen(CheckPointTPMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/check_point_tp.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.check_point_tp.label_returning_to_the_last_point"), 15, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.check_point_tp.label_checkpoints"), 15, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.check_point_tp.label_set_checkpoint"), 15, 79, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_1 = Button.builder(Component.translatable("gui.power.check_point_tp.button_1"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckPointTPButtonMessage(0, x, y, z));
				CheckPointTPButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 43, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.power.check_point_tp.button_2"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckPointTPButtonMessage(1, x, y, z));
				CheckPointTPButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 43, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.power.check_point_tp.button_3"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckPointTPButtonMessage(2, x, y, z));
				CheckPointTPButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 43, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_11 = Button.builder(Component.translatable("gui.power.check_point_tp.button_11"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckPointTPButtonMessage(3, x, y, z));
				CheckPointTPButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 97, 30, 20).build();
		guistate.put("button:button_11", button_11);
		this.addRenderableWidget(button_11);
		button_21 = Button.builder(Component.translatable("gui.power.check_point_tp.button_21"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckPointTPButtonMessage(4, x, y, z));
				CheckPointTPButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 97, 30, 20).build();
		guistate.put("button:button_21", button_21);
		this.addRenderableWidget(button_21);
		button_31 = Button.builder(Component.translatable("gui.power.check_point_tp.button_31"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckPointTPButtonMessage(5, x, y, z));
				CheckPointTPButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 97, 30, 20).build();
		guistate.put("button:button_31", button_31);
		this.addRenderableWidget(button_31);
	}
}
