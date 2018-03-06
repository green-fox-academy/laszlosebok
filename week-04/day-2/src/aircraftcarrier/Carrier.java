package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> aircraftList;
  private int ammoStore;
  private int health;
  
  Carrier(int ammoStore, int health) {
    this.ammoStore = ammoStore;
    this.health = health;
    aircraftList = new ArrayList<>();
  }
  
  void addAircraft(String type) {
    if (type.equals("F16")) {
      aircraftList.add(new F16());
    } else {
      aircraftList.add(new F35());
    }
  }
  void fill() {
    if (ammoStore == 0) {
      System.out.println("There is no ammo on the ship.");
      return;
    }
    fillAircrafts();
  }
  
  void fillAircrafts (){
    for (Aircraft currentAircraft : aircraftList) {
      if (currentAircraft.getType().equals("F35")) {
        currentAircraft.refill(ammoStore);
      }
    }
  
    for (Aircraft currentAircraft : aircraftList) {
      if (currentAircraft.getType().equals("F16")) {
        currentAircraft.refill(ammoStore);
      }
    }
  }
  
  void fight(Carrier target) {
    for (Aircraft currentAircraft : aircraftList) {
      target.health -= currentAircraft.fight();
      if (target.health <= 0) {
        System.out.println("It's dead Jim :(");
        break;
      }
    }
  }
  
  void getStatus() {
    System.out.println("HP: " + health + ", Aircraft count: " + aircraftList.size() + ", Ammo " +
        "Storage: " + ammoStore + ", Total damage: " + countTotalDamage());
    System.out.println("Aircrafts: ");
    for (Aircraft currentAircraft : aircraftList) {
      currentAircraft.getStatus();
    }
  }
  
  private int countTotalDamage() {
    int totalDamage = 0;
    
    for (Aircraft currentAircraft : aircraftList) {
      totalDamage += currentAircraft.getTotalDamage();
    }
    return totalDamage;
  }
}
