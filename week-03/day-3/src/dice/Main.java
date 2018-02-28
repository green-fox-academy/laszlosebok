package dice;

public class Main {
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();
    checkDices(myDice);
    System.out.println(myDice.toString());
  }
  
  public static void checkDices(Dice myDice) {
    for (int index = 0; index < myDice.getCurrent().length; index++) {
      if (myDice.getCurrent(index) != 6) {
        reRollUntil6(myDice, index);
      }
    }
  }
  public static void reRollUntil6(Dice myDice, int index) {
    boolean isSix = false;
    while (!isSix) {
      myDice.reroll(index);
      if (myDice.getCurrent(index) == 6) {
        isSix = true;
      }
    }
  }
}
