package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void introduce(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");

        //while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            System.out.println("Hello, " + text + "!");
        //}
    }
}
