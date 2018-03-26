import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquareValues {
  
  // Write a Stream Expression to find which number squared value is more then 20
  // from the following array:
  
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
  
    List<Integer> squaresAboveLimit = numbers
        .stream()
        .map(i -> i * i)
        .filter(i -> i > 20)
        .collect(Collectors.toList());
  
    System.out.println(squaresAboveLimit);
  }
}
