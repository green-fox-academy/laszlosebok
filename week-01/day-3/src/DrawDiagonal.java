import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        int squareSize;
        Scanner scanner = new Scanner(System.in);
        String squareElement = "%";
        String squareSpace = " ";
        String currSquareLine;

        System.out.println("Please, Enter a number: ");
        squareSize = scanner.nextInt();

        /*
         * currSquareLine is set to % every iteration because each line must start with %
         * In exchange 'j' starts counting from 1 because the first element of the line is already set
         * The diagonal element's position is the same as the current line number
         */
        for (int i = 0; i < squareSize; i++) {
            currSquareLine = "%";
            if (i == 0 || i == (squareSize - 1)) {
                for (int j = 1; j < squareSize; j++) {
                    currSquareLine += squareElement;
                }
            } else {
                for (int j = 1; j < squareSize; j++) {
                    if (j == i) {
                        currSquareLine += squareElement;
                    } else if ( j == (squareSize - 1)) {
                        currSquareLine += squareElement;
                    } else {
                        currSquareLine += squareSpace;
                    }
                }
            }
            System.out.println(currSquareLine);
        }
    }
}
