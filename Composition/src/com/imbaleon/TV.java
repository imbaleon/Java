package com.imbaleon;

/**
 * Created by Leon on 4/13/17.
 */
public class TV extends Table{
    private int price;


    public TV(Dimensions dimensions, String color, int price) {
        super(dimensions, color);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
