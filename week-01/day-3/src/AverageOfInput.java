import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;
        int numberFour;
        int numberFive;
        int sum;
        double average;

        System.out.println("Please enter the first number: ");
        numberOne = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        numberTwo = scanner.nextInt();

        System.out.println("Please enter the third number: ");
        numberThree = scanner.nextInt();

        System.out.println("Please enter the fourth number: ");
        numberFour = scanner.nextInt();

        System.out.println("Please enter the fifth number: ");
        numberFive = scanner.nextInt();

        sum = numberOne + numberTwo + numberThree + numberFour + numberFive;
        average = sum / 5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
