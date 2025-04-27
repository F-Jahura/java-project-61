package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    private static final int RESULT_COUNT = 3;
    private static int count;
    public static int getCount() {
        return count;
    }


    public static void question() {
        System.out.print("Question: ");
    }

    public static void answer() {
        System.out.print("Your answer: ");
    }

    public static void checkAnswer(String answer, String expectedAnswer) {
        if (answer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            count++;
        } else {
            System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + expectedAnswer + "'");
            System.out.println("'. \nLet's try again, " + Cli.getText() + "!");
            System.exit(0);
        }
    }

    public static void gameResult() {
        if (count == RESULT_COUNT) {
            System.out.println("Congratulations, " + Cli.getText() + "!");
        }
    }
}
