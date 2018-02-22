import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }
    public static String bubble (int[] toBeSorted) {
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
        return  Arrays.toString(sortedArray);
    }
    public static String advancedBubble(int[] toBeSorted, boolean order) {
        if (!order) {
            return bubble (toBeSorted);
        } else {
            int[] sortedArray = Arrays.copyOf(toBeSorted, toBeSorted.length);
            int tempStorage;
            boolean foundSortable = false;
            do {
                foundSortable = false;
                for (int i = 1; i < sortedArray.length; i++) {
                    if ( sortedArray[i] > sortedArray[i-1]) {
                        tempStorage = sortedArray[i-1];
                        sortedArray[i-1] = sortedArray[i];
                        sortedArray[i] = tempStorage;
                        foundSortable = true;
                    }
                }
            }while(foundSortable);
            return  Arrays.toString(sortedArray);
        }
    }
}