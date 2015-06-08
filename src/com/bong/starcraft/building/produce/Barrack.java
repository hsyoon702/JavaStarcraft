package com.bong.starcraft.building.produce;


import com.bong.starcraft.unit.Unit;
import com.bong.starcraft.unit.ground.attackable.Firebat;
import com.bong.starcraft.unit.ground.attackable.Marine;



/**
 * Created by bong on 15. 6. 8.
 */
public class Barrack extends AbstractProducableBuilding<Unit> {
	public static final int MARINE = 1;
	public static final int FIREBAT = 2;



	public Barrack() {
		super(700);
	}



	@Override public int requiredMineral() {
		return 150;
	}



	@Override public int requiredGas() {
		return 0;
	}



	@Override public int requiredProduceTime() {
		return 30;
	}




	@Override public void build() {
		super.build();
	}



	@Override public Unit produce(int unitType, int mineral, int gas, int time) {
		switch (unitType) {
			case MARINE:
				return new Marine();

			case FIREBAT:
				return new Firebat();

			default:
				throw new UnsupportedOperationException();
		}
	}
}
