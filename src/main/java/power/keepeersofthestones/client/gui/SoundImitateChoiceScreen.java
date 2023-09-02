package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.SoundImitateChoiceMenu;
import power.keepeersofthestones.network.SoundImitateChoiceButtonMessage;
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

public class SoundImitateChoiceScreen extends AbstractContainerScreen<SoundImitateChoiceMenu> {
	private final static HashMap<String, Object> guistate = SoundImitateChoiceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_creeper;
	Button button_zombie;
	Button button_skeleton;

	public SoundImitateChoiceScreen(SoundImitateChoiceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/sound_imitate_choice.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.sound_imitate_choice.label_select_the_mob_for_emitate_sound"), 6, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_creeper = Button.builder(Component.translatable("gui.power.sound_imitate_choice.button_creeper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SoundImitateChoiceButtonMessage(0, x, y, z));
				SoundImitateChoiceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 25, 60, 20).build();
		guistate.put("button:button_creeper", button_creeper);
		this.addRenderableWidget(button_creeper);
		button_zombie = Button.builder(Component.translatable("gui.power.sound_imitate_choice.button_zombie"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SoundImitateChoiceButtonMessage(1, x, y, z));
				SoundImitateChoiceButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 79, 55, 20).build();
		guistate.put("button:button_zombie", button_zombie);
		this.addRenderableWidget(button_zombie);
		button_skeleton = Button.builder(Component.translatable("gui.power.sound_imitate_choice.button_skeleton"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SoundImitateChoiceButtonMessage(2, x, y, z));
				SoundImitateChoiceButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 52, 65, 20).build();
		guistate.put("button:button_skeleton", button_skeleton);
		this.addRenderableWidget(button_skeleton);
	}
}
