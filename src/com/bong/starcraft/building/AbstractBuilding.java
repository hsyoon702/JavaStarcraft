package com.bong.starcraft.building;


/**
 * Created by bong on 15. 6. 8.
 */
public abstract class AbstractBuilding implements Building {
	private int mRemainingHitPoint;
	private int mMaxHitPoint;
	private boolean mIsBuiltComplete;



	public AbstractBuilding(int hitPoint) {
		this.mRemainingHitPoint = hitPoint;
		this.mMaxHitPoint = mRemainingHitPoint;
	}



	/**
	 * Max hit point
	 *
	 * @return
	 */
	@Override public int getMaxHitPoint() {
		return this.mMaxHitPoint;
	}



	/**
	 * Usually minimal hit point is zero.
	 *
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
			if (getRemainingHitPoint() <= 0)
				destroy();
		}

		return false;
	}



	@Override public boolean recover(int amount) {
		// If not dead yet
		if (!isDestroyed()) {
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



	@Override public void build() {
		/*System.out.println(String.format("'%s' built!", getClass().getSimpleName()));*/

		Thread buildThread = new Thread(new Runnable() {
			@Override public void run() {
				// current time (milliseconds)
				final long time1 = System.currentTimeMillis();

				while ((System.currentTimeMillis() - time1) <
						TerranBuildingTypes.COMMAND_CENTER.getRequiredProduceTime() * 1000) {
					System.out.print(".");
					try { Thread.sleep(1000); } catch (InterruptedException e) {}
				}

				System.out.println();

				// Complete
				mIsBuiltComplete = true;

				System.out.println(String.format("'%s' built!", getClass().getSimpleName()));
			}
		});

		buildThread.start();
	}



	@Override public boolean isBuiltComplete() {
		return this.mIsBuiltComplete;
	}



	@Override public float getBuildProcessFactor() {
		return 0;
	}



	@Override public void destroy() {
		System.out.println(String.format("'%s' destroyed!", getClass().getSimpleName()));
	}



	@Override public boolean isDestroyed() {
		return (getRemainingHitPoint() <= 0);
	}
}













