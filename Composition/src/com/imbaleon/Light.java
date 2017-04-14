package com.imbaleon;

/**
 * Created by Leon on 4/13/17.
 */
public class Light {
    private String density;

    public Light(String density) {
        this.density = density;
    }

    public String getDensity() {
        return density;
    }

    public void lightOn(){
        System.out.println("Light is on from class Light");
    }
}
