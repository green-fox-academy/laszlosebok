package printable;

import comparable.Domino;
import comparable.Thing;

import java.util.ArrayList;
import java.util.List;

import static comparable.Dominoes.initializeDominoes;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
  
    for (Domino d : dominoes) {
      d.printAllFields();
    }
  
    List<Thing> things = createThingList();
    for (Thing t : things) {
      t.printAllFields();
    }
  }
  
  private static List<Thing> createThingList() {
    List<Thing> things = new ArrayList<>();
    
    Thing firstThing = new Thing("Get milk");
    things.add(firstThing);
    Thing secondThing = new Thing("Remove the obstacles");
    things.add(secondThing);
    Thing thirdThing = new Thing("Stand up");
    thirdThing.complete();
    things.add(thirdThing);
    Thing fourthThing = new Thing("Eat lunch");
    fourthThing.complete();
    things.add(fourthThing);
    return things;
  }
  
}
