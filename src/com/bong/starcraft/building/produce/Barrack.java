package com.bong.starcraft.building.produce;


import com.bong.starcraft.unit.TerranUnitTypes;
import com.bong.starcraft.unit.Unit;
import com.bong.starcraft.unit.ground.attackable.Firebat;
import com.bong.starcraft.unit.ground.attackable.Marine;



/**
 * Created by bong on 15. 6. 8.
 */
public class Barrack extends AbstractProducableBuilding<Unit> {
	public Barrack() {
		super(700);
	}



	@Override public void build() {
		super.build();
	}



	@Override protected Unit onProduce(TerranUnitTypes unitTypes) {
		switch (unitTypes) {
			case MARINE:
				TerranUnitTypes.MARINE.getRequiredMineral();
				return new Marine();

			case FIREBAT:
				return new Firebat();

			default:
				throw new UnsupportedOperationException();
		}
	}
}
