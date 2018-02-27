import java.io.IOException;
import java.nio.file.*;


public class PrintEachLine {
  
  public static final String myFilePath = "my-file.txt";
  
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    Path filePath = Paths.get(myFilePath);
    
    try {
      for (String currentLine : Files.readAllLines(filePath)){
        System.out.println(currentLine);
      }
    } catch (IOException IOE) {
      System.out.println("Unable to read file: my-file.txt");
    }
    
  }
}