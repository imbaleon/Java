package com.imbaleon;

public class Main {

    public static void main(String[] args) {


        int playerPostion = calculateHighScorePosition(1);
        displayHighScorePosition("Don", playerPostion);

        playerPostion = calculateHighScorePosition(150);
        displayHighScorePosition("Bob", playerPostion);

        playerPostion = calculateHighScorePosition(550);
        displayHighScorePosition("Tim", playerPostion);

        playerPostion = calculateHighScorePosition(1550);
        displayHighScorePosition("Patrick", playerPostion);

    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get in position " + position);

    }

    public static int calculateHighScorePosition(int score) {

        if (score > 1000) {
            return 1;
        } else if ((score > 500) && (score < 1_000)) {
            return 2;
        } else if ((score > 100) && (score < 500)) {
            return 3;
        }

        return 4;
    }
}
