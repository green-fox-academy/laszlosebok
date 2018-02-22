import java.util.Scanner;

public class GuessMyNumber {
    public static int remainingLives = 5;
    public static Scanner userInput = new Scanner(System.in);
    public static int guessThis;
    public static void main(String[] args) {
        gameInit();
        gameMain();
    }
    public static void gameInit() {
        guessThis = (int)(1 + (Math.random() * 99));
        System.out.println("I've the number between 1-100. You have " + remainingLives + " lives.");
    }
    public static void gameMain() {
        int userGuess;
        for (int i = 0; i < 5; i++) {
            userGuess = userInput.nextInt();
            if (userGuess == guessThis) {
                gameWin();
            } else {
                checkNumber(userGuess);
            }
        }
        System.out.println("You lost. The number was " + guessThis);
    }
    public static void gameWin() {
        System.out.println("Congratulations! You won!");
    }
    public static void checkNumber(int userGuess) {
        remainingLives--;
        if (userGuess > guessThis) {
            System.out.println("Too high. You have " + remainingLives + " lives left.");
        } else {
            System.out.println("Too low. You have " + remainingLives + " lives left.");
        }
    }
}
