import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
  
  public static int fibo(int n) {
    List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0, 1));
    
    if (n < 0) {
      return 0;
    }
    for (int i = 2; i < n + 1; i++) {
      fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
    }
    return fibonacci.get(n);
  }
}
