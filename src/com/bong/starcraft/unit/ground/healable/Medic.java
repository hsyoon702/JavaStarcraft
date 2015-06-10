package com.bong.starcraft.unit.ground.healable;


/**
 * Created by bong on 15. 6. 8.
 */
public class Medic extends AbstractHealableUnit {
	public Medic() {
		super(125);
	}



	@Override public int getHeallingFactor() {
		return 5;
	}



	@Override protected String onTalk() {
		return "Did someone page me?";
	}
}
