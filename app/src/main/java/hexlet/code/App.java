package hexlet.code;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the number and press Enter!");
        System.out.print("1 - Greet \n2 - Even \n0 - Exit \nYour Choice: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.introduce();
        }
        if (number == 2) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.introduce();
            Even.evenNumber();
        } else if (number == 0) {
            System.exit(0);
        }
    }
}
