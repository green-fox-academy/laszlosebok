import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        Scanner scanner = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        double cubeVolume;
        double cubeSurface;

        System.out.println("Please, Enter the length of side a :");
        sideA = scanner.nextInt();

        System.out.println("Please, Enter the length of side b :");
        sideB = scanner.nextInt();

        System.out.println("Please, Enter the length of side c :");
        sideC = scanner.nextInt();

        cubeVolume = sideA * sideB * sideC;
        cubeSurface = 2 * (sideA *  sideB) + 2 * (sideA * sideC) + 2 * (sideB * sideC);

        System.out.println("Surface Area: " + cubeSurface);
        System.out.println("Volume: " + cubeVolume);
    }
}
