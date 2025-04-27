package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calculator extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    public static void myCalculator() {
        Random random = new Random(1);
        Scanner scanner = new Scanner(System.in);

        Cli.introduce();

        System.out.println("What is the result of the expression? ");

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            int number1  = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

            String symbol = "+-*";
            char chars = symbol.charAt(random.nextInt(symbol.length()));

            Engine.question();
            System.out.print(number + " " + chars + " " + number1 + "\n");

            Engine.answer();
            int answer = scanner.nextInt();

            int resultPlus = number + number1;
            int resultSub = number - number1;
            int resultMultiply = number * number1;

            if (chars == '+') {
                Engine.checkAnswer(Integer.toString(answer), Integer.toString(resultPlus));
            } else if (chars == '-') {
                Engine.checkAnswer(Integer.toString(answer), Integer.toString(resultSub));
            } else if (chars == '*') {
                Engine.checkAnswer(Integer.toString(answer), Integer.toString(resultMultiply));
            }
        }

        Engine.gameResult();
    }
}
