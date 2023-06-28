
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.RocketEntity;
import power.keepeersofthestones.client.model.Modelrocket;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RocketRenderer extends MobRenderer<RocketEntity, Modelrocket<RocketEntity>> {
	public RocketRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrocket(context.bakeLayer(Modelrocket.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RocketEntity entity) {
		return new ResourceLocation("power:textures/entities/rocket_texture.png");
	}
}
