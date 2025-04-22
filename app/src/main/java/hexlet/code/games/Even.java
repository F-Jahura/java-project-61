package hexlet.code.games;

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

            Engine.answer();
            String answer = scanner.next();

            if (engine.getNumber() % 2 == 0) {
                Engine.checkAnswer(answer, "yes");
            } else {
                Engine.checkAnswer(answer, "no");
            }
        }

        Engine.gameResult();
    }
}


