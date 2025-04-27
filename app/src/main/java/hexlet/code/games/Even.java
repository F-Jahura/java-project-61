package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class Even extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;

    @Override
    public void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    @Override
    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

        System.out.print("Question: ");
        System.out.print(number + "\n");

        System.out.print("Your answer: ");
        String answer = scanner.next();

        if (number % 2 == 0) {
            Engine.checkAnswer(answer, "yes");
        } else {
            Engine.checkAnswer(answer, "no");
        }
    }
}
