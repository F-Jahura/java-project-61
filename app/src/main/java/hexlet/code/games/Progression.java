package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    private static final int MIN_RANGE = 5;
    private static final int MAX_RANGE = 10;
    private static final int MAX_NUMBER1 = 15;
    public static void loop() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        Cli.introduce();

        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < LENGTH; j++) {
            int number1  = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER1 - 1) + 1));
            int length = MIN_RANGE + (int) (Math.random() * ((MAX_RANGE - MIN_RANGE) + MIN_RANGE));

            int index = random.nextInt(length);
            int temp = 0;
            String missing = "..";

            Engine.question();
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    stringBuilder.append(missing);
                    temp = number1;
                } else {
                    stringBuilder.append(number1);
                }
                number1 += number;
                stringBuilder.append(" ");
            }
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);

            Engine.answer();
            int answer = scanner.nextInt();

            Engine.checkAnswer(Integer.toString(answer), Integer.toString(temp));
        }
        Engine.gameResult();
    }
}

