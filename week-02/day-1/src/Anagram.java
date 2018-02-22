import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {
    public static Scanner inputReader = new Scanner(System.in);
    private static final String  NOT_ANAGRAM = "The word is not an anagram.";

    public static void main(String[] args) {
        List<String> wordsToCheck = userInput();
        if (wordsToCheck.get(0).length() == wordsToCheck.get(1).length()) {
            for (int i = 0; i < wordsToCheck.get(0).length(); i++) {
                if (!wordCounter(wordsToCheck, wordsToCheck.get(1).charAt(i))) {
                    System.out.println(NOT_ANAGRAM);
                    System.exit(0);
                }
            }
            System.out.println("The word is an anagram.");
        } else {
            System.out.println(NOT_ANAGRAM);
        }

    }
    public static List<String> userInput() {
        List<String> userInputWords = new ArrayList<>();
        System.out.println("Please enter a word:");
        userInputWords.add(inputReader.nextLine());
        System.out.println("Please enter another word to check if it is an anagram:");
        userInputWords.add(inputReader.nextLine());
        return userInputWords;
    }
    public static boolean wordCounter(List<String> wordList, char letterToCheck) {
        int counterFirstWord = 0;
        int counterSecondWord = 0;
        for (int i = 0; i < wordList.get(0).length(); i++) {
            if (wordList.get(0).charAt(i) == letterToCheck) {
                counterFirstWord++;
            }
            if (wordList.get(1).charAt(i) == letterToCheck) {
                counterSecondWord++;
            }
        }
        return  (counterFirstWord == counterSecondWord);
    }
}
