package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  private List<Ship> shipList = new ArrayList<>();
  
  
  Armada (int numberOfShips) {
    for (int index = 0; index < numberOfShips; index++) {
      shipList.add(new Ship());
      shipList.get(index).fillShip();
    }
  }
  
  public void war(Armada otherArmada) {
    int shipsLeftInFirst = this.shipList.size();
    int shipsLeftInSecond = otherArmada.shipList.size();
    int battleNumber = 1;
    
    while(shipsLeftInFirst > 0 && shipsLeftInSecond > 0) {
      System.out.println(battleNumber);
      battleNumber++;
      Ship nextShipInFirst = this.shipList.get(0);
      Ship nextShipInSecond = otherArmada.shipList.get(0);
      
      if (nextShipInFirst.battle(nextShipInSecond)) {
        System.out.println("First ship won the battle!");
        otherArmada.shipList.remove(0);
        shipsLeftInSecond--;
      } else {
        System.out.println("Second ship won the battle!");
        this.shipList.remove(0);
        shipsLeftInFirst--;
      }
    }
    evaluateResult(shipsLeftInFirst, shipsLeftInSecond);
  }
  
  private void evaluateResult(int firstLeft, int secondLeft) {
    if (firstLeft == 0) {
      System.out.println("The second Armada won");
    } else if (secondLeft == 0) {
      System.out.println("The first Armada won");
    } else {
      System.out.println("Something went wrong... HARRR!");
    }
  }
  
  private static void printShipDetails(Ship fromFirstArmada, Ship fromSecondArmada) {
    System.out.println(fromFirstArmada);
    System.out.println(fromSecondArmada);
  }
}
