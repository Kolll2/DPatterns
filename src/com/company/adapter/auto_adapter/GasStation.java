package com.company.adapter.auto_adapter;

public class GasStation {
    public void tuck(Filling vehicle) {
//        order registration
        float order = vehicle.getTankVolume() - vehicle.getFuelLevel();
        System.out.println("Tuck vehicle " + vehicle.getClass().getName());
        vehicle.fill(order);
        System.out.println(vehicle.getClass().getSimpleName() + " is filled on " +
                100*vehicle.getFuelLevel()/vehicle.getTankVolume() + " %");
    }
}
