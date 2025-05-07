package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int RESULT_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static int count;
    private static final int LENGTH = 3;
    private static Scanner scanner = new Scanner(System.in);


    public static void games(String startGame, String[][] round) {
        Cli.introduce();

        System.out.println(startGame);

        for (int i = 0; i < LENGTH; i++) {
            System.out.println("Question: " + round[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(round[i][1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + round[i][1] + "'");
                System.out.println("'. \nLet's try again, " + Cli.getText() + "!");
                System.exit(0);
            }
        }

        if (count == RESULT_COUNT) {
            System.out.println("Congratulations, " + Cli.getText() + "!");
        }
    }
}
