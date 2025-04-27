package hexlet.code;

public abstract class Engine {
    private static final int RESULT_COUNT = 3;
    private static int count;

    private static final int LENGTH = 3;

    public void games() {
        Cli.introduce();
        startGame();
        playCircle();
        gameResult();
    }

    public abstract void startGame();
    public abstract void playGame();

    public void playCircle() {
        for (int i = 0; i < LENGTH; i++) {
            playGame();
        }
    }

    public static void checkAnswer(String answer, String expectedAnswer) {
        if (answer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            count++;
        } else {
            System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + expectedAnswer + "'");
            System.out.println("'. \nLet's try again, " + Cli.getText() + "!");
            System.exit(0);
        }
    }

    public void gameResult() {
        if (count == RESULT_COUNT) {
            System.out.println("Congratulations, " + Cli.getText() + "!");
        }
    }
}
