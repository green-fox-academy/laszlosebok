package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  private List<Pirate> shipCrew = new ArrayList<>();
  private int captainIndex = 0;
  
  public void fillShip() {
    int minCrewRandom = 5;
    int maxCrewRandom = 16;
    int crewSize = (int)(minCrewRandom + Math.random() * maxCrewRandom);
    for (int i = 0; i < crewSize; i++) {
      shipCrew.add(new Pirate());
    }
    setCaptain();
  }
  
  private void setCaptain() {
    int indexOfCaptain = (int)(Math.random() * shipCrew.size());
    shipCrew.get(indexOfCaptain).setAsCaptain();
    captainIndex = indexOfCaptain;
  }
  
  @Override
  public String toString() {
    List<Object> statuses = captainStatus(captainIndex, shipCrew);
    int counter = aliveCounter(shipCrew);
    
    return "Ship:\n" +
      "Captain's rum consumption: =" + statuses.get(0) +"\n" +
      "Captain's state(s): " + statuses.get(1) + " " + statuses.get(2) + "\n" +
      "Number of alive pirates in crew: " + counter;
    }
  
  private int aliveCounter(List<Pirate> shipCrew) {
    int counter = 0;
    for (Pirate currentPirate : shipCrew) {
      if (!currentPirate.isDead()) {
        counter++;
      }
    }
    return counter;
  }
  
  private List<Object> captainStatus(int captainIndex, List<Pirate> shipCrew) {
    Pirate captain = shipCrew.get(captainIndex);
    
    List<Object> statuses = new ArrayList<>();
    statuses.add(captain.getDrunkenness());
    statuses.add(captain.isDeadText());
    statuses.add(captain.isPassedOutText());
    
    return statuses;
  }
  
  private int getCaptainIndex() {
    return captainIndex;
  }
  
  private List<Pirate> getShipCrew() {
    return shipCrew;
  }
  
  public boolean battle(Ship otherShip) {
    int[] shipScores = calculateScore(this, otherShip);
    
    if (shipScores[0] > shipScores[1]) {
      otherShip.addDeaths();
      this.haveParty();
      return true;
    } else {
      this.addDeaths();
      otherShip.haveParty();
      return false;
    }
  }
  private int[] calculateScore(Ship thisShip, Ship otherShip) {
    List<Pirate> thisShipCrew = thisShip.getShipCrew();
    List<Pirate> otherShipCrew = otherShip.getShipCrew();
    
    int[] shipScores = new int[2];
    shipScores[0] = aliveCounter(thisShipCrew) - thisShipCrew.get(thisShip.getCaptainIndex()).getDrunkenness();
    shipScores[1] = aliveCounter(otherShipCrew) - otherShipCrew.get(otherShip.getCaptainIndex()).getDrunkenness();
    
    return shipScores;
    
  }
  
  private void addDeaths() {
    int aliveCrew = aliveCounter(shipCrew);
    int deaths = (int)(1 + Math.random() * aliveCrew);
    System.out.println("The death toll on the loser ship is: " + deaths);
    if (aliveCrew > 0) {
      for (int i = 0; i < shipCrew.size(); i++) {
        if(!shipCrew.get(i).isDead()) {
          shipCrew.get(i).die();
          deaths--;
        }
        if (deaths <= 0) {
          break;
        }
      }
    }
  }
  
  private void haveParty(){
    int maxRandom = 20;
    int minRandom = 5;
    int rumsToDrink = (int)(minRandom + Math.random() * maxRandom);
    System.out.println("The crew of the winner's ship gets to drink: " + rumsToDrink + " flasks of rum.");
    while (rumsToDrink > 0) {
      int pirateIndex = (int)(Math.random() * shipCrew.size());
      shipCrew.get(pirateIndex).drinkSomeRum();
      rumsToDrink--;
    }
  }
}
