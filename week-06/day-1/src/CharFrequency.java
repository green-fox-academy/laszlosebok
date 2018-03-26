import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
  // Write a Stream Expression to find the frequency of characters in a given string!
  
  public static void main(String[] args) {
    String s = "This is an example string that is full of gibberish";
  
    Map<Character, Long> charFrequencyMap = s.chars()
        .mapToObj(i -> (char)i)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  
    System.out.println(charFrequencyMap);
  }
}
