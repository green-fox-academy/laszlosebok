import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;

import java.util.HashMap;
import java.util.Map;

public class Trees {
  public static void main(String[] args) {
    Map<String, Object> treeOne = new HashMap<>();
    treeOne.put("type", "Birch");
    treeOne.put("leaf color", "Green");
    treeOne.put("age", 30);
    treeOne.put("sex", "Monoecious");
  
    Map<String, Object> treeTwo = new HashMap<>();
    treeTwo.put("type", "Oak");
    treeTwo.put("leaf color", "Green");
    treeTwo.put("age", 10);
    treeTwo.put("sex", "Monoecious");
  
    Map<String, Object> treeThree = new HashMap<>();
    treeThree.put("type", "Pine");
    treeThree.put("leaf color", "Green");
    treeThree.put("age", 15);
    treeThree.put("sex", "Monoecious");
  
    Map<String, Object> treeFour = new HashMap<>();
    treeFour.put("type", "Poplar");
    treeFour.put("leaf color", "Green");
    treeFour.put("age", 100);
    treeFour.put("sex", "Dioecious");
  
    Map<String, Object> treeFive = new HashMap<>();
    treeFive.put("type", "Acacias");
    treeFive.put("leaf color", "Green");
    treeFive.put("age", 103);
    treeFive.put("sex", "Monoecious");
  }
}
