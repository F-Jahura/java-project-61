package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int RESULT_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static int count;
    private static final int LENGTH = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void gameRules(String startGame, String gameType) {
        Cli.introduce();
        System.out.println(startGame);

        for (int i = 0; i < LENGTH; i++) {
            int number = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
            int number1;
            String question = null;
            String expectedAnswer = null;

            switch (gameType) {
                case "Even":
                    question = Integer.toString(number);
                    expectedAnswer = Even.correctAnswer(number);
                    break;
                case "Calc":
                    number1 = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
                    char[] symbols = {'+', '-', '*'};
                    char operator = symbols[new Random().nextInt(symbols.length)];
                    question = number + " " + operator + " " + number1;
                    expectedAnswer = Integer.toString(Calculator.correctAnswer(number, number1, operator));
                    break;
                case "GCD":
                    number1 = 1 + (int) (Math.random() * ((MAX_NUMBER - 1) + 1));
                    question = number + " " + number1;
                    expectedAnswer = Integer.toString(GCD.correctAnswer(number, number1));
                    break;
                case "Progression":
                    question = Progression.questionNumber();
                    expectedAnswer = Integer.toString(Progression.correctAnswer());
                    break;
                case "Prime":
                    question = Integer.toString(number);
                    expectedAnswer = Prime.correctAnswer(number);
                    break;
                default:
                    System.out.println("No such game!");

            }

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(expectedAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + expectedAnswer + "'");
                System.out.println("'. \nLet's try again, " + Cli.getText() + "!");
                System.exit(0);
            }
        }

        if (count == RESULT_COUNT) {
            System.out.println("Congratulations, " + Cli.getText() + "!");
        }
    }
}
