import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(reverse(aj)));
    }

    public static int[] reverse(int[] toReverse) {
        int[] reversed = Arrays.copyOf(toReverse, toReverse.length);
        int whereToPut = toReverse.length - 1;
        for (int currentElement : toReverse) {
            reversed[whereToPut] = currentElement;
            whereToPut--;
        }
        return reversed;

    }
}
