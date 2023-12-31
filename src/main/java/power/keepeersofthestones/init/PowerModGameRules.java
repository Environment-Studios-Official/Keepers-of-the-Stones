
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GETTINGSTONESWHENENTERINGTHEGAME = GameRules.register("gettingStonesWhenEnteringTheGame", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> GETRANDOMSTONE = GameRules.register("getRandomStone", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TURN_OFF_THE_GOLD_DUST_STONE = GameRules.register("turnOffTheGoldDustStone", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
}
