import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static final String ENCODED_STRING_PATH = "encoded-lines.txt";
  public static final String DECODED_STRING_PATH = "decoded-lines.txt";
  
  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    Path filePath = Paths.get(ENCODED_STRING_PATH);
    decryptFile(filePath);
  }
  public static void decryptFile(Path filePath) {
    Path decodedPath = Paths.get(DECODED_STRING_PATH);
    List<String> decodedLines = new ArrayList<>();
    try {
      for (String currentLine : Files.readAllLines(filePath)) {
        decodedLines.add(decryptLine(currentLine));
      }
      Files.write(decodedPath, decodedLines);
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
  }
  public static String decryptLine(String lineToDecode) {
    String decodedLine = "";
    String[] tempArr = lineToDecode.split(" ");
    for (int i = 0; i < tempArr.length; i++) {
      for (int j = 0; j < tempArr[i].length(); j++) {
        decodedLine += (char)(tempArr[i].charAt(j) - 1);
      }
      decodedLine += " ";
    }
    return decodedLine;
  }
}