
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.GlowEntity;
import power.keepeersofthestones.client.model.Modelglow;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GlowRenderer extends MobRenderer<GlowEntity, Modelglow<GlowEntity>> {
	public GlowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglow(context.bakeLayer(Modelglow.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GlowEntity, Modelglow<GlowEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("power:textures/entities/glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GlowEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowEntity entity) {
		return new ResourceLocation("power:textures/entities/glow.png");
	}
}
