package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

            Vehicle[] myArray = new Vehicle[4];

            myArray[0] = new Jeep("Fred's Jeep", 4);
            myArray[1] = new Jeep("Frank's Jeep",4);
            myArray[2] = new Hovercraft("Sue's Hover-craft", 8, 0.0);
            myArray[3] = new Frigate("Money Waster", 0.0);
            myArray[4] = new PoliceCar("Highway Patrol", 4, 200, 4);

        LinkedList<Vehicle> myVehicles = new LinkedList<Vehicle>();
        myVehicles.add(myArray[0]);
        myVehicles.add(myArray[1]);
        myVehicles.add(myArray[2]);
        myVehicles.add(myArray[3]);
        myVehicles.add(myArray[4]);

            for (int i = 0; i < myArray.length; i++) {

                System.out.println(myArray[i].getName());

                if (myArray[i] instanceof LandVehicle) {
                    LandVehicle lv = (LandVehicle) myArray[i];
                    lv.drive();
                }
                if (myArray[i] instanceof Emergency) {
                    Emergency eme = (Emergency) myArray[i];
                    eme.soundSiren();
                }

            }

        System.out.println("List of Vehicles:\n");

        for (int i = 0; i < myVehicles.size(); i++) {

            System.out.println(myVehicles.get(i).getName());

            if (myVehicles.get(i) instanceof LandVehicle) {
                LandVehicle landv = (LandVehicle) myVehicles.get(i);
                landv.drive();
            }

            if (myVehicles.get(i) instanceof Emergency) {
                Emergency eme = (Emergency) myVehicles.get(i);
                eme.soundSiren();
            }
        }
    }
}