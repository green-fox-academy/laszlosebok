import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteSingleLine {
  public static final String MY_FILE_PATH = "my-file.txt";
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    Path filePath = Paths.get(MY_FILE_PATH);
    ArrayList<String> myName = new ArrayList<>(Arrays.asList("Sebok Laszlo"));
    try {
      Files.write(filePath, myName);
    } catch (IOException IOE) {
      System.out.println("Unable to write file: my-file.txt");
    }
    
  }
}