package com.imbaleon;

/**
 * Created by Leon on 4/13/17.
 */
public class Table {
    private Dimensions dimensions;
    private String color;

    public Table(Dimensions dimensions, String color) {
        this.dimensions = dimensions;
        this.color = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}
