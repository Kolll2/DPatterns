package com.company.adapter.auto_adapter;

public class HybridVehicle implements Filling, Rechargeable {
    int tankVolume;
    float fuelLevel;

    int batteryCapacity;
    float chargeLevel;

    public HybridVehicle(int tankVolume, float fuelLevel, int batteryCapacity, float chargeLevel) {
        this.tankVolume = tankVolume;
        this.fuelLevel = fuelLevel;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    @Override
    public void fill(float order) {
        fuelLevel += order;
    }

    @Override
    public int getTankVolume() {
        return tankVolume;
    }

    @Override
    public float getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void charge(float order) {
        chargeLevel += order;
    }

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public float getChargeLevel() {
        return chargeLevel;
    }
}
