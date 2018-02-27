import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static final String TO_REVERSE_STRING_PATH = "reversed-order.txt";
  public static final String REVERSED_STRING_PATH = "reversed.txt";
  
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    Path filePath = Paths.get(TO_REVERSE_STRING_PATH);
    reverseOrder(filePath);
  }
  
  public static void reverseOrder(Path filePath) {
    List<String> reversedList = new ArrayList<>();
    Path targetPath = Paths.get(REVERSED_STRING_PATH);
    
    try {
      List<String> toReverse = Files.readAllLines(filePath);
      for (int line = toReverse.size() - 1; line > -1; line-- ) {
        reversedList.add(toReverse.get(line));
      }
      Files.write(targetPath, reversedList);
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
  }
}