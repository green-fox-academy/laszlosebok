import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        int distance;
        double inMiles;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance in kilometers: ");
        distance = scanner.nextInt();

        inMiles = distance * 0.6213;

        System.out.println("The same distance in miles: " + inMiles);

    }
}