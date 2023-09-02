package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.EBEarthMenu;
import power.keepeersofthestones.network.EBEarthButtonMessage;
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

public class EBEarthScreen extends AbstractContainerScreen<EBEarthMenu> {
	private final static HashMap<String, Object> guistate = EBEarthMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public EBEarthScreen(EBEarthMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
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

		guiGraphics.blit(new ResourceLocation("power:textures/screens/book_of_elements_book.png"), this.leftPos + -244, this.topPos + -127, 0, 0, 512, 256, 512, 256);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/earth_stone.png"), this.leftPos + -104, this.topPos + -109, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/earth_master.png"), this.leftPos + 93, this.topPos + -109, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/earth_element.png"), this.leftPos + 71, this.topPos + -85, 0, 0, 61, 128, 61, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.eb_earth.label_class_basic"), -162, -85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.eb_earth.label_element_earth"), -162, -67, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.eb_earth.label_force_resistance"), -162, -49, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.power.eb_earth.button_empty"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new EBEarthButtonMessage(0, x, y, z));
				EBEarthButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
