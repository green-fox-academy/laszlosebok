import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class OddAvg {
  // Write a Stream Expression to get the average value of the odd numbers from the following array:
  
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
        1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14
    ));
  
    //ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, -4, -10, 2, 6, 8));
    
    OptionalDouble avg = numbers
        .stream()
        .filter(i -> i % 2 == 1)
        .mapToInt(i -> i)
        .average();
  
    System.out.println(avg.isPresent() ? avg.getAsDouble() : "Couldn't get an average with these " +
        "conditions");
  }
}
