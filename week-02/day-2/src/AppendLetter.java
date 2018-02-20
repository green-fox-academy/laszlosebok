import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static String appendA(List<String> incompleteWords) {
        String output = "\"";
        for (String currentElement : incompleteWords) {
            output += currentElement + "a\", \"";
        }

        return output.substring(0, output.length()- 3);
    }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"