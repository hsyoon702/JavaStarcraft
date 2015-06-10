package com.bong.starcraft.unit.ground.buildable;


import com.bong.starcraft.building.Building;
import com.bong.starcraft.unit.AbstractUnit;



/**
 * Created by ȫ�� on 2015-06-09.
 */
public abstract class AbstractBuildableUnit<T> extends AbstractUnit {
	public AbstractBuildableUnit(int hitPoint) {
		super(hitPoint);
	}



	public final Building build(T buildingTypes) {
		System.out.println(String.format("'%s' build '%s'!",
				getClass().getSimpleName(), buildingTypes));

		return onBuild(buildingTypes);
	}



	protected abstract Building onBuild(T buildingTypes);
}
