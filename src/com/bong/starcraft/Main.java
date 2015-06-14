package com.bong.starcraft;


import com.bong.starcraft.building.TerranBuildingTypes;
import com.bong.starcraft.building.produce.Barrack;
import com.bong.starcraft.building.produce.CommandCenter;
import com.bong.starcraft.game.StarcraftGame;
import com.bong.starcraft.game.StarcraftGameHost;
import com.bong.starcraft.game.Tribe;
import com.bong.starcraft.unit.TerranUnitTypes;
import com.bong.starcraft.unit.ground.attackable.Ghost;
import com.bong.starcraft.unit.ground.buildable.SCV;



/**
 * Created by bong on 15. 6. 8.
 */
public class Main {
	public static void main(String[] args) {
		StarcraftGame game = StarcraftGameHost.startNewGame(Tribe.TERRAN);


		SCV testSCV = new SCV(game);
		CommandCenter commandCenter = (CommandCenter) game
				.requestBuilding(TerranBuildingTypes.COMMAND_CENTER, testSCV);

		SCV scv1 = (SCV) commandCenter.produce(TerranUnitTypes.SCV);
		scv1.talk();

		//Barrack barrack =(Barrack) game.requestBuilding(TerranBuildingTypes.BARRACK, scv1);
		//Ghost ghost1 = (Ghost)barrack.produce(TerranUnitTypes.GHOST);

		//ghost1.talk();



		StarcraftGameHost.stopGame(game);
	}
}
