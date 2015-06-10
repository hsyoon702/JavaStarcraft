package com.bong.starcraft.unit.ground.buildable;

import com.bong.starcraft.StarcraftObject;
import com.bong.starcraft.building.BuildingTypes;
import com.bong.starcraft.building.TerranBuildingTypes;
import com.bong.starcraft.building.produce.Barrack;
import com.bong.starcraft.unit.AbstractUnit;
import com.bong.starcraft.unit.TerranUnitTypes;

/**
 * Created by È«¼® on 2015-06-09.
 */
public abstract class AbstractBuildableUnit<T> extends AbstractUnit {


    public AbstractBuildableUnit(int hitPoint) {
        super(hitPoint);
    }


}
