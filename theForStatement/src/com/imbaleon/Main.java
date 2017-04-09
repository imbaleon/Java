package com.imbaleon;

public class Main {

    public static void main(String[] args) {
        double amount = 10_000;
        for (int i = 2; i <= 8; i++) {
            System.out.println("interest of " + i + " from amount of " + amount + "is : " + (int) calcInterest(amount, i));
        }
        for (int i = 8; i > 1; i--) {
            System.out.println("interest of " + i + " from amount of " + amount + " is : " + String.format("%.2f", calcInterest(amount, i)));
        }
        int k = 0;
        for (int i = 4; i < 103; i++) {
            if (isPrime(i)) {
                k++;
                System.out.println("we found a prime number" + i);
            }
            if (k == 3) {
                break;
            }
        }

    }

    public static double calcInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
