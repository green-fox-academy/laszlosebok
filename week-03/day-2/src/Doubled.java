import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static final String FILE_STRING_PATH = "duplicated-chars.txt";
  
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get(FILE_STRING_PATH);
    decrypt(filePath);
  }
  public static void decrypt(Path filePath) {
    Path decryptedPath = Paths.get("decrypted-chars.txt");
    List<String> decryptedList = new ArrayList<>();
    try {
      for (String currentLine : Files.readAllLines(filePath)) {
        String decryptedLine = "";
        for (int i = 0; i < currentLine.length(); i += 2) {
          decryptedLine += currentLine.charAt(i);
        }
        decryptedList.add(decryptedLine);
      }
      Files.write(decryptedPath, decryptedList);
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
    
  }
}