package com.bowling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var BowlingGame = new Game();
        System.out.println("Welcome to Hy-Vee Bowling! Hope you have fun!");
        Scanner scanner =new Scanner(System.in);
        while (!BowlingGame.gameOver()) {
            System.out.println("Frame: Score: %d".formatted(BowlingGame.score()));
            System.out.print("Roll the bowling ball! Rolled: ");
            int rolledBall = scanner.nextInt();
            BowlingGame.roll(rolledBall);
        }

        System.out.println("Game Over!\nScore: %d".formatted(BowlingGame.score()));
    }
}
