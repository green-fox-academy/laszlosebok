import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  
  Sum sumObj = new Sum();
  List<Integer> listOfNumbers;
  
  @Test
  public void getSumTest() {
    listOfNumbers = new ArrayList<>(Arrays.asList(10, 5, 32, 3, 44));
    assertEquals(94, sumObj.getSum(listOfNumbers));
  }
  
  @Test
  public void getSumTestWithEmptyList() {
    listOfNumbers = new ArrayList<>(Arrays.asList());
    assertEquals(0, sumObj.getSum(listOfNumbers));
  }
  
  @Test
  public void getSumTestWithOneElement() {
    listOfNumbers = new ArrayList<>(Arrays.asList(2));
    assertEquals(2, sumObj.getSum(listOfNumbers));
  }
  
  @Test
  public void getSumTestWithMultiElements() {
    listOfNumbers = new ArrayList<>(Arrays.asList(3, 7, 4, 2));
    System.out.println(listOfNumbers);
    assertEquals(16, sumObj.getSum(listOfNumbers));
  }
  
  @Test (expected = NullPointerException.class)
  public void getSumTestWithNull() {
    listOfNumbers = null;
    assertEquals(0, sumObj.getSum(listOfNumbers));
  }
}