package com.company;

public class PoliceCar extends Vehicle implements LandVehicle, Emergency {
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Weouuu, weouuu!");

    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }


    @Override
    public void drive() {
        System.out.println("Calling drive() method");
    }

    public void arrestedMan() {
        System.out.println("There is a criminal inside.");
    }
    
}
