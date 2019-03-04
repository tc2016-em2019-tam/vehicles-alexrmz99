package com.company;

import java.sql.SQLOutput;

public class Jeep extends Vehicle implements LandVehicle {
    private int numWheels;                // PROPIEDAD

    public Jeep(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public Jeep(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }


    @Override                       //implementar valores faltantes de landvehicle
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;

    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method!");
    }

    public void soundHorn() {
        System.out.println("Meep, meep!");
    }
}
