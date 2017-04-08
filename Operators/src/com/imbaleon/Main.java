package com.imbaleon;

public class Main {

    public static void main(String[] args) {

        double a = 10;
        double b = 150;
        //operator AND
        if ((a <= 10) && (a > 1))
            System.out.println("a= " + a);
        //operator OR
        if ((b <= 10) || (b > 1))
            System.out.println("b= " + b);

        //BOOLEAN Exception
        boolean test = false;
        if (test == true)
            System.out.println("FALSE");
        if (test = true)
            System.out.println(("Boolean test gets false in IF"));

        boolean wasTrue = test ? true : false;
        if (wasTrue)
            System.out.println("wasTrue : " + wasTrue);

        //test
        double ab = 20d;
        double cd = 80d;
        double result = 25 * (ab+cd);
        System.out.println();
        double remainder = result % 40;
        if (remainder <=20)
            System.out.println("Total was over the limit" + remainder);

    }
}
