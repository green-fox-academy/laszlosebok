import java.util.Scanner;

public class DivideByZero {
  
  public static final int DIVIDE_THIS = 10;
  
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
  
    System.out.println("Please enter a number to divide ten with: ");
    int divideWith = userInput.nextInt();
  
    System.out.println(divider(divideWith));
  }
  public static int divider(int divideWith) {
    int result = 0;
    try {
      result = (DIVIDE_THIS / divideWith);
    } catch (ArithmeticException AE) {
      System.out.println(("Cannot divide by zero!"));
      System.exit(-1);
    }
    return result;
  }
}
