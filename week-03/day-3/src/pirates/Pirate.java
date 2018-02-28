package pirates;

public class Pirate {
  private int drunkenness = 0;
  private boolean isDead = false;
  private boolean isCaptain = false;
  private boolean isPassedOut = false;
  
  public void drinkSomeRum() {
    drunkenness++;
  }
  
  public void die() {
    isDead = true;
  }
  
  public void brawl(Pirate pirateToBrawl){
    int chance = (int)(1 + (Math.random() * 3));
    if (isDead | pirateToBrawl.isDead) {
      System.out.println("They cannot fight. One if them is dead.");
    } else if ( isPassedOut | pirateToBrawl.isPassedOut ) {
      System.out.println("They cannot fight. One if them is passed out.");
    } else {
      brawlConditions(chance, this, pirateToBrawl);
    }
  }
  private void brawlConditions(int chance, Pirate callerPirate, Pirate pirateToBrawl) {
    if (chance == 1) {
      System.out.println("Pirate1 wins.");
      pirateToBrawl.die();
    } else if (chance == 2) {
      System.out.println("Pirate2 wins.");
      callerPirate.die();
    } else {
      System.out.println("They pass out.");
      callerPirate.isPassedOut = true;
      pirateToBrawl.isPassedOut = true;
    }
    }
  
  public void howsItGoingMate() {
    if (isDead) {
      System.out.println("The pirate's dead");
    } else if (isPassedOut) {
      System.out.println("The pirate's passed out!");
    } else {
      if (drunkenness < 5) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        System.out.println("The pirate passes out.");
        isPassedOut = true;
      }
    }
  }
  
  public void setAsCaptain() {
    isCaptain = true;
  }
  
  public int getDrunkenness() {
    return drunkenness;
  }
  
  public boolean isDead() {
    return isDead;
  }
  public String isDeadText() {
    if (isDead) {
      return "Dead";
    } else {
      return "";
    }
  }
  
  public boolean isPassedOut() {
    return isPassedOut;
  }
  
  public String isPassedOutText() {
    if (isPassedOut) {
      return "Passed Out";
    } else {
      return "";
    }
  }
}
