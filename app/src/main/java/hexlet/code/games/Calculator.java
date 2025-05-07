package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calculator {
    private static final int LENGTH = 3;
    private static final int MAX_NUMBER = 100;
    public static void calculatorRun() {
        String text = "What is the result of the expression? ";

        Engine.games(text, questionAnswer());
    }

    public static String[][] questionAnswer() {
        String[][] roundsData = new String[LENGTH][2];

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            int number1 = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            char[] symbols = {'+', '-', '*'};
            char operator = symbols[new Random().nextInt(symbols.length)];
            String question = number + " " + operator + " " + number1;
            String expectedAnswer = Integer.toString(gameRules(number, number1, operator));

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }
        return roundsData;
    }

    public static int gameRules(int number, int number1, char operator) {
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
