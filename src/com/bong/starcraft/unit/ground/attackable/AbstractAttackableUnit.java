package com.bong.starcraft.unit.ground.attackable;


import com.bong.starcraft.StarcraftObject;
import com.bong.starcraft.unit.AbstractUnit;



/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractAttackableUnit extends AbstractUnit {
	public AbstractAttackableUnit(int hitPoint) {
		super(hitPoint);
	}



	@Override public abstract int requiredMineral();
	@Override public abstract int requiredGas();
	@Override public abstract int requiredProduceTime();



	public abstract int getDamage();



	public void attack(StarcraftObject obj) {
		if (obj != null) {
			// Can not damage itself
			if (!this.equals(obj)) {
				System.out.println(String.format("'%s' hits '%s'!: %d",
						getClass().getSimpleName(), obj.getClass().getSimpleName(), getDamage()));

				obj.hit(getDamage());
			}
		}
	}
}
