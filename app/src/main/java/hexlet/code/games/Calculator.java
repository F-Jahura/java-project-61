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

            int answer = scanner.nextInt();
            Engine.answer();
            System.out.print(answer);

            int resultPlus = engine.getNumber() + engine.getNumber1();
            int resultSub = engine.getNumber() - engine.getNumber1();
            int resultMultiply = engine.getNumber() * engine.getNumber1();

            if (chars == '+' && answer == resultPlus
                    || chars == '-' && answer == resultSub
                    || chars == '*' && answer == resultMultiply) {
                Engine.correct();

            } else {
                if (chars == '+') {
                    System.out.print("\n'" + answer);
                    Engine.warning();
                    System.out.print(resultPlus);
                    Engine.tryAgain();
                } else if (chars == '-') {
                    System.out.print("\n'" + answer);
                    Engine.warning();
                    System.out.print(resultSub);
                    Engine.tryAgain();
                } else {
                    System.out.print("\n'" + answer);
                    Engine.warning();
                    System.out.print(resultMultiply);
                    Engine.tryAgain();
                }

                System.exit(0);
            }
        }

        Engine.gameResult();
    }
}
