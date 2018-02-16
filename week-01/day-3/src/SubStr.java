public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
    }

    public static int subStr(String input, String q) {
        int position = 0;
        String[] splitStr = input.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].equals(q)) {
                position += i;
                for (int j = 0; j < i; j++) {
                    position += splitStr[j].length();
                }
                return position;
            }
        }
        return -1;
    }
}