import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Please, Enter a number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Please, Enter another number: ");
        secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal");
            System.out.println(firstNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
