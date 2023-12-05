import java.io.PrintStream;
import java.io.PrintWriter;

public class HangmanDrawing {
    public HangmanDrawing() {
    }

    public void getStage(int stage) {
        switch (stage) {
            case 0:
                printInitialStage();
                break;
            case 1:
                printFirstMistake();
                break;
            case 2:
                printSecondMistake();
                break;
            case 3:
                printThirdMistake();
                break;
            case 4:
                printFourthMistake();
                break;
            case 5:
                printFifthMistake();
                break;
            case 6:
                printFinalStage();
                break;
            default:
                break;
        }
    }

    private static void printInitialStage() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |");
        p.println("  |");
        p.println("  |");
        p.println("  |");
        p.println(" _|_");
    }

    private static void printFirstMistake() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |      O");
        p.println("  |");
        p.println("  |");
        p.println("  |");
        p.println(" _|_");
    }

    private static void printSecondMistake() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |      O");
        p.println("  |      |");
        p.println("  |      |");
        p.println("  |      |");
        p.println(" _|_");
    }

    private static void printThirdMistake() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |      O");
        p.println("  |     /|");
        p.println("  |      |");
        p.println("  |      |");
        p.println(" _|_");
    }

    private static void printFourthMistake() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |      O");
        p.println("  |     /|\\");
        p.println("  |      |");
        p.println("  |      |");
        p.println(" _|_");
    }

    private static void printFifthMistake() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |      O");
        p.println("  |     /|\\");
        p.println("  |      |");
        p.println("  |     /|");
        p.println(" _|_");
    }

    private static void printFinalStage() {
        PrintWriter p = new PrintWriter(System.out, true);

        p.println("  _______");
        p.println("  |      |");
        p.println("  |      O");
        p.println("  |     /|\\");
        p.println("  |      |");
        p.println("  |     /|\\");
        p.println(" _|_");
        p.println("☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆");
        p.println("☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆");
    }
}
