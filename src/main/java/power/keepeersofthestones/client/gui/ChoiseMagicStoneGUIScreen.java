package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.network.ChoiseMagicStoneGUIButtonMessage;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ChoiseMagicStoneGUIScreen extends AbstractContainerScreen<ChoiseMagicStoneGUIMenu> {
	private final static HashMap<String, Object> guistate = ChoiseMagicStoneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fire;
	Button button_air;
	Button button_water;
	Button button_earth;
	Button button_energy;
	Button button_ice;
	Button button_lightning;
	Button button_sound;
	Button button_crystal;
	Button button_lava;
	Button button_rain;
	Button button_ocean;
	Button button_greenery;
	Button button_tornado;
	Button button_next_page;
	Button button_animals;
	Button button_metal;
	Button button_light;
	Button button_shadow;
	Button button_vacuum;
	Button button_sun;
	Button button_without_stone;
	Button button_random;

	public ChoiseMagicStoneGUIScreen(ChoiseMagicStoneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stone_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/fire_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/air_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/water_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/earth_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/energy_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/ice_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/lightning_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/sound_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/crystal_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/lava_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/rain_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/ocean_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/greenery_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/tornado_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/animals_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/metal_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/light_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/shadow_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/vacuum_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/sun_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 141, 0, 0, 16, 16, 16, 16);

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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.power.choise_magic_stone_gui.label_choose_a_stone_to_get_it"), 127, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.power.choise_magic_stone_gui.label_13"), 10, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_fire = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_fire"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(0, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_fire", button_fire);
		this.addRenderableWidget(button_fire);
		button_air = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_air"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(1, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_air", button_air);
		this.addRenderableWidget(button_air);
		button_water = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_water"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(2, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_water", button_water);
		this.addRenderableWidget(button_water);
		button_earth = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(3, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_earth", button_earth);
		this.addRenderableWidget(button_earth);
		button_energy = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_energy"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(4, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_energy", button_energy);
		this.addRenderableWidget(button_energy);
		button_ice = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_ice"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(5, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_ice", button_ice);
		this.addRenderableWidget(button_ice);
		button_lightning = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_lightning"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(6, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_lightning", button_lightning);
		this.addRenderableWidget(button_lightning);
		button_sound = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_sound"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(7, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_sound", button_sound);
		this.addRenderableWidget(button_sound);
		button_crystal = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_crystal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(8, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_crystal", button_crystal);
		this.addRenderableWidget(button_crystal);
		button_lava = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_lava"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(9, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_lava", button_lava);
		this.addRenderableWidget(button_lava);
		button_rain = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_rain"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(10, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 235, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_rain", button_rain);
		this.addRenderableWidget(button_rain);
		button_ocean = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_ocean"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(11, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 235, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_ocean", button_ocean);
		this.addRenderableWidget(button_ocean);
		button_greenery = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_greenery"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(12, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 235, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_greenery", button_greenery);
		this.addRenderableWidget(button_greenery);
		button_tornado = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_tornado"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(13, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 235, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_tornado", button_tornado);
		this.addRenderableWidget(button_tornado);
		button_next_page = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_next_page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(14, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}).bounds(this.leftPos + 316, this.topPos + 168, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
		button_animals = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_animals"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(15, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}).bounds(this.leftPos + 235, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_animals", button_animals);
		this.addRenderableWidget(button_animals);
		button_metal = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_metal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(16, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_metal", button_metal);
		this.addRenderableWidget(button_metal);
		button_light = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_light"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(17, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_light", button_light);
		this.addRenderableWidget(button_light);
		button_shadow = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_shadow"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(18, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_shadow", button_shadow);
		this.addRenderableWidget(button_shadow);
		button_vacuum = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_vacuum"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(19, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_vacuum", button_vacuum);
		this.addRenderableWidget(button_vacuum);
		button_sun = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_sun"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(20, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}).bounds(this.leftPos + 325, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_sun", button_sun);
		this.addRenderableWidget(button_sun);
		button_without_stone = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_without_stone"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(21, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}).bounds(this.leftPos + 208, this.topPos + 168, 93, 20).build();
		guistate.put("button:button_without_stone", button_without_stone);
		this.addRenderableWidget(button_without_stone);
		button_random = Button.builder(Component.translatable("gui.power.choise_magic_stone_gui.button_random"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(22, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		}).bounds(this.leftPos + 136, this.topPos + 168, 56, 20).build();
		guistate.put("button:button_random", button_random);
		this.addRenderableWidget(button_random);
	}
}
