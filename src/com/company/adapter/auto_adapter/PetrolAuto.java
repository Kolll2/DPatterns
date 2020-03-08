package com.company.adapter.auto_adapter;

public class PetrolAuto implements Filling {
    int tankVolume;
    float fuelLevel;

    public PetrolAuto(int tankVolume, float fuelLevel) {
        this.tankVolume = tankVolume;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void fill(float order) {
        fuelLevel += order;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }
}
