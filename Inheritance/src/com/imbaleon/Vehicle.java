package com.imbaleon;

/**
 * Created by Leon on 4/9/17.
 */
public class Vehicle {
    private int doors;
    private int wheels;
    private int tires;

    public Vehicle(int doors, int wheels, int tires) {
        this.doors = doors;
        this.wheels = wheels;
        this.tires = tires;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getTires() {
        return tires;
    }

    public void moving (int speed){
        System.out.println("called moving from Vehicle class with speed " + speed);

    }
}
