package com.bong.starcraft.building.produce;


import com.bong.starcraft.building.AbstractBuilding;
import com.bong.starcraft.unit.TerranUnitTypes;



/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractProducableBuilding<T> extends AbstractBuilding {
	public AbstractProducableBuilding(int hitPoint) {
		super(hitPoint);
	}



	public final T produce(TerranUnitTypes unitTypes) {
		// have enough resources?
		unitTypes.getRequiredMineral();
		unitTypes.getRequiredGas();
		unitTypes.getRequiredProduceTime();

		// TODO: reduce player`s resource


		/*return onProduce(unitTypes);*/

		T unit = onProduce(unitTypes);

		if (unit != null) {
			System.out.println(String.format("'%s' produce '%s'!",
					getClass().getSimpleName(), unit));
		}

		return unit;
	}



	protected abstract T onProduce(TerranUnitTypes unitTypes);
}





