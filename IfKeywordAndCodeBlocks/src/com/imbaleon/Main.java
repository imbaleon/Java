package com.imbaleon;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


       int finalscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("finalScore: " + finalscore);
        gameOver = false;
        finalscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("finalScore: " + finalscore);


    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("final score: " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }
}
