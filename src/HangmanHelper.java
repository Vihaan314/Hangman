import java.util.HashSet;

public class HangmanHelper {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getTries(String word) {
        HashSet<Character> wordChars = new HashSet<>();
        StringBuilder wordB = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(wordB.charAt(i))) {
                wordChars.add(wordB.charAt(i));
            }
        }
        System.out.println(wordChars);
        return wordChars.size()+2;
    }

}
