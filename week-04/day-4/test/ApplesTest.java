import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  
  @Test
  public void getAppleTest() {
    Apples testApple = new Apples();
    assertEquals("apple", testApple.getApple());
  }
}