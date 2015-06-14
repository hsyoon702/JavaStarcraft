package com.bong.starcraft.building.produce;

import com.bong.starcraft.unit.TerranUnitTypes;
import com.bong.starcraft.unit.Unit;
import com.bong.starcraft.unit.ground.attackable.Firebat;
import com.bong.starcraft.unit.ground.attackable.Marine;
import com.bong.starcraft.unit.ground.buildable.SCV;
import com.bong.starcraft.unit.ground.healable.Medic;

/**
 * Created by È«¼® on 2015-06-10.
 */
public class CommandCenter extends AbstractProducableBuilding<Unit> {

    public CommandCenter(){ super(400); }

    @Override public void build() {
        super.build();
    }


    @Override protected Unit onProduce(TerranUnitTypes unitTypes) {
        switch (unitTypes) {
            case SCV:
                return new SCV();
            default:
                throw new UnsupportedOperationException();
        }
    }

}
