package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public final class Progression {
    private static Random random = new Random();
    private static final int MAX_NUMBER = 100;
    private static final int MIN_RANGE = 5;
    private static final int MAX_RANGE = 10;
    private static final int MAX_NUMBER1 = 15;
    private static int temp;
    private static final int LENGTH = 3;

    public static void progressionRun() {
        String text = "What number is missing in the progression?";
        Engine.games(text, questionAnswer());
    }

    public static String[][] questionAnswer() {
        String[][] roundsData = new String[LENGTH][2];

        for (int i = 0; i < LENGTH; i++) {
            String question = Progression.questionNumber();
            String expectedAnswer = Integer.toString(gameRules());

            roundsData[i][0] = question;
            roundsData[i][1] = expectedAnswer;
        }

        return roundsData;
    }


    public static String questionNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        int number1  = Utils.getRandomNumber(1, MAX_NUMBER);
        int number = Utils.getRandomNumber(1, MAX_NUMBER1);
        int length = Utils.getRandomNumber(MIN_RANGE, MAX_RANGE);
        int index = random.nextInt(length);
        String missing = "..";

        for (int i = 0; i < length; i++) {
            if (i == index) {
                stringBuilder.append(missing);
                temp = number1;
            } else {
                stringBuilder.append(number1);
            }
            number1 += number;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static int gameRules() {
        return temp;
    }
}
