package com.bong.starcraft.building;

/**
 * Created by È«¼® on 2015-06-09.
 */
public enum TerranBuildingTypes implements BuildingTypes{

    BARRACK(150, 0, 100);



    private final int mRequiredMineral;
    private final int mRequiredGas;
    private final int mRequiredTime;


    TerranBuildingTypes(int requiredMineral, int requiredGas, int requiredTime){

        this.mRequiredMineral = requiredMineral;
        this.mRequiredGas = requiredGas;
        this.mRequiredTime = requiredTime;

    }


    @Override public int getRequiredMineral(){  return  this.mRequiredMineral;   }


    @Override public int getRequiredGas(){  return this.mRequiredGas;    }


    @Override public int getRequiredProduceTime(){  return this.mRequiredTime; }
}
