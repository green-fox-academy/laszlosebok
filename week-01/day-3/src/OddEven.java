import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
