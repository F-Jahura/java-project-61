package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {
    public static void primeGame() {
        String text = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.gameRules(text, "Prime");
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
    public static String correctAnswer(int number) {
        if (isPrimeNumber(number)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
