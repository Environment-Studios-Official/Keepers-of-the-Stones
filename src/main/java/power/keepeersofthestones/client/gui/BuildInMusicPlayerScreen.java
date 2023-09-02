package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.BuildInMusicPlayerMenu;
import power.keepeersofthestones.network.BuildInMusicPlayerButtonMessage;
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

public class BuildInMusicPlayerScreen extends AbstractContainerScreen<BuildInMusicPlayerMenu> {
	private final static HashMap<String, Object> guistate = BuildInMusicPlayerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_stop;
	Button button_cat;
	Button button_blocks;
	Button button_far;
	Button button_mall;
	Button button_mellohi;
	Button button_chirp;
	Button button_stal;
	Button button_strad;
	Button button_ward;
	Button button_wait;
	Button button_pigstep;
	Button button_otherside;

	public BuildInMusicPlayerScreen(BuildInMusicPlayerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/build_in_music_player.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.build_in_music_player.label_music_player"), 122, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_stop = Button.builder(Component.translatable("gui.power.build_in_music_player.button_stop"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(0, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 239, this.topPos + 7, 46, 20).build();
		guistate.put("button:button_stop", button_stop);
		this.addRenderableWidget(button_stop);
		button_cat = Button.builder(Component.translatable("gui.power.build_in_music_player.button_cat"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(1, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 25, 40, 20).build();
		guistate.put("button:button_cat", button_cat);
		this.addRenderableWidget(button_cat);
		button_blocks = Button.builder(Component.translatable("gui.power.build_in_music_player.button_blocks"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(2, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 25, 56, 20).build();
		guistate.put("button:button_blocks", button_blocks);
		this.addRenderableWidget(button_blocks);
		button_far = Button.builder(Component.translatable("gui.power.build_in_music_player.button_far"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(3, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 25, 40, 20).build();
		guistate.put("button:button_far", button_far);
		this.addRenderableWidget(button_far);
		button_mall = Button.builder(Component.translatable("gui.power.build_in_music_player.button_mall"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(4, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 52, 46, 20).build();
		guistate.put("button:button_mall", button_mall);
		this.addRenderableWidget(button_mall);
		button_mellohi = Button.builder(Component.translatable("gui.power.build_in_music_player.button_mellohi"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(5, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 52, 61, 20).build();
		guistate.put("button:button_mellohi", button_mellohi);
		this.addRenderableWidget(button_mellohi);
		button_chirp = Button.builder(Component.translatable("gui.power.build_in_music_player.button_chirp"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(6, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 140, this.topPos + 52, 51, 20).build();
		guistate.put("button:button_chirp", button_chirp);
		this.addRenderableWidget(button_chirp);
		button_stal = Button.builder(Component.translatable("gui.power.build_in_music_player.button_stal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(7, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 194, this.topPos + 52, 46, 20).build();
		guistate.put("button:button_stal", button_stal);
		this.addRenderableWidget(button_stal);
		button_strad = Button.builder(Component.translatable("gui.power.build_in_music_player.button_strad"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(8, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 79, 51, 20).build();
		guistate.put("button:button_strad", button_strad);
		this.addRenderableWidget(button_strad);
		button_ward = Button.builder(Component.translatable("gui.power.build_in_music_player.button_ward"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(9, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 79, 46, 20).build();
		guistate.put("button:button_ward", button_ward);
		this.addRenderableWidget(button_ward);
		button_wait = Button.builder(Component.translatable("gui.power.build_in_music_player.button_wait"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(10, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 79, 46, 20).build();
		guistate.put("button:button_wait", button_wait);
		this.addRenderableWidget(button_wait);
		button_pigstep = Button.builder(Component.translatable("gui.power.build_in_music_player.button_pigstep"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(11, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 185, this.topPos + 79, 61, 20).build();
		guistate.put("button:button_pigstep", button_pigstep);
		this.addRenderableWidget(button_pigstep);
		button_otherside = Button.builder(Component.translatable("gui.power.build_in_music_player.button_otherside"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildInMusicPlayerButtonMessage(12, x, y, z));
				BuildInMusicPlayerButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 106, 72, 20).build();
		guistate.put("button:button_otherside", button_otherside);
		this.addRenderableWidget(button_otherside);
	}
}
