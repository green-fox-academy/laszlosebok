import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  
  @Test
  public void fiboTest() {
    assertEquals(3, Fibonacci.fibo(4));
  }
  
  @Test
  public void fiboZeroTest () {
    assertEquals(0, Fibonacci.fibo(0));
  }
  
  @Test
  public void fiboNegativeTest() {
    assertEquals(0, Fibonacci.fibo(-1));
  }
}