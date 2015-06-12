package com.bong.starcraft.unit.ground.attackable;


import com.bong.starcraft.game.StarcraftGame;



/**
 * Created by bong on 15. 6. 8.
 */
public class Firebat extends AbstractAttackableUnit {
	public Firebat(StarcraftGame gameInstance) {
		super(gameInstance, 250);
	}



	@Override public int getDamage() {
		return 70;
	}



	@Override protected String onTalk() {
		return "Need a light?";
	}
}
