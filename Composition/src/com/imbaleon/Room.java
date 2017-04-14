package com.imbaleon;

/**
 * Created by Leon on 4/13/17.
 */
public class Room {
    public Light light;
    public Table table;
    public TV tv;

    public Room(Light light, Table table, TV tv) {
        this.light = light;
        this.table = table;
        this.tv = tv;
    }

    public void lightUp(){
       this.light.lightOn();
       drawLightRoom();
    }
    private void drawLightRoom(){
        System.out.println("defapt se apeleaza prin clasa ROOM");
    }

}
