import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        int howMany;
        int currentNumber;
        double sum = 0;
        double avg;

        System.out.println("How many numbers do you want to work with?");
        howMany = scanner.nextInt();

        int[] numCollection = new int[howMany];

        for (int i = 0; i < howMany; i++) {
            System.out.println("Please, Enter a number:");
            currentNumber = scanner.nextInt();
            numCollection[i] = currentNumber;
            sum += numCollection[i];
        }

        avg = sum / howMany;

        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}
