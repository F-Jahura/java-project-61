package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void printPrimeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            Engine engine = new Engine();

            Engine.question();
            System.out.print(engine.getNumber() + "\n");

            Engine.answer();
            String answer = scanner.nextLine();

            if (isPrimeNumber(engine.getNumber())) {
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
