package com.bong.starcraft.unit.ground.attackable;


/**
 * Created by bong on 15. 6. 8.
 */
public class Marine extends AbstractAttackableUnit {
	public Marine() {
		super(150);
	}



	@Override public int getDamage() {
		return 20;
	}



	@Override protected String onTalk() {
		return "Go go go!";
	}
}
