package com.bong.starcraft.building;


/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractBuilding implements Building {
	private int mRemainingHitPoint;
	private int mMaxHitPoint;



	public AbstractBuilding(int hitPoint) {
		this.mRemainingHitPoint = hitPoint;
		this.mMaxHitPoint = mRemainingHitPoint;
	}



	@Override public abstract int requiredMineral();
	@Override public abstract int requiredGas();
	@Override public abstract int requiredProduceTime();



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
		// If not destroyed yet
		if (!isDestroyed()) {
			mRemainingHitPoint -= damage;
			if (getRemainingHitPoint() <= 0) destroy();
		}

		return false;
	}



	@Override public void build() {
		System.out.println(String.format("'%s' built!", getClass().getSimpleName()));
	}



	@Override public void destroy() {
		System.out.println(String.format("'%s' destroyed!", getClass().getSimpleName()));
	}



	@Override public boolean isDestroyed() {
		return (getRemainingHitPoint() <= 0);
	}
}
