package com.imbaleon;

public class Main {
// Prime number detector
    public static void main(String[] args) {
        // prime number using recursive method
        boolean value = false;
        if (f(121, 2) == true) {
            System.out.println("Prime number");
        } else System.out.println("the number is not Prime");
    }

    public static boolean f(int x, int i) {

        if (i == x) {
            return true;
        }
        if (x % i == 0) {
            return false;
        }
        return f(x, i+1);

    }
}
//public  class Main {
//
//    public static void main(String[] arg) {
//
//            if(isPrime(6, 5) == 1){
//                System.out.println(" is a prime number");
//            }
//            else{
//                System.out.println("is not a prime number");
//            }
//
//    }
//
//    static int isPrime(int x, int i) {
//        if(i <= 1) {
//            return 1;
//        }
//        if(x % i == 0) {
//            return -1;
//        }
//        return isPrime(x, i-1);
//    }
//}
