import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
  
  String testString;
  
  @Test
  public void letterCounterTest() {
    testString = "This is a nice string";
    assertEquals((Integer) 3, CountLetters.letterCounter(testString).get('s'));
  }
  
  @Test
  public void letterCounterNegativeTest () {
    testString = "this string doesn't have a that character";
    assertEquals(null, CountLetters.letterCounter(testString).get('q'));
  }
  
  @Test
  public void letterCounterWhitespaceTest () {
    testString = "this string has a lot of whitespace";
    assertEquals(null, CountLetters.letterCounter(testString).get(' '));
  }
  
  @Test (expected = NullPointerException.class)
  public void letterCounterNullTest() {
    testString = null;
    assertEquals((Integer) 0, CountLetters.letterCounter(testString).get(' '));
  }
  
  @Test
  public void letterCounterOnlyOneLetterTest() {
    testString = "ssssss";
    assertEquals((Integer) 6, CountLetters.letterCounter(testString).get('s'));
  }
}