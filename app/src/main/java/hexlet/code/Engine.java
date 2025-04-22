package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    private static String name;
    private static final int RESULT_COUNT = 3;
    private static int count;
    public static int getCount() {
        return count;
    }

    public static void playerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
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
            System.out.println("'. \nLet's try again, " + name + "!");
            System.exit(0);
        }
    }

    public static void gameResult() {
        if (count == RESULT_COUNT) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
