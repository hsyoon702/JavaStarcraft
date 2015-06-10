package com.bong.starcraft.unit;


/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractUnit implements Unit {
	private int mRemainingHitPoint;
	private int mMaxHitPoint;



	public AbstractUnit(int hitPoint) {
		this.mRemainingHitPoint = hitPoint;
		this.mMaxHitPoint = mRemainingHitPoint;
	}



	@Override public String toString() {
		return getClass().getSimpleName();
	}



	/**
	 * Max hit point
	 * @return
	 */
	@Override public int getMaxHitPoint() {
		return this.mMaxHitPoint;
	}



	/**
	 * Usually minimal hit point is zero.
	 * @return 0
	 */
	@Override public int getMinHitPoint() {
		return 0;
	}



	@Override public int getRemainingHitPoint() {
		return this.mRemainingHitPoint;
	}



	@Override public boolean hit(int damage) {
		// If not died yet
		if (isAlive()) {
			mRemainingHitPoint -= damage;

			if (getRemainingHitPoint() <= 0) {
				this.die();
				return false;
			}

			return true;
		}

		return false;
	}



	@Override public boolean recover(int amount) {
		// If not dead yet
		if (isAlive()) {
			if (getRemainingHitPoint() < getMaxHitPoint()) {
				mRemainingHitPoint += amount;
				mRemainingHitPoint = Math.min(getMaxHitPoint(), mRemainingHitPoint);
				return true;
			}
		}

		return false;
	}



	@Override public boolean isHealable() {
		return true;
	}



	@Override public void move(int x, int y) {
		System.out.println(String.format("Moved to (%d, %d)", x, y));
	}



	@Override public final void talk() {
		System.out.println(String.format("'%s' says: \"%s\"",
				getClass().getSimpleName(), onTalk()));
	}



	protected String onTalk() {
		return "Who am I?";
	}



	@Override public void die() {
		System.out.println(String.format("'%s' died...", getClass().getSimpleName()));
	}



	@Override public boolean isDied() {
		return (getRemainingHitPoint() <= 0);
	}



	@Override public boolean isAlive() {
		return (!isDied());
	}
}
