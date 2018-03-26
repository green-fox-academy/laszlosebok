import java.util.List;
import java.util.stream.Collectors;

public class FindUppercase {
  
  //Write a Stream Expression to find the uppercase characters in a string!
  
  public static void main(String[] args) {
    String s = "This is a String tHat hAs a few upPerCase letTers.";
    
    // [T, S, H, A, P, C, T]
    List<Character> uppercaseLetters = s.chars()
        .filter(i -> i > 64 && i < 91)
        .mapToObj(i -> (char)i)
        .collect(Collectors.toList());
  
    System.out.println(uppercaseLetters);
  }
}
