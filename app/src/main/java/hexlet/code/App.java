package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int EXIT_COMMAND = 0;
    private static final int GREET_COMMAND = 1;
    private static final int EVEN_COMMAND = 2;
    private static final int CALC_COMMAND = 3;
    private static final int GCD_COMMAND = 4;
    private static final int PROGRESSION_COMMAND = 5;
    private static final int PRIME_COMMAND = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the number and press Enter!");
        System.out.print(GREET_COMMAND + " - Greet \n" + EVEN_COMMAND + " - Even \n" + CALC_COMMAND
                +  " - Calc \n" + GCD_COMMAND + " - GCD \n" + PROGRESSION_COMMAND + " - Progression \n"
                + PRIME_COMMAND + " - Prime \n" + EXIT_COMMAND + " - Exit \nYour Choice: ");

        int number = scanner.nextInt();

        if (number == GREET_COMMAND) {
            Cli.introduce();
        } else if (number == EVEN_COMMAND) {
            Even.evenRun();
        } else if (number == CALC_COMMAND) {
            Calculator.calculatorRun();
        } else if (number == GCD_COMMAND) {
            GCD.gcdRun();
        } else if (number == PROGRESSION_COMMAND) {
            Progression.progressionRun();
        } else if (number == PRIME_COMMAND) {
            Prime.primeRun();
        } else if (number == EXIT_COMMAND) {
            System.exit(0);
        }
    }
}
