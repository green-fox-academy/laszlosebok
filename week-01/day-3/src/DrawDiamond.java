import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int diamondLines;
        int diamondTopLines;
        int diamondBottomLines;
        int numberOfLineElements = 1;
        boolean isBottomOdd;
        String diamondElement = "*";
        String spaceElement = " ";
        String currentLine;

        System.out.println("Please, Enter a number: ");
        diamondLines = scanner.nextInt();

        if ((diamondLines % 2) == 0) {
            diamondTopLines = diamondLines / 2;
            isBottomOdd = true;
        } else {
            diamondTopLines = (diamondLines / 2) + 1;
            isBottomOdd = false;
        }

        diamondBottomLines = diamondLines - diamondTopLines;

        // Diamond Top Part
        for (int i = 0; i < diamondTopLines; i++) {

            currentLine = "";

            for (int j = 1; j < (diamondTopLines - i); j++) {
                currentLine += spaceElement;
            }

            for (int k = 0; k < numberOfLineElements; k++) {
                currentLine += diamondElement;
            }

            System.out.println(currentLine);

            numberOfLineElements += 2;
        }

        // Diamond Bottom Part

        if (isBottomOdd) {
            for (int i = diamondBottomLines; i > 0; i--) {
                numberOfLineElements -= 2;
                currentLine = "";

                for (int j = diamondBottomLines - i; j > 0; j--) {
                    currentLine += spaceElement;
                }

                for (int k = numberOfLineElements; k > 0; k--) {
                    currentLine += diamondElement;
                }

                System.out.println(currentLine);
            }

        } else {
            numberOfLineElements -= 2;
            for (int i = diamondBottomLines; i > 0; i--) {
                numberOfLineElements -= 2;
                currentLine = " ";

                for (int j = diamondBottomLines - i; j > 0; j--) {
                    currentLine += spaceElement;
                }

                for (int k = numberOfLineElements; k > 0; k--) {
                    currentLine += diamondElement;
                }

                System.out.println(currentLine);
            }
        }

    }
}
