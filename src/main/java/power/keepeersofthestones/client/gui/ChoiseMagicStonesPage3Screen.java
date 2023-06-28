package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage3Menu;
import power.keepeersofthestones.network.ChoiseMagicStonesPage3ButtonMessage;
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

public class ChoiseMagicStonesPage3Screen extends AbstractContainerScreen<ChoiseMagicStonesPage3Menu> {
	private final static HashMap<String, Object> guistate = ChoiseMagicStonesPage3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_spirit;
	Button button_form;
	Button button_aether;
	Button button_mind;
	Button button_g_dust;
	Button button_blue_flame;
	Button button_empty;
	Button button_smoke;
	Button button_previous_page;

	public ChoiseMagicStonesPage3Screen(ChoiseMagicStonesPage3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stones_page_3.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/blue_flame_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/smoke_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/spirit_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/form_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/golden_dust_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/mind_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/aether_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/darkness_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 87, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, Component.translatable("gui.power.choise_magic_stones_page_3.label_choose_a_stone_to_get_it"), 127, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.power.choise_magic_stones_page_3.label_33"), 10, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_spirit = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_spirit"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(0, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_spirit", button_spirit);
		this.addRenderableWidget(button_spirit);
		button_form = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_form"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(1, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 141, 56, 20).build();
		guistate.put("button:button_form", button_form);
		this.addRenderableWidget(button_form);
		button_aether = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_aether"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(2, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 114, 56, 20).build();
		guistate.put("button:button_aether", button_aether);
		this.addRenderableWidget(button_aether);
		button_mind = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_mind"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(3, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_mind", button_mind);
		this.addRenderableWidget(button_mind);
		button_g_dust = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_g_dust"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(4, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_g_dust", button_g_dust);
		this.addRenderableWidget(button_g_dust);
		button_blue_flame = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_blue_flame"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(5, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 33, 56, 20).build();
		guistate.put("button:button_blue_flame", button_blue_flame);
		this.addRenderableWidget(button_blue_flame);
		button_empty = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_empty"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(6, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 127, this.topPos + 87, 56, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_smoke = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_smoke"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(7, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 37, this.topPos + 60, 56, 20).build();
		guistate.put("button:button_smoke", button_smoke);
		this.addRenderableWidget(button_smoke);
		button_previous_page = Button.builder(Component.translatable("gui.power.choise_magic_stones_page_3.button_previous_page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(8, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 168, 93, 20).build();
		guistate.put("button:button_previous_page", button_previous_page);
		this.addRenderableWidget(button_previous_page);
	}
}
