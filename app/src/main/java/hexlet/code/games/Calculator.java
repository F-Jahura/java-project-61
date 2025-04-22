package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void myCalculator() {
        Random random = new Random(1);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression? ");

        for (int i = 0; i < 3; i++) {
            Engine engine = new Engine();

            String symbol = "+-*";
            char chars = symbol.charAt(random.nextInt(symbol.length()));

            Engine.question();
            System.out.print(engine.getNumber() + " " + chars + " " + engine.getNumber1() + "\n");

            Engine.answer();
            int answer = scanner.nextInt();

            int resultPlus = engine.getNumber() + engine.getNumber1();
            int resultSub = engine.getNumber() - engine.getNumber1();
            int resultMultiply = engine.getNumber() * engine.getNumber1();

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
