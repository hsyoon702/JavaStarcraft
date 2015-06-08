package com.bong.starcraft.building.produce;


import com.bong.starcraft.building.AbstractBuilding;



/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractProducableBuilding<T> extends AbstractBuilding {
	public AbstractProducableBuilding(int hitPoint) {
		super(hitPoint);
	}



	public abstract T produce(int unitType, int mineral, int gas, int time);
}
