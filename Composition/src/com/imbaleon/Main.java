package com.imbaleon;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(100,50);

        Lamp lamp = new Lamp("Roman",false,99);

        Bed bed = new Bed("WOOD",4,6,8,8);

        Bedroom bedroom = new Bedroom("Patrick",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.getBed().make();
        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
