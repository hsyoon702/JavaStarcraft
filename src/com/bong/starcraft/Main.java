package com.bong.starcraft;


import com.bong.starcraft.building.produce.Barrack;
import com.bong.starcraft.unit.TerranUnitTypes;
import com.bong.starcraft.unit.ground.attackable.Firebat;
import com.bong.starcraft.unit.ground.attackable.Marine;



/**
 * Created by bong on 15. 6. 8.
 */
public class Main {
	public static void main(String[] args) {
		Barrack barrack = new Barrack();
		barrack.build();

		Marine marine1 = (Marine) barrack.produce(TerranUnitTypes.MARINE);
		marine1.talk();
//		marine1.move(1, 2);
//		marine1.die();

		Firebat firebat1 = (Firebat) barrack.produce(TerranUnitTypes.FIREBAT);
		firebat1.talk();
//		firebat1.move(3, 4);
//		firebat1.die();


		while (firebat1.isAlive()) {
			marine1.attack(firebat1);
		}

		barrack.destroy();
	}
}
