package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void loop() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < 3; j++) {

            Engine engine = new Engine();

            int number = 2 + (int) (Math.random() * ((15 - 2) + 2));
            int number1 = engine.getNumber1();
            int length = 5 + (int) (Math.random() * ((10 - 5) + 5));

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
