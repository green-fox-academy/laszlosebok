public class SubStrList {
    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        //  Example
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("ching", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
    }
    public static int subStrList(String stringPart, String[] wordsToSearch) {
        for (int i = 0; i < wordsToSearch.length; i++) {
            boolean foundIt = false;
            if (wordsToSearch[i].length() > (stringPart.length()-1)) {
                foundIt = subStringCheck(stringPart, wordsToSearch[i]);
            }
            if (foundIt) {
                return i;
            }
        }
        return -1;
    }
    public static boolean subStringCheck(String stringPart, String stringToSplit) {
        int stringLength = stringPart.length();
        for (int i = 0; i < (stringToSplit.length()-(stringLength-1)); i++) {
            String currentSubString = stringToSplit.substring(i, i+stringLength);
            if (stringPart.equals(currentSubString)) {
                return true;
            }
        }
        return false;
    }
}