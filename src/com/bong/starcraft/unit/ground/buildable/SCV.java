package com.bong.starcraft.unit.ground.buildable;


import com.bong.starcraft.game.StarcraftGame;
import com.bong.starcraft.building.Building;
import com.bong.starcraft.building.TerranBuildingTypes;
import com.bong.starcraft.building.produce.Barrack;
import com.bong.starcraft.building.produce.CommandCenter;



/**
 * Created by bong on 15. 6. 8.
 */
public class SCV extends AbstractBuildableUnit<TerranBuildingTypes> {
	public SCV(StarcraftGame gameInstance) {
		super(gameInstance, 100);
	}



	@Override protected String onTalk() {
		return "SCV good to go sir?";
	}



    /*
	public Building Build(TerranBuildingTypes myBuildingTypes){
        switch (myBuildingTypes) {
            case BARRACK:
                return new Barrack();

            default:
                throw new UnsupportedOperationException();
        }
    }
    */

	

	@Override protected Building onBuild(TerranBuildingTypes buildingTypes) {
		switch (buildingTypes) {
			case COMMAND_CENTER:
				return new CommandCenter(getGameInstance());

			case BARRACK:
				return new Barrack(getGameInstance());

			default:
				throw new UnsupportedOperationException();
		}
	}
}
