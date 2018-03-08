import java.util.Arrays;

public class Anagram {
  
  public static boolean anagramChecker(String baseWord, String compare) {
    baseWord = sort(baseWord);
    compare = sort(compare);
    return (baseWord.equals(compare));
  }
  
  private static String sort(String sortThis) {
    char[] tempArray = sortThis.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray).toLowerCase().trim();
  }
}
