package com.imbaleon;

/**
 * Created by Leon on 4/13/17.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style,boolean battery,int globeRating){
        this.style=style;
        this.battery=battery;
        this.globeRating=globeRating;
    }

    public String getStyle(){
        return style;
    }
    public boolean isBattery(){
        return battery;
    }
    public int getGlobeRating(){
        return globeRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> turning on");
    }
}
