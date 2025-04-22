package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    public static void printPrimeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

            Engine.question();
            System.out.print(number + "\n");

            Engine.answer();
            String answer = scanner.nextLine();

            if (isPrimeNumber(number)) {
                Engine.checkAnswer(answer, "yes");
            } else {
                Engine.checkAnswer(answer, "no");
            }
        }

        Engine.gameResult();
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
}
