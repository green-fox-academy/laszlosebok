import java.util.ArrayList;
import java.util.List;

public class Sum {
  
  private List<Integer> listOfNumbers = new ArrayList<>();
  
  public void addToList(int number) {
    listOfNumbers.add(number);
  }
  
  public int getSum() {
    return sumList(listOfNumbers);
  }
  
  public int getSum(List<Integer> numberList) {
    return sumList(numberList);
  }
  
  private int sumList(List<Integer> numberList) {
    int sum = 0;
  
    for (Integer currentNumber : numberList) {
      sum += currentNumber;
    }
    return sum;
    
  }
}
