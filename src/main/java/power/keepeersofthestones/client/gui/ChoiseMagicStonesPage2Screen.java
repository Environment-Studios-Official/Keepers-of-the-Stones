package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage2Menu;
import power.keepeersofthestones.network.ChoiseMagicStonesPage2ButtonMessage;
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

public class ChoiseMagicStonesPage2Screen extends AbstractContainerScreen<ChoiseMagicStonesPage2Menu> {
	private final static HashMap<String, Object> guistate = ChoiseMagicStonesPage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_moon;
	Button button_amber;
	Button button_destruct;
	Button button_space;
	Button button_blood;
	Button button_time;
	Button button_techolog;
	Button button_explosion;
	Button button_teleport;
	Button button_creation;
	Button button_mist;
	Button button_sand;
	Button button_speed;
	Button button_previous_page;
	Button button_poison;
	Button button_magnet;
	Button button_mushrooms;
	Button button_mercury;
	Button button_music;
	Button button_plague;
	Button button_gravity;
	Button button_next_page;

	public ChoiseMagicStonesPage2Screen(ChoiseMagicStonesPage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stones_page_2.png");

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

		guiGraphics.blit(new ResourceLocation("power:textures/screens/moon_master.png"), this.leftPos + 19, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/cosmos_master.png"), this.leftPos + 19, this.topPos + 60, 0, 0, -1, -1, -1, -1);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/blood_master.png"), this.leftPos + 19, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/time_master.png"), this.leftPos + 109, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/technology_master.png"), this.leftPos + 109, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/teleportation_master.png"), this.leftPos + 109, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/explosion_master.png"), this.leftPos + 109, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/creation_master.png"), this.leftPos + 19, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/destruction_master.png"), this.leftPos + 19, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/amber_master.png"), this.leftPos + 109, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/space_master.png"), this.leftPos + 19, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/mist_master.png"), this.leftPos + 208, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/sand_master.png"), this.leftPos + 208, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/speed_master.png"), this.leftPos + 208, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/poison_master.png"), this.leftPos + 208, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/magnet_master.png"), this.leftPos + 208, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/mushrooms_master.png"), this.leftPos + 307, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/mercury_master.png"), this.leftPos + 307, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/music_master.png"), this.leftPos + 307, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/plague_master.png"), this.leftPos + 307, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/gravity_master.png"), this.leftPos + 307, this.topPos + 141, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.choise_magic_stones_page_2.label_choose_a_stone_to_get_it"), 127, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.choise_magic_stones_page_2.label_23"), 10, 6, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_moon = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(0, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_moon", button_moon);
		this.addRenderableWidget(button_moon);
		button_amber = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_amber"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(1, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_amber", button_amber);
		this.addRenderableWidget(button_amber);
		button_destruct = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_destruct"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(2, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_destruct", button_destruct);
		this.addRenderableWidget(button_destruct);
		button_space = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_space"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(3, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_space", button_space);
		this.addRenderableWidget(button_space);
		button_blood = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_blood"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(4, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_blood", button_blood);
		this.addRenderableWidget(button_blood);
		button_time = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_time"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(5, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_time", button_time);
		this.addRenderableWidget(button_time);
		button_techolog = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_techolog"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(6, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_techolog", button_techolog);
		this.addRenderableWidget(button_techolog);
		button_explosion = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_explosion"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(7, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_explosion", button_explosion);
		this.addRenderableWidget(button_explosion);
		button_teleport = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_teleport"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(8, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_teleport", button_teleport);
		this.addRenderableWidget(button_teleport);
		button_creation = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_creation"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(9, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_creation", button_creation);
		this.addRenderableWidget(button_creation);
		button_mist = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_mist"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(10, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 226, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_mist", button_mist);
		this.addRenderableWidget(button_mist);
		button_sand = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_sand"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(11, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 226, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_sand", button_sand);
		this.addRenderableWidget(button_sand);
		button_speed = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_speed"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(12, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 226, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_speed", button_speed);
		this.addRenderableWidget(button_speed);
		button_previous_page = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_previous_page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(13, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 168, 93, 20).build();
		guistate.put("button:button_previous_page", button_previous_page);
		this.addRenderableWidget(button_previous_page);
		button_poison = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_poison"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(14, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}).bounds(this.leftPos + 226, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_poison", button_poison);
		this.addRenderableWidget(button_poison);
		button_magnet = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_magnet"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(15, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}).bounds(this.leftPos + 226, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_magnet", button_magnet);
		this.addRenderableWidget(button_magnet);
		button_mushrooms = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_mushrooms"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(16, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_mushrooms", button_mushrooms);
		this.addRenderableWidget(button_mushrooms);
		button_mercury = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_mercury"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(17, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_mercury", button_mercury);
		this.addRenderableWidget(button_mercury);
		button_music = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_music"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(18, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_music", button_music);
		this.addRenderableWidget(button_music);
		button_plague = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_plague"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(19, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_plague", button_plague);
		this.addRenderableWidget(button_plague);
		button_gravity = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_gravity"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(20, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_gravity", button_gravity);
		this.addRenderableWidget(button_gravity);
		button_next_page = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_2.button_next_page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(21, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}).bounds(this.leftPos + 316, this.topPos + 168, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
