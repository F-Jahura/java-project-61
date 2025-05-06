package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even1 {
    private static final int MAX_NUMBER = 100;
    public static void evenGameTry() {
        String startGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
        String question = Integer.toString(number);
        Engine.gameRules1(startGame, question, even(number));

    }
    public static String even(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
