package com.bong.starcraft.unit.ground.healable;


import com.bong.starcraft.unit.Unit;

/**
 * Created by bong on 15. 6. 8.
 */
public class Medic extends AbstractHealableUnit {
    // TODO

    public Medic(){  super(125);   }



    @Override public int getHeal() {
        return 5;
    }



    @Override protected String onTalk() {
        return "Did someone page me?";
    }


}
