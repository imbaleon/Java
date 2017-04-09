package com.imbaleon;

public class Main {

    public static void main(String[] args) {
        // test for an even number

        int number = 5;
        int finishNUmber = 20;
        int k=0;
        while (number <= finishNUmber) {
            if (isEvenNumber(number)) {
                System.out.println("Even number: " + number);
                k++;
                if (k==5){
                    System.out.println("we found " + k + " even numbers");
                    break;
                }
            }
            //System.out.println("Even number: " + number);
            number++;
        }
    }

    public static boolean isEvenNumber(int x) {
        if (x % 2 == 0) {
            //System.out.println("the number is even");
            return true;
        } else {
            return false;
            //System.out.println("the number is unEven");
        }

    }
}
