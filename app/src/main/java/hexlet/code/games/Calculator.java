package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

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
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            int number1 = Utils.getRandomNumber(1, MAX_NUMBER);
            char[] symbols = {'+', '-', '*'};
            char operator = symbols[new Random().nextInt(symbols.length)];
            String question = number + " " + operator + " " + number1;
            String expectedAnswer = Integer.toString(calculation(number, number1, operator));

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }
        return roundsData;
    }

    public static int calculation(int number, int number1, char operator) {
        switch (operator) {
            case '+':
                return number + number1;
            case '-':
                return number - number1;
            case '*':
                return number * number1;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
