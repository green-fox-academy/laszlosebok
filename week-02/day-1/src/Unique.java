import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] unique (int[] numberArray) {
        int[] sortedArray = sort(numberArray);
        int countUnique = 1;
        for (int i = 1; i < sortedArray.length; i++) {
            if ( sortedArray[i] != sortedArray[i-1]) {
                countUnique += 1;
            }
        }
        int[] uniqueArray = new int[countUnique];
        int nextPosInUniqueAr = 1;
        uniqueArray[0] = sortedArray[0];
        for (int i = 1; i < sortedArray.length; i++) {
            if ( sortedArray[i] != sortedArray[i-1]) {
                uniqueArray[nextPosInUniqueAr] = sortedArray[i];
                nextPosInUniqueAr++;
            }
        }
        return uniqueArray;
    }

    public static int[] sort (int[] toBeSorted) {
        int[] sortedArray = Arrays.copyOf(toBeSorted, toBeSorted.length);
        int tempStorage;
        boolean foundSortable = false;
        do {
            foundSortable = false;
            for (int i = 1; i < sortedArray.length; i++) {
                if ( sortedArray[i] < sortedArray[i-1]) {
                    tempStorage = sortedArray[i-1];
                    sortedArray[i-1] = sortedArray[i];
                    sortedArray[i] = tempStorage;
                    foundSortable = true;
                }
            }
        }while(foundSortable);
        return  sortedArray;
    }
}