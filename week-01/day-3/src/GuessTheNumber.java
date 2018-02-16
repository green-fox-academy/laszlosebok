import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int largestNumber = 100;
        int storedNumber = random.nextInt(largestNumber);
        int userGuess;
        boolean isGuessCorrect = false;

        System.out.println("The program has thought of a number between 0 and " + largestNumber + ".");
        System.out.println("Please, Enter your guess: ");
        userGuess = scanner.nextInt();

        if (userGuess == storedNumber) {
            System.out.println("You found the number: " + storedNumber);
            isGuessCorrect = true;
        } else {
            while (!isGuessCorrect) {
                if (userGuess > storedNumber) {
                    System.out.println("The stored number is lower");
                    userGuess = scanner.nextInt();
                } else if ( userGuess < storedNumber) {
                    System.out.println("The stored number is higher");
                    userGuess = scanner.nextInt();
                } else {
                    System.out.println("You found the number: " + storedNumber);
                    isGuessCorrect = true;
                }
            }
        }

    }
}
