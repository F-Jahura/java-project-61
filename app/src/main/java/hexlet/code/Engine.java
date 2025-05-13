package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int LENGTH = 3;
    private static Scanner scanner = new Scanner(System.in);

    private static String userName;

    public static void games(String textRules, String[][] round) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(textRules);

        for (int i = 0; i < LENGTH; i++) {
            System.out.println("Question: " + round[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(round[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + round[i][1] + "'");
                System.out.println("'. \nLet's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
