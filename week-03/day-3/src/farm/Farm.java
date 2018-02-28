package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  
  private List<Animal> animalsInFarm = new ArrayList<>();
  private int slots = 10;
  
  public void addAnimal() {
    this.animalsInFarm.add(new Animal());
    slots--;
  }
  
  public void breed() {
    if (slots > 0) {
      this.animalsInFarm.add(new Animal());
    }
    slots--;
  }
  public void slaughter() {
    int highestHunger = 0;
    int highestHungerIndex = 0;
    for (int index = 0; index < animalsInFarm.size(); index++) {
      int currentHunger = animalsInFarm.get(index).getHunger();
      if (highestHunger < currentHunger) {
        highestHunger = currentHunger;
        highestHungerIndex = index;
      }
    }
    animalsInFarm.remove(highestHungerIndex);
  }
  public List<Animal> getAnimalsInFarm() {
    return animalsInFarm;
  }
}
