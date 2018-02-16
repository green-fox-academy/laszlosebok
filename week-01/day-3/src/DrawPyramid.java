import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int pyramidLines;
        int numberOfLineElements = 1;
        String pyramidElement = "*";
        String spaceElement = " ";
        String currentLine;

        System.out.println("Please, Enter a number: ");
        pyramidLines = scanner.nextInt();

        for (int i = 0; i < pyramidLines; i++) {

            currentLine = "";

            for (int j = 0; j < (pyramidLines - i); j++) {
                currentLine += spaceElement;
            }

            for (int k = 0; k < numberOfLineElements; k++) {
                currentLine += pyramidElement;
            }

            System.out.println(currentLine);

            numberOfLineElements += 2;
        }
    }
}
