package com.bong.starcraft.unit.ground.buildable;


import com.bong.starcraft.building.Building;
import com.bong.starcraft.building.TerranBuildingTypes;
import com.bong.starcraft.building.produce.Barrack;
import com.bong.starcraft.unit.TerranUnitTypes;
import com.bong.starcraft.unit.Unit;
import com.bong.starcraft.unit.ground.attackable.Firebat;
import com.bong.starcraft.unit.ground.attackable.Marine;
import com.bong.starcraft.unit.ground.healable.Medic;

/**
 * Created by bong on 15. 6. 8.
 */
public class SCV extends AbstractBuildableUnit<Building>{
    // TODO
    public SCV(){  super(100);   }


    @Override protected String onTalk() {
        return "SCV good to go sir?";
    }



    public Building Build(TerranBuildingTypes myBuildingTypes){
        switch (myBuildingTypes) {
            case BARRACK:
                return new Barrack();

            default:
                throw new UnsupportedOperationException();
        }
    }
}
