import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  
  private static Map<Character, Integer> mapOfString;
  
  public static Map<Character, Integer> letterCounter(String s) {
    mapOfString = new HashMap<>();
    
    String modifiedString = stringPrep(s);
    charsToMap(modifiedString);
    
    return mapOfString;
  }
  
  private static String stringPrep(String s) {
    char[] tempArray = s.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray).trim().toLowerCase();
  }
  
  private static void charsToMap(String s) {
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (mapOfString.containsKey(ch)) {
        mapOfString.put(ch, mapOfString.get(ch) + 1);
      } else {
        mapOfString.put(ch, 1);
      }
    }
  }
}
