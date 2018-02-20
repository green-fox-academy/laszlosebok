public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String fixedQuote = "";
        String toAdd = "always takes longer than";
        String[] splitQuote = quote.split(" ");
        for (int i = 0; i < splitQuote.length; i++) {
            if (i == 3) {
                fixedQuote += " " + toAdd;
            }
            fixedQuote += " " + splitQuote[i];
        }

        quote = fixedQuote;

        System.out.println(quote);
    }
}