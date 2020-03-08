package com.company.adapter.auto_adapter;

public class Main {
    public static void main(String[] args) {
//        Create Vehicles
        PetrolAuto petrolAuto = new PetrolAuto(100, 50);
        HybridVehicle hybridVehicle = new HybridVehicle(70, 40, 60, 35);
        ElectricVehicle electricVehicle = new ElectricVehicle(100,20);

//        Create Gas Station
        GasStation gasStation = new GasStation();

//        Try to fill
        gasStation.tuck(petrolAuto); // Petrol car = all ok;
        RechargeableAdapter rechargeableAdapter = new RechargeableAdapter(hybridVehicle);
        gasStation.tuck(rechargeableAdapter); // Hybrid car = only the tank is filled , the battery is not charged
       rechargeableAdapter = new RechargeableAdapter(electricVehicle);
        gasStation.tuck(rechargeableAdapter); // compilation error, because the electric car does not have the necessary interface


    }
}
