package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final int LENGTH = 3;
    private static final int MAX_NUMBER = 100;

    public static void evenRun() {
        String startGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.games(startGame, questionAnswer());
    }

    public static String[][] questionAnswer() {
        String[][] roundsData = new String[LENGTH][2];

        for (int i = 0; i < LENGTH; i++) {
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            String question = Integer.toString(number);

            String expectedAnswer = userAnswer(isEven(number));

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }
        return roundsData;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String userAnswer(boolean value) {
        return value ? "yes" : "no";
    }
}
