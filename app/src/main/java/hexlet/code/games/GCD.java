package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD {
    public static void gcdGame() {
        String text = "\"Find the greatest common divisor of given numbers.\"";
        Engine.gameRules(text, "GCD");
    }

    public static int findDivider(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findDivider(b, a % b);
    }

    public static int correctAnswer(int number, int number1) {
        int divider = findDivider(number, number1);
        return divider;
    }
}
