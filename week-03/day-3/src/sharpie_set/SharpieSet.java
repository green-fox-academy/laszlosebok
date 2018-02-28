package sharpie_set;

import java.util.List;

public class SharpieSet {
  
  public static int countUsable(List<Sharpie> sharpieList) {
    int counter = 0;
    for (Sharpie currentSharpie : sharpieList) {
      if (currentSharpie.getInkAmount() > 0) {
        counter++;
      }
    }
    return counter;
  }
  public static List<Sharpie> removeThrash(List<Sharpie> sharpieList) {
    for (int i = (sharpieList.size() - 1); i > -1 ; i--) {
      if (sharpieList.get(i).getInkAmount() <= 0) {
        sharpieList.remove(i);
      }
    }
    return sharpieList;
  }
}
