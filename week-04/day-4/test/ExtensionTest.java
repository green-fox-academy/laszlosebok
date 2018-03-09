import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtensionTest {
  
  Extension extension = new Extension();
  
  @Test
  public void testAdd_2and3is5() {
    assertEquals(5, extension.add(3, 3));
  }
  
  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 5));
  }
  
  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(2, 4, 3));
  }
  
  @Test
  public void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 1));
  }
  
  @Test
  public void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,2,2)));
  }
  
  @Test
  public void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,2,3,4,5)));
  }
  
  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }
  
  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }
  
  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }
  
  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}