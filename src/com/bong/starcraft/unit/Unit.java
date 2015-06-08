package com.bong.starcraft.unit;


import com.bong.starcraft.StarcraftObject;



/**
 * Created by bong on 15. 6. 8.
 */
public interface Unit extends StarcraftObject {
	@Override int requiredMineral();
	@Override int requiredGas();
	@Override int requiredProduceTime();

	@Override public abstract int getMaxHitPoint();
	@Override public abstract int getMinHitPoint();
	@Override public abstract int getRemainingHitPoint();
	@Override public abstract boolean hit(int damage);


	public void talk();
	public void move(int x, int y);

	public void die();
	public boolean isDied();
	public boolean isAlive();
}
