import flyable.Helicopter;
import main.java.animals.Bird;

public class FlyApp {
  public static void main(String[] args) {
    Helicopter helicopter = new Helicopter();
    
    helicopter.takeOff();
    helicopter.fly();
    helicopter.land();
  
    Bird bird = new Bird("Eagle");
    
    bird.takeOff();
    bird.fly();
    bird.land();
  }
}
