package com.company.adapter.auto_adapter;

public class RechargeableAdapter implements Filling {
    Rechargeable electricVehicle;

    public RechargeableAdapter(Rechargeable electricVehicle) {
        this.electricVehicle = electricVehicle;
    }

    @Override
    public void fill(float order) {
        electricVehicle.charge(order);
        System.out.println("    " + order / 22 + " hours");
        if (electricVehicle instanceof Filling){
            Filling filling = (Filling) electricVehicle;
            filling.fill(order);
        }
    }

    @Override
    public int getTankVolume() {
        return electricVehicle.getBatteryCapacity();
    }

    @Override
    public float getFuelLevel() {
        return electricVehicle.getChargeLevel();
    }
}
