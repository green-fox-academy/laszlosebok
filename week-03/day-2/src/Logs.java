import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static final String LOG_PATH_STRING = "log.txt";
  public static final int IP_INDEX = 1;
  public static final int POST_GET_INDEX = 2;
  
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    Path logPath = Paths.get(LOG_PATH_STRING);
  
    System.out.println((uniqueIPs(logPath)));
    System.out.println((postGetRatio(logPath)));
  }
  
  private static List<String> uniqueIPs(Path logPath) {
    List<String> IPaddresses = new ArrayList<>();
    try {
      for (String currentLine : Files.readAllLines(logPath)) {
        String currentIP = currentLine.split("   ")[IP_INDEX];
        if (!IPaddresses.contains(currentIP)) {
          IPaddresses.add(currentIP);
        }
      }
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
    return IPaddresses;
  }
  
  public static double postGetRatio(Path logPath) {
    int postCounter = 0;
    int getCounter = 0;
    try {
      for (String currentLine : Files.readAllLines(logPath)) {
        String currentPostGet = (currentLine.split("   ")[POST_GET_INDEX].split(" ")[0]);
        if ((currentPostGet).equals("POST")) {
          postCounter++;
        }
        if ((currentPostGet).equals("GET")) {
          getCounter++;
        }
      }
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
    return (postCounter / (double)(getCounter));
  }
}
