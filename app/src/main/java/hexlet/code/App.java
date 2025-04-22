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

        if (number == 1) {
            Engine.playerDetails();
        } else if (number == 2) {
            Engine.playerDetails();
            Even.evenNumber();
        } else if (number == 3) {
            Engine.playerDetails();
            Calculator.myCalculator();
        } else if (number == 4) {
            Engine.playerDetails();
            GCD.myGcd();
        } else if (number == 5) {
            Engine.playerDetails();
            Progression.loop();
        } else if (number == 6) {
            Engine.playerDetails();
            Prime.printPrimeNumber();
        } else if (number == 0) {
            System.exit(0);
        }
    }
}
