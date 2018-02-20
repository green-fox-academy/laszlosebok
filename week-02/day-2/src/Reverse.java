public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.





        System.out.println(reverse(reversed));
    }

    public static String reverse( String toReverse) {
        int backWardsCounter = toReverse.split("").length;
        String[] toReverseAndJoin = new String [backWardsCounter];
        for (String element : toReverse.split("")) {
            toReverseAndJoin[backWardsCounter - 1] = element;
            backWardsCounter--;
        }
        String reversed = "";
        for (String currChar : toReverseAndJoin) {
            reversed += currChar;
        }
        return reversed;
    }
}