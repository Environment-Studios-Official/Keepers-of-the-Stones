package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.EBAetherMenu;
import power.keepeersofthestones.network.EBAetherButtonMessage;
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

public class EBAetherScreen extends AbstractContainerScreen<EBAetherMenu> {
	private final static HashMap<String, Object> guistate = EBAetherMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public EBAetherScreen(EBAetherMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("power:textures/screens/book_of_elements_book.png"), this.leftPos + -245, this.topPos + -127, 0, 0, 512, 256, 512, 256);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/aether_stone.png"), this.leftPos + -105, this.topPos + -109, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/aether_master.png"), this.leftPos + 93, this.topPos + -109, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/aether_element.png"), this.leftPos + 71, this.topPos + -85, 0, 0, 53, 128, 53, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.eb_aether.label_class_basic"), -163, -85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.eb_aether.label_element_aether"), -163, -67, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.eb_aether.label_force_quintessence"), -163, -49, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.power.eb_aether.button_empty"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new EBAetherButtonMessage(0, x, y, z));
				EBAetherButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
