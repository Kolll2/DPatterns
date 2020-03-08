package com.company.adapter.auto_adapter;

public interface Rechargeable {
    // 11 kVt / hour
    void charge(float order);
    int getBatteryCapacity();
    float getChargeLevel();
}
