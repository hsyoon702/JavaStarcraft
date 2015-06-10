package com.bong.starcraft;


import com.bong.starcraft.building.TerranBuildingTypes;
import com.bong.starcraft.building.produce.Barrack;
import com.bong.starcraft.building.produce.CommandCenter;
import com.bong.starcraft.unit.TerranUnitTypes;
import com.bong.starcraft.unit.ground.attackable.Firebat;
import com.bong.starcraft.unit.ground.attackable.Marine;
import com.bong.starcraft.unit.ground.buildable.SCV;
import com.bong.starcraft.unit.ground.healable.Medic;


/**
 * Created by bong on 15. 6. 8.
 */
public class Main {
	public static void main(String[] args) {
		CommandCenter commandCenter1 = new CommandCenter();
		commandCenter1.build();



//		SCV scv1 = (SCV) commandCenter1.produce(TerranUnitTypes.SCV);
//		scv1.talk();
//
//
//
//		/*Barrack barrack = (Barrack)scv1.Build(TerranBuildingTypes.BARRACK);*/
//		Barrack barrack = (Barrack) scv1.build(TerranBuildingTypes.BARRACK);
//		barrack.build();
//
//
//		Marine marine1 = (Marine) barrack.produce(TerranUnitTypes.MARINE);
//		marine1.talk();
//
//		Firebat firebat1 = (Firebat) barrack.produce(TerranUnitTypes.FIREBAT);
//		firebat1.talk();
//
//
//		Medic medic1 = (Medic) barrack.produce(TerranUnitTypes.MEDIC);
//		medic1.talk();
//
//
//		while (firebat1.isAlive()) {
//			marine1.attack(firebat1);
//			/*medic1.healUnit(firebat1);*/
//			medic1.heal(firebat1);
//		}
//
//		barrack.destroy();
//		commandCenter1.destroy();
	}
}
