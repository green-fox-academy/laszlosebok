package pirates;

public class Main {
  public static void main(String[] args) {
    Pirate pirateJoe = new Pirate();
    Pirate pirateSam = new Pirate();
    Pirate pirateJack = new Pirate();
    
    // Drunkenness test
    for (int i = 0; i < 4; i++) {
      pirateSam.drinkSomeRum();
    }
    pirateSam.howsItGoingMate();
    pirateSam.drinkSomeRum();
    pirateSam.howsItGoingMate();
    pirateSam.howsItGoingMate();
    System.out.println("------");
    
    // Brawl test
    pirateJack.brawl(pirateSam);
    pirateJack.howsItGoingMate();
    pirateJack.brawl(pirateJoe);
    pirateJack.brawl(pirateJoe);
    System.out.println("------");
    
    // Ship battle test
    Ship ship1 = new Ship();
    Ship ship2 = new Ship();
    ship1.fillShip();
    ship2.fillShip();
  
  
    System.out.println(ship1.toString());
    System.out.println(ship2.toString());
  
    if (ship1.battle(ship2)) {
      System.out.println("The first ship won.");
    } else {
      System.out.println("The second ship won.");
    }
  
    System.out.println(ship1.toString());
    System.out.println(ship2.toString());
  }
}
