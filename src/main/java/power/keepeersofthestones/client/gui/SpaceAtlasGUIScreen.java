package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.SpaceAtlasGUIMenu;
import power.keepeersofthestones.network.SpaceAtlasGUIButtonMessage;
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

public class SpaceAtlasGUIScreen extends AbstractContainerScreen<SpaceAtlasGUIMenu> {
	private final static HashMap<String, Object> guistate = SpaceAtlasGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_moon;
	Button button_earth;
	Button button_mars;
	Button button_venus;
	Button button_enceladus;

	public SpaceAtlasGUIScreen(SpaceAtlasGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 512;
		this.imageHeight = 512;
	}

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

		guiGraphics.blit(new ResourceLocation("power:textures/screens/space_atlas.png"), this.leftPos + 11, this.topPos + 130, 0, 0, 512, 256, 512, 256);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.space_atlas_gui.label_atlas_of_space_travel"), 99, 153, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_moon = Button.builder(Component.translatable("gui.power.space_atlas_gui.button_moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(0, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 84, this.topPos + 198, 46, 20).build();
		guistate.put("button:button_moon", button_moon);
		this.addRenderableWidget(button_moon);
		button_earth = Button.builder(Component.translatable("gui.power.space_atlas_gui.button_earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(1, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 84, this.topPos + 171, 51, 20).build();
		guistate.put("button:button_earth", button_earth);
		this.addRenderableWidget(button_earth);
		button_mars = Button.builder(Component.translatable("gui.power.space_atlas_gui.button_mars"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(2, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 84, this.topPos + 225, 46, 20).build();
		guistate.put("button:button_mars", button_mars);
		this.addRenderableWidget(button_mars);
		button_venus = Button.builder(Component.translatable("gui.power.space_atlas_gui.button_venus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(3, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 84, this.topPos + 252, 51, 20).build();
		guistate.put("button:button_venus", button_venus);
		this.addRenderableWidget(button_venus);
		button_enceladus = Button.builder(Component.translatable("gui.power.space_atlas_gui.button_enceladus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(4, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 84, this.topPos + 276, 72, 20).build();
		guistate.put("button:button_enceladus", button_enceladus);
		this.addRenderableWidget(button_enceladus);
	}
}
