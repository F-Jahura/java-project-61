package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even1 {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;
    public static void evenGameTry() {
        Cli.introduce();
        String startGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        System.out.println(startGame);

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            Engine.gameRules1(Integer.toString(number), even(number));
        }
    }
    public static String even(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

}
