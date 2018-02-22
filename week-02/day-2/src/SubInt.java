import java.util.ArrayList;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
    public static List<Integer> subInt(int searched, int[] arrayOfNumbers ) {
        List<Integer> hasSearched = new ArrayList<>();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            boolean foundIt = false;
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    foundIt = (searched == arrayOfNumbers[i] % 10);
                    if (foundIt) {
                        break;
                    }
                }
                if ((arrayOfNumbers[i]/(int)(Math.pow(10, j)) != 0)) {
                    foundIt = (searched == (arrayOfNumbers[i]/(int)(Math.pow(10, j))));
                }
                if (foundIt){
                    break;
                }
            }
            if (foundIt) {
                hasSearched.add(i);
            }
        }
        return hasSearched;
    }
}