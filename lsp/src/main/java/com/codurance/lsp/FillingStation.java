package com.codurance.lsp;

public class FillingStation {

    public void refuel(PetrolCar vehicle) {
            vehicle.fillUpWithFuel();

    }

    public void charge(ElectricCar vehicle) {

            vehicle.chargeBattery();

    }
}
