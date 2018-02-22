import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please type in the expression:");
            System.out.println("Or press enter to Exit.");
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            System.out.println(calculate(userInput));
        }
    }
    public static int calculate(String task) {
        String[] operationSet = task.split(" ");
        int a = Integer.parseInt(operationSet[1]);
        int b = Integer.parseInt(operationSet[2]);

        if (operationSet[0].equals("*")) {
           return a * b;
        } else if (operationSet[0].equals("/")) {
            return a / b;
        } else if (operationSet[0].equals("+")) {
            return a + b;
        } else if (operationSet[0].equals("-")) {
            return a - b;
        } else if (operationSet[0].equals("%")) {
            return a % b;
        } else {
            return 0;
        }
    }
}