package flyable;

public class Helicopter extends Vehicle implements flyable.Flyable {
  
  public Helicopter(){
    super("Helicopter");
  }
  
  @Override
  public void fly() {
    System.out.println("The " + getType() + " is flying.");
  }
  
  @Override
  public void land() {
    System.out.println("The " + getType() + " lands on the ground.");
  }
  
  @Override
  public void takeOff() {
    System.out.println("The " + getType() + " starts spinning its rotor.");
  }
}
