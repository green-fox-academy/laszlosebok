import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number's factorial are you looking for?");
        int userInput = scanner.nextInt();

        System.out.println("The result is: " + factorio(userInput));
    }

    public static int factorio(int number) {
        int factorial = 1;
        for (int i = number; i > 0 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
