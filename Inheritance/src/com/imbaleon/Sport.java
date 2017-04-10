package com.imbaleon;

/**
 * Created by Leon on 4/9/17.
 */
public class Sport extends Car {
    private int sportTires;
    private int sportWheels;

    public Sport(int doors, int engine, int seats, int sportTires, int sportWheels) {
        super(doors, engine, seats);
        this.sportTires = sportTires;
        this.sportWheels = sportWheels;
    }

    public int getSportTires() {
        return sportTires;
    }

    public int getSportWheels() {
        return sportWheels;
    }

    private void racing(){
        System.out.println("called racing from Sport Class");
        System.out.println("Racing mode is enabled");
    }


    @Override
    public void moving(int speed) {
        super.moving(speed*2);
        System.out.println("and called from sport class so speed speed is doubled");
    }
}
