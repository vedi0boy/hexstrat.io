package net.hollowbit.strategygame.units;

import net.hollowbit.strategygame.StrategyGame;
import net.hollowbit.strategygame.gamecomponents.Player;
import net.hollowbit.strategygame.world.Hex;
import net.hollowbit.strategygame.world.World;
import net.hollowbit.strategygame.gamecomponents.*;
import net.hollowbit.strategygame.gamecomponents.turntypes.*;

public class Archer extends Unit {

	private static final int HEALTH = 4;
	
	public Archer (World world, Player player, Hex hex) {
		super(world, player, hex, StrategyGame.getGame().getAssetManager().getTexture("archer"), StrategyGame.getGame().getAssetManager().getTexture("archer-overlay"), HEALTH);
		this.defaultTurnType = new MoveAttackTurnType(this);
		this.turnTypes = new TurnType[]{new HealTurnType(this), new DoNothingTurnType(this)};
	}
	
	@Override
	public int getAttackRange() {
		return 2;
	}
	
}
