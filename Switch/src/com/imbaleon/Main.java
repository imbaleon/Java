package com.imbaleon;

public class Main {

    public static void main(String[] args) {

        char switchChar = 'E';
        switch (switchChar) {
            case 'A':
                System.out.println("we found A");
                break;
            case 'B':
                System.out.println("we found B");
                break;
            case 'C': case 'D': case 'E' :
                System.out.println("we found C D E");
                break;
            default:
                System.out.println("we didn't find A B C");
                break;
        }
    }

}

