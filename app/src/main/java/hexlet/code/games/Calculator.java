package hexlet.code.games;

import hexlet.code.Engine;

public final class Calculator {
    public static void calculatorGame() {
        String text = "What is the result of the expression? ";

        Engine.gameRules(text, "Calc");
    }

    public static int correctAnswer(int number, int number1, char operator) {
        int resultPlus = number + number1;
        int resultSub = number - number1;
        int resultMultiply = number * number1;

        if (operator == '+') {
            return resultPlus;
        } else if (operator == '-') {
            return resultSub;
        } else {
            return resultMultiply;
        }
    }
}
