package com.imbaleon;

public class Main {

    public static void main(String[] args) {


        Light light = new Light("strong");

        Table table = new Table(new Dimensions(20,40),"white");

        Dimensions dimensions = new Dimensions(200,100);
        TV tv = new TV(dimensions,"black",200);

        Room room = new Room(light,table,tv);
        room.light.lightOn();
        room.lightUp();

        String lightDensity = room.light.getDensity();
        System.out.println("The light is " + lightDensity);



    }
}
