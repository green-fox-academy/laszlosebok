package sharpie_set;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Sharpie> listOfSharpies = new ArrayList<>();
    Sharpie blueSharpie = new Sharpie("blue", 3);
    Sharpie yellowSharpie = new Sharpie("yellow", 3);
    Sharpie redSharpie = new Sharpie("red", 3);
    Sharpie blackSharpie = new Sharpie("black", 3);
    Sharpie pinkSharpie = new Sharpie("pink", 3);
    
    pinkSharpie.useAllInk();
    redSharpie.useAllInk();
    
    listOfSharpies.add(blueSharpie);
    listOfSharpies.add(yellowSharpie);
    listOfSharpies.add(redSharpie);
    listOfSharpies.add(blackSharpie);
    listOfSharpies.add(pinkSharpie);
  
    System.out.println(SharpieSet.countUsable(listOfSharpies));
  }
}
