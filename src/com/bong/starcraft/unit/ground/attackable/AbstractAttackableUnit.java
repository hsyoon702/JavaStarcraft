package com.bong.starcraft.unit.ground.attackable;


import com.bong.starcraft.game.StarcraftGame;
import com.bong.starcraft.StarcraftObject;
import com.bong.starcraft.unit.AbstractUnit;



/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractAttackableUnit extends AbstractUnit {
	public AbstractAttackableUnit(StarcraftGame gameInstance, int hitPoint) {
		super(gameInstance, hitPoint);
	}



	public abstract int getDamage();



	public void attack(StarcraftObject obj) {
		if (obj != null) {
			// Can not damage itself
			if (!this.equals(obj) &&
					obj.hit(getDamage())) {
				System.out.println(String.format("'%s' hits '%s'!: -%d (remain: %d)",
						getClass().getSimpleName(), obj.getClass().getSimpleName(),
						getDamage(), obj.getRemainingHitPoint()));
			}
		}
	}
}
