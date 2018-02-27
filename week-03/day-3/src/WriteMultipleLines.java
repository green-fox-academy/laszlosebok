import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  
  public static final String PATH_STRING = "my-file.txt";
  
  public static Scanner userInput = new Scanner(System.in);
  
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number paramter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    Path filePath = Paths.get(PATH_STRING);
    System.out.println("Please enter a string: ");
    String userString = userInput.nextLine();
    System.out.println("Please enter an integer: ");
    int userNumber = userInput.nextInt();
    writeMultiple(filePath, userString, userNumber);
  }
  public static void writeMultiple(Path filePath, String wordToWrite, int lines) {
    List<String> writeToFile = new ArrayList<>();
    for (int i = 0; i < lines; i++) {
      writeToFile.add(wordToWrite);
    }
    try {
      Files.write(filePath, writeToFile);
    } catch (IOException IOE) {
      System.out.println(("Couldn't write to file!"));
    }
  }
}
