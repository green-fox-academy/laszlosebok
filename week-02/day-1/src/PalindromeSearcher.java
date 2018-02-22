import java.util.Arrays;
import java.util.Scanner;

public class PalindromeSearcher {
    public static Scanner userInput = new Scanner(System.in);
    public static String output = "";

    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        String userString = userInput.nextLine();
        splitter(userString);
        System.out.println(output);
    }
    public static void splitter(String wholeString) {
        for (int i = 3; i < wholeString.length() + 1; i++) {
            for (int j = 0; j < wholeString.length() - (i - 1); j++) {
                String currentSubString = wholeString.substring(j, j+i);
                if (compare(currentSubString)) {
                    output += "\"" + currentSubString + "\" ";
                }
            }
        }
    }
    public static boolean compare (String compareThis) {
        return (compareThis.equals(reverse(compareThis)));
    }
    public static String reverse(String reverseThis) {
        String reversed = "";
        String[] toReverse = reverseThis.split("");
        String[] reversedArray = Arrays.copyOf(toReverse, toReverse.length);
        int whereToPut = toReverse.length - 1;
        for (String currentElement : toReverse) {
            reversedArray[whereToPut] = currentElement;
            whereToPut--;
        }
        for (String currentLetter : reversedArray) {
            reversed += currentLetter;
        }
        return reversed;
    }
}
