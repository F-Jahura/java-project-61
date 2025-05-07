package hexlet.code.games;

import hexlet.code.Engine;

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
            int number = 1 + (int) (Math.random() * MAX_NUMBER);
            String question = Integer.toString(number);
            String expectedAnswer = gameRules(number);

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }
        return roundsData;
    }

    public static boolean isPrimeNumber(int number) {
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
    public static String gameRules(int number) {
        if (isPrimeNumber(number)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
