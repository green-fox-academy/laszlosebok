import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  
  @Test
  public void anagramCheckerTest() {
    assertTrue(Anagram.anagramChecker("anagrams", "Ars magna"));
  }
  
  @Test
  public void anagramCheckerNegativeTest() {
    assertFalse(Anagram.anagramChecker("dog", "cat"));
  }
  
  @Test
  public void anagramCheckerEmptyTest() {
    assertFalse(Anagram.anagramChecker("", "cat"));
  }
  
  @Test
  public void anagramCheckerEmptierTest() {
    assertTrue(Anagram.anagramChecker("", ""));
  }
  
  @Test (expected = NullPointerException.class)
  public void anagramCheckerNullTest() {
    assertTrue(Anagram.anagramChecker(null, null));
  }
}