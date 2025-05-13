package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private static final int LENGTH = 3;
    private static final int MAX_NUMBER = 100;

    public static void primeRun() {
        String text = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.games(text, questionAnswer());
    }

    public static String[][] questionAnswer() {
        String[][] roundsData = new String[LENGTH][2];

        for (int i = 0; i < LENGTH; i++) {
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            String question = Integer.toString(number);

            String expectedAnswer = userAnswer(isPrime(number));

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }
        return roundsData;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String userAnswer(boolean value) {
        return value ? "yes" : "no";
    }
}
