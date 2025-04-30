package hexlet.code.games;

import hexlet.code.Engine;

public final class Even {
    public static void evenGame() {
        String text = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.gameRules(text, "Even");
    }

    public static String correctAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
