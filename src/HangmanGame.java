import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Scanner;

public class HangmanGame {
    private final HangmanCategories categories;
    private final HangmanDrawing drawing;
    private final Scanner scanner;
    private int TRIES;
    private String word;
    private String clue;
    private StringBuilder wordDisplay;

    public HangmanGame() {
        categories = new HangmanCategories();
        drawing = new HangmanDrawing();
        scanner = new Scanner(System.in);
        TRIES = 6;
    }

    public void playGame() {
        System.out.println("Let's Play Hangman\n");
        System.out.println("You have 6 tries to guess the correct word\n");
        System.out.println("Choose a category:\n1. Sports\n2. Movies\n3. Computers\n4. Food\n5. Countries");
        int categoryChoice = getCategory();
        getWordChoice(categoryChoice);
        setupWordDisplay();
        runRounds();
    }

    private int getCategory() {
        int choice = 0;
        while (choice < 1 || choice > 5) {
            System.out.print("Enter your choice (1-5): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 5) {
                    System.out.println("Please enter a number between 1 and 5!");
                }
            } else {
                System.out.println("Please enter an integer!");
                scanner.next();
            }
        }
        return choice;
        //Allows user to enter category choice from 1-5, with validation
    }

    private void getWordChoice(int choice) {
        String[] wordAndClue = categories.getRandomWord(choice);
        word = wordAndClue[0];
        clue = wordAndClue[1];
        //Sets the random word and clue from categories class when called
//        TRIES = HangmanHelper.getTries(word);
    }

    private void setupWordDisplay() {
        wordDisplay = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            wordDisplay.append(ch == ' ' || ch == '|' ? ch : '_');
            //For the random word chosen, create the display to consist of spaces, pipes, or underscores for the characters
        }
    }

    private void showCurrentState() {
        HangmanHelper.clearScreen();
        System.out.println(wordDisplay.toString());
        drawing.getStage(6 - TRIES);
        if (TRIES <= 2) {
            System.out.println("Hint: " + clue);
        }
        //Displays the current guess status - correctly guessed characters and unknown
        //The hangman drawing is displayed based on the tries left
        //Will display the clue if the player has <=two tries
    }

    private void processGuess(String guess) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                wordDisplay.setCharAt(i, guess.charAt(0));
                correctGuess = true;
            }
        }
        //Checks if any of the characters in the random word match the user input
        if (correctGuess) {
            System.out.println("Correct guess!");
        } else {
            TRIES--;
            if (TRIES!=0) {
                System.out.println("Wrong guess. You have " + TRIES + " incorrect guesses left.");
            }
            else {
                System.out.println("Out of tries!");
            }
        }
    }

    private void runRounds() {
        while (TRIES > 0 && wordDisplay.indexOf("_") >= 0) {
            showCurrentState();
            System.out.print("Enter letter : ");
            String guess = scanner.next().toUpperCase();
            processGuess(guess.length() > 0 ? guess.substring(0, 1) : "");
        }
        //After the tries have run out or word was guessed correctly
        if (TRIES == 0) {
            //No tries left
            System.out.println("The correct word was: " + word);
        } else {
            //Guessed word with tries left
            System.out.println("Congratulations! You guessed the word: " + word);
        }
    }

}
