package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Scanner;

public class Even extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);

        Cli.introduce();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

            Engine.question();
            System.out.print(number + "\n");

            Engine.answer();
            String answer = scanner.next();

            if (number % 2 == 0) {
                Engine.checkAnswer(answer, "yes");
            } else {
                Engine.checkAnswer(answer, "no");
            }
        }

        Engine.gameResult();
    }
}
