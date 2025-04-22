package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the number and press Enter!");
        System.out.print("1 - Greet \n2 - Even \n3 - Calc \n4 - GCD "
                + "\n5 - Progression \n6 - Prime \n0 - Exit \nYour Choice: ");
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
