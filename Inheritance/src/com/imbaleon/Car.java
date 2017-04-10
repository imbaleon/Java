package com.imbaleon;

/**
 * Created by Leon on 4/9/17.
 */
public class Car extends Vehicle {
    private int engine;
    private int seats;

    public Car(int doors, int engine, int seats) {
        super(doors, 4, 4);
        this.engine = engine;
        this.seats = seats;
    }

    public int getEngine() {

        return engine;
    }

    public int getSeats() {
        return seats;
    }
    public void changingGears(String howFast){
        System.out.println("called changing Gears from Car class");
        System.out.println("and the steering is " + howFast);
    }
    public void handSteering(String howGood){
        System.out.println("called handSteering from Car class");
        System.out.println("and the steering is " + howGood);
    }

    @Override
    public void moving(int speed) {
        super.moving(speed);
        System.out.println("and sometimes faster as a normal car");
    }
}
