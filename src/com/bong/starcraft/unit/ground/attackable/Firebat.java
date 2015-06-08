package com.bong.starcraft.unit.ground.attackable;


/**
 * Created by bong on 15. 6. 8.
 */
public class Firebat extends AbstractAttackableUnit {
	public Firebat() {
		super(250);
	}



	@Override public int requiredMineral() {
		return 200;
	}



	@Override public int requiredGas() {
		return 50;
	}



	@Override public int requiredProduceTime() {
		return 60;
	}



	@Override public int getDamage() {
		return 70;
	}



	@Override protected String onTalk() {
		return "Need a light?";
	}
}
