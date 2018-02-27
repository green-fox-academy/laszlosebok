import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    String filePathString = "my-file.txt";
    counter(filePathString);
    System.out.println(counter(filePathString));
  }
  public static int counter(String pathString) {
    Path path = Paths.get(pathString);
    int lineCounter = 0;
    try {
      for (String currentLine : Files.readAllLines(path)) {
        lineCounter++;
      }
    } catch (IOException IOE) {
      return 0;
    }
    return lineCounter;
  }
}
