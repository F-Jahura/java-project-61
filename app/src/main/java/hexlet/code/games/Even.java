package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            Engine engine = new Engine();

            Engine.question();
            System.out.print(engine.getNumber() + "\n");

            String answer = scanner.next();
            Engine.answer();
            System.out.print(answer);

            if (engine.getNumber() % 2 == 0 && answer.equals("yes") || engine.getNumber() % 2 != 0 && answer.equals("no")) {
                Engine.correct();
            } else {
                if (answer.equals("yes")) {
                    System.out.print("\n'" + answer);
                    Engine.warning();
                    System.out.print("no");
                    Engine.tryAgain();
                } else {
                    System.out.print("\n'" + answer);
                    Engine.warning();
                    System.out.print("yes");
                    Engine.tryAgain();
                }
                System.exit(0);
            }
        }

        Engine.gameResult();
    }
}

