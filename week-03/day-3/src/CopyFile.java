import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String copyThis = "file1.txt";
    String copyTo = "file2.txt";
    if (copyFiles(copyThis, copyTo)) {
      System.out.println(("The copying was successful!"));
    } else {
      System.out.println(("The copying was unsuccessful!"));
    }
  }
  public static boolean copyFiles(String file1, String file2) {
    Path sourcePath = Paths.get(file1);
    Path targetPath = Paths.get(file2);
    try {
      Files.copy(sourcePath, targetPath);
      return true;
    } catch (IOException IOE) {
      return false;
    }
  }
}
