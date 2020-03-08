package com.company.adapter.auto_adapter;

public class ElectricVehicle implements Rechargeable {
    int batteryCapacity;
    float chargeLevel;

    public ElectricVehicle(int batteryCapacity, float chargeLevel) {
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
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
