package com.imbaleon;

public class Main {

    public static void main(String[] args) {

        double x;

        x = calcFeetAndInchesToCentimeters(0, 12);
        System.out.println(x);
        x = calcFeetAndInchesToCentimeters(12);
        System.out.println(x);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0) {
            if ((inches >= 0) && (inches <= 12)) {
                return 2.54 * (feet * 12 + inches);
            }

        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {


        if (inches > 0) {
            double feet = (int)inches / 12;
            inches = (int)inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    }


}
