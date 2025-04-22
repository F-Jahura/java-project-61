package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static int findDivider(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findDivider(b, a % b);
    }
    public static void myGcd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {
            Engine engine = new Engine();

            Engine.question();
            System.out.print(engine.getNumber() + " " + engine.getNumber1() + "\n");

            Engine.answer();
            int answer = scanner.nextInt();

            int divider = findDivider(engine.getNumber(), engine.getNumber1());

            Engine.checkAnswer(Integer.toString(answer), Integer.toString(divider));
        }

        Engine.gameResult();
    }
}
