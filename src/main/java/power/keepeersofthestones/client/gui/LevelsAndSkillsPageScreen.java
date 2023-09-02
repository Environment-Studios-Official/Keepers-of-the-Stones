package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.LevelsAndSkillsPageMenu;
import power.keepeersofthestones.procedures.ReturnReactiveFlyingProcedure;
import power.keepeersofthestones.procedures.ReturnLevel3Procedure;
import power.keepeersofthestones.procedures.ReturnLevel2Procedure;
import power.keepeersofthestones.procedures.ReturnLevel1Procedure;
import power.keepeersofthestones.procedures.NoReturnReactiveFlyingProcedure;
import power.keepeersofthestones.procedures.GetLevel2Procedure;
import power.keepeersofthestones.procedures.GetLevel1Procedure;
import power.keepeersofthestones.network.LevelsAndSkillsPageButtonMessage;
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

public class LevelsAndSkillsPageScreen extends AbstractContainerScreen<LevelsAndSkillsPageMenu> {
	private final static HashMap<String, Object> guistate = LevelsAndSkillsPageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_buy;
	Button button_buy1;
	Button button_buy2;

	public LevelsAndSkillsPageScreen(LevelsAndSkillsPageMenu container, Inventory inventory, Component text) {
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

		if (GetLevel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("power:textures/screens/level_checked.png"), this.leftPos + -71, this.topPos + -56, 0, 0, 19, 18, 19, 18);
		}
		if (ReturnLevel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("power:textures/screens/level_checked.png"), this.leftPos + -69, this.topPos + -24, 0, 0, 19, 18, 19, 18);
		}
		if (GetLevel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("power:textures/screens/level_checked.png"), this.leftPos + -72, this.topPos + -87, 0, 0, 19, 18, 19, 18);
		}

		guiGraphics.blit(new ResourceLocation("power:textures/screens/fire_master.png"), this.leftPos + 46, this.topPos + -71, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/blue_flame_master.png"), this.leftPos + 64, this.topPos + -71, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("power:textures/screens/lightning_master.png"), this.leftPos + 80, this.topPos + -71, 0, 0, 16, 16, 16, 16);

		if (ReturnReactiveFlyingProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("power:textures/screens/level_checked.png"), this.leftPos + 138, this.topPos + -70, 0, 0, 19, 18, 19, 18);
		}

		guiGraphics.blit(new ResourceLocation("power:textures/screens/rain_master.png"), this.leftPos + 94, this.topPos + -71, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.power.levels_and_skills_page.label_level_2"), -163, -48, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.levels_and_skills_page.label_level_3"), -163, -18, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.levels_and_skills_page.label_level_1"), -163, -81, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.levels_and_skills_page.label_reactive_flying"), 25, -81, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.power.levels_and_skills_page.label_for"), 25, -65, -13421773, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.power.levels_and_skills_page.button_empty"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(0, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -180, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.power.levels_and_skills_page.button_empty1"), e -> {
		}).bounds(this.leftPos + 152, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_buy = Button.builder(Component.translatable("gui.power.levels_and_skills_page.button_buy"), e -> {
			if (ReturnLevel1Procedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(2, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -82, this.topPos + -61, 40, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnLevel1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_buy", button_buy);
		this.addRenderableWidget(button_buy);
		button_buy1 = Button.builder(Component.translatable("gui.power.levels_and_skills_page.button_buy1"), e -> {
			if (ReturnLevel2Procedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(3, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -82, this.topPos + -29, 40, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnLevel2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_buy1", button_buy1);
		this.addRenderableWidget(button_buy1);
		button_buy2 = Button.builder(Component.translatable("gui.power.levels_and_skills_page.button_buy2"), e -> {
			if (NoReturnReactiveFlyingProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(4, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 128, this.topPos + -75, 40, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (NoReturnReactiveFlyingProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_buy2", button_buy2);
		this.addRenderableWidget(button_buy2);
	}
}
