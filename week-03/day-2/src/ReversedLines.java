import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static final String TO_REVERSE_STRING_PATH = "reversed-lines.txt";
  public static final String REVERSED_STRING_PATH = "reversed.txt";
  
  
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    Path filePath = Paths.get(TO_REVERSE_STRING_PATH);
    Path reversedPath = Paths.get(REVERSED_STRING_PATH);
    List<String> reversedList = new ArrayList<>();
    try {
      for (String currentLine : Files.readAllLines(filePath)) {
        reversedList.add(reverseLine(currentLine));
      }
      Files.write(reversedPath, reversedList);
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
  }
  public static String reverseLine( String toReverse) {
    String reversed = "";
    for (int index = toReverse.length() - 1; index > -1 ; index--) {
      reversed += toReverse.charAt(index);
    }
    return reversed;
  }
}