package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    public static int findDivider(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findDivider(b, a % b);
    }
    public static void myGcd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            int number1  = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

            Engine.question();
            System.out.print(number + " " + number1 + "\n");

            Engine.answer();
            int answer = scanner.nextInt();

            int divider = findDivider(number, number1);

            Engine.checkAnswer(Integer.toString(answer), Integer.toString(divider));
        }

        Engine.gameResult();
    }
}
