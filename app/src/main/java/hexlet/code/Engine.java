package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String name;

    Random random = new Random();

    private int number = 1 + (int) (Math.random() * ((100 - 1) + 1));
    private int number1 = 1 + (int) (Math.random() * ((100 - 1) + 1));

    private static int count;

    public Engine() {
        count++;
    }

    public int getNumber() {
        return number;
    }

    public int getNumber1() {
        return number1;
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
        } else {
            System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + expectedAnswer + "'");
            System.out.println("'. \nLet's try again, " + name + "!");
            System.exit(0);
        }
    }

    public static void gameResult() {
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
