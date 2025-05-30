package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {
    private static final int LENGTH = 3;
    private static final int MAX_NUMBER = 100;

    public static void gcdRun() {
        String text = "\"Find the greatest common divisor of given numbers.\"";
        Engine.games(text, questionAnswer());
    }

    public static String[][] questionAnswer() {
        String[][] roundsData = new String[LENGTH][2];

        for (int i = 0; i < LENGTH; i++) {
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            int number1 = Utils.getRandomNumber(1, MAX_NUMBER);
            String question = number + " " + number1;
            String expectedAnswer = Integer.toString(gameRules(number, number1));

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }
        return roundsData;
    }

    public static int findDivider(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findDivider(b, a % b);
    }

    public static int gameRules(int number, int number1) {
        int divider = findDivider(number, number1);
        return divider;
    }
}
