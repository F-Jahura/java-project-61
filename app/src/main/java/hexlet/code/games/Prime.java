package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public final class Prime extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    public static void printPrimeNumber() {

    }
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

        System.out.print("Question: ");
        System.out.print(number + "\n");

        System.out.print("Your answer: ");
        String answer = scanner.nextLine();

        if (isPrimeNumber(number)) {
            Engine.checkAnswer(answer, "yes");
        } else {
            Engine.checkAnswer(answer, "no");
        }
    }
}
