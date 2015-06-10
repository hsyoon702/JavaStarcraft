package com.bong.starcraft.building;


import com.bong.starcraft.StarcraftObject;



/**
 * Created by bong on 15. 6. 8.
 */
public interface Building extends StarcraftObject {
	public void build();
	public void destroy();
	public boolean isDestroyed();



	/**
	 * Retrieve whether is built complete or not.
	 * @return
	 */
	public boolean isBuiltComplete();

	/**
	 * Retrieve current build process factor.
	 * 1.0 is complete.
	 * @return
	 */
	public float getBuildProcessFactor();
}
