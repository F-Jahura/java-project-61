package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Calculator extends Engine {
    private static final int MAX_NUMBER = 100;
    private static final int LENGTH = 3;

    @Override
    public void startGame() {
        System.out.println("What is the result of the expression? ");
    }
    @Override
    public void playGame() {
        Random random = new Random(1);
        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
        int number1  = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));

        char[] symbols = {'+', '-', '*'};
        int index = new Random().nextInt(symbols.length);
        char operator = symbols[index];


        System.out.print("Question: ");
        System.out.print(number + " " + operator + " " + number1 + "\n");

        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        int resultPlus = number + number1;
        int resultSub = number - number1;
        int resultMultiply = number * number1;

        if (operator == '+') {
            Engine.checkAnswer(Integer.toString(answer), Integer.toString(resultPlus));
        } else if (operator == '-') {
            Engine.checkAnswer(Integer.toString(answer), Integer.toString(resultSub));
        } else if (operator == '*') {
            Engine.checkAnswer(Integer.toString(answer), Integer.toString(resultMultiply));
        }
    }
}

