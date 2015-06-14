package com.bong.starcraft;


/**
 * Created by bong on 15. 6. 8.
 */
public interface StarcraftObject {
	public int getMaxHitPoint();
	public int getMinHitPoint();

	/**
	 * Retrieve remaining HP(hit point) of this unit
	 * @return remaining hit point
	 */
	public int getRemainingHitPoint();
	public boolean hit(int demage);
}
