package hexlet.code;

import java.util.Scanner;

public class Even {
    //private static int number;
    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;

        for (int i = 0; i < 3; i++) {
            int number = scanner.nextInt();
            System.out.println("Question: " + number);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
            } else {
                if (answer.equals("yes")) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + "no" + "\n"
                            + "Let's try again, " + Cli.getText() + "!");
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + "yes" + "\n"
                            + "Let's try again, " + Cli.getText() + "!");
                }
                System.exit(0);
            }
        }

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getText() + "!");
        }

    }
}
