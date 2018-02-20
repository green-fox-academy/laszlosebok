import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        List<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }
    public static String quoteSwap(List<String> quoteToFix){
        String fixedQuote = "\"";
        String tempStorage = quoteToFix.get(2);
        quoteToFix.set(2, quoteToFix.get(5));
        quoteToFix.set(5, tempStorage);

        for (String currentElement : quoteToFix) {
            fixedQuote += currentElement + " ";
        }
        fixedQuote = fixedQuote.substring(0,fixedQuote.length()-1) + "\"";

        return fixedQuote;
    }
}