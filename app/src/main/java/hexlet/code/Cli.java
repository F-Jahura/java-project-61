package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String text;
    public static void introduce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        text = scanner.nextLine();
        System.out.println("Hello, " + text + "!");
    }
}
