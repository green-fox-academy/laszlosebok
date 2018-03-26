import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToString {
  
  // Write a Stream Expression to convert a char array to a string!
  
  public static void main(String[] args) {
    
    char[] chars = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'c', 'h', 'a', 'r', '-',
        's', 'e', 'q', 'u', 'e', 'n', 'c', 'e', '.'
    };
    
    // Using String constructor
    String s = new String(chars);
    
    // Using streams
    Stream<Character> cStream = IntStream.range(0, chars.length).mapToObj(i -> chars[i]);
    String s2 = cStream
        .map(Object::toString)
        .collect(Collectors.joining(""));
  
    System.out.println(s);
    System.out.println(s2);
    
  }
}
