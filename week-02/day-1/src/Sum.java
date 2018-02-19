import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, Enter a number: ");
        int sumUntil = scanner.nextInt();
        sumUntil++;
        System.out.println(sum(sumUntil));
    }

    public static int sum(int lastNumber) {
        int summedNumbers = 0;
        for (int i = 0; i < lastNumber; i++) {
            summedNumbers += i;
        }
        return summedNumbers;
    }
}
