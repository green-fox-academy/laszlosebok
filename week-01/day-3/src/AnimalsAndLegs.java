import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        int numberOfChickens;
        int numberOfPigs;
        int totalLegs;

        System.out.println("How many chickens does the farmer have?");
        numberOfChickens = scanner.nextInt();
        System.out.println("How many pigs does the farmer have?");
        numberOfPigs = scanner.nextInt();

        totalLegs = (numberOfChickens * 2) + (numberOfPigs * 4);

        System.out.println("The animals have " + totalLegs + " legs in total.");
    }
}