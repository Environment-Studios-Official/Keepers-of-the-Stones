package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.RocketPathGUIMenu;
import power.keepeersofthestones.network.RocketPathGUIButtonMessage;
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

public class RocketPathGUIScreen extends AbstractContainerScreen<RocketPathGUIMenu> {
	private final static HashMap<String, Object> guistate = RocketPathGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_moon;
	Button button_mars;
	Button button_venus;
	Button button_enceladus;
	Button button_back_to_earth;

	public RocketPathGUIScreen(RocketPathGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/rocket_path_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.power.rocket_path_gui.label_choose_where_to_fly"), 95, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_moon = Button.builder(Component.translatable("gui.power.rocket_path_gui.button_moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RocketPathGUIButtonMessage(0, x, y, z));
				RocketPathGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 24, 46, 20).build();
		guistate.put("button:button_moon", button_moon);
		this.addRenderableWidget(button_moon);
		button_mars = Button.builder(Component.translatable("gui.power.rocket_path_gui.button_mars"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RocketPathGUIButtonMessage(1, x, y, z));
				RocketPathGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 60, 46, 20).build();
		guistate.put("button:button_mars", button_mars);
		this.addRenderableWidget(button_mars);
		button_venus = Button.builder(Component.translatable("gui.power.rocket_path_gui.button_venus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RocketPathGUIButtonMessage(2, x, y, z));
				RocketPathGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 96, 51, 20).build();
		guistate.put("button:button_venus", button_venus);
		this.addRenderableWidget(button_venus);
		button_enceladus = Button.builder(Component.translatable("gui.power.rocket_path_gui.button_enceladus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RocketPathGUIButtonMessage(3, x, y, z));
				RocketPathGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 32, this.topPos + 132, 72, 20).build();
		guistate.put("button:button_enceladus", button_enceladus);
		this.addRenderableWidget(button_enceladus);
		button_back_to_earth = Button.builder(Component.translatable("gui.power.rocket_path_gui.button_back_to_earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RocketPathGUIButtonMessage(4, x, y, z));
				RocketPathGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 194, this.topPos + 168, 92, 20).build();
		guistate.put("button:button_back_to_earth", button_back_to_earth);
		this.addRenderableWidget(button_back_to_earth);
	}
}
