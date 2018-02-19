import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many parameters should there be?");
        int numberOfParameters = scanner.nextInt();
        String[] parameters = new String[numberOfParameters];
        scanner.nextLine();

        for (int i = 0; i < numberOfParameters; i++) {
            System.out.println("Please, enter a parameter: ");
            parameters[i] = scanner.nextLine();
        }
        printer(parameters);
    }

    public static void printer(String[] params) {
        String output = "printer(\"";
        for (int i = 0; i < params.length; i++) {
            if (i == (params.length - 1)) {
                output += params[i] + "\")";
            } else {
                output += params[i] + "\", \"";
            }
        }
        System.out.println(output);
    }
}
