package com.bong.starcraft.unit.ground.healable;


import com.bong.starcraft.StarcraftObject;
import com.bong.starcraft.unit.AbstractUnit;
import com.bong.starcraft.unit.Unit;



/**
 * Created by ȫ�� on 2015-06-09.
 */
public abstract class AbstractHealableUnit extends AbstractUnit {
	public AbstractHealableUnit(int hitPoint) {
		super(hitPoint);
	}



	/*
	public abstract int getHeal();
	*/

	public abstract int getHeallingFactor();



	public void heal(StarcraftObject obj) {
		if (obj != null) {
			if (!this.equals(obj) &&
					obj.recover(getHeallingFactor())) {
				System.out.println(String.format("'%s' heals '%s'!: +%d (remain: %d)",
						getClass().getSimpleName(), obj.getClass().getSimpleName(),
						getHeallingFactor(), obj.getRemainingHitPoint()));
			}
		}
	}



	/*
	public void healUnit(Unit obj) {
		if (obj != null) {
			if (!this.equals(obj) && obj.isAlive()) {
				System.out.println(String.format("'%s' heals '%s'!: %d", getClass().getSimpleName(), obj.getClass().getSimpleName(), getHeal()));

				heal(getHeal());
			}
		}
	}
	*/



	/*
	public boolean heal(int anti_damage) {
		// If not dead yet
		if (isAlive()) {
			if (mMaxHitPoint != mRemainingHitPoint) {
				mRemainingHitPoint += anti_damage;
				if (mRemainingHitPoint >= mMaxHitPoint)
					mRemainingHitPoint = mMaxHitPoint;
				return true;
			}
		}

		return false;
	}
	*/
}
