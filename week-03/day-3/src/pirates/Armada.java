package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> shipList = new ArrayList<>();
  
  
  Armada (int numberOfShips) {
    for (int index = 0; index < numberOfShips; index++) {
      shipList.add(new Ship());
      shipList.get(index).fillShip();
    }
  }
  
  public void war(Armada otherArmada) {
    
    for (Ship currentShip : this.shipList) {
      for (int i = 0; i < otherArmada.shipList.size(); i++) {
        System.out.println("Details before fight:");
        printShipDetails(currentShip, otherArmada.shipList.get(i));
        if (!currentShip.battle(otherArmada.shipList.get(i))) {
          System.out.println("Ship of the second Armada won.");
          System.out.println("Details after fight:");
          printShipDetails(currentShip, otherArmada.shipList.get(i));
          
          break;
        }
        System.out.println("Ship of the first Armada won.");
        System.out.println("Details after fight:");
        printShipDetails(currentShip, otherArmada.shipList.get(i));
      }
    }
  }
  private static void printShipDetails(Ship fromFirstArmada, Ship fromSecondArmada) {
    System.out.println(fromFirstArmada);
    System.out.println(fromSecondArmada);
  }
}
