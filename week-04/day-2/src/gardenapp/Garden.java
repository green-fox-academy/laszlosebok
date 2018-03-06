package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  
  private List<Plant> plantsInGarden;
  
  Garden() {
    plantsInGarden = new ArrayList<>();
  }
  
  public void addPlant(Plant plant) {
    plantsInGarden.add(plant);
  }
  
  public void water(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    double divider = countWaterable(this);
    double waterPerPlant = waterAmount / divider;
    this.waterPlants(waterPerPlant);
  }
  
  private void waterPlants(double waterPerPlant) {
    for (Plant currentPlant : this.plantsInGarden) {
      if (currentPlant.isWaterable()) {
        currentPlant.waterPlant(waterPerPlant);
      }
    }
  }
  
  private double countWaterable(Garden garden) {
    double counter = 0;
    
    for (Plant currentPlant : garden.plantsInGarden) {
      if (currentPlant.isWaterable()) {
        counter++;
      }
    }
    return counter;
  }
  
  public void getInfo() {
    for (Plant currentPlant : plantsInGarden) {
      String needsWater;
      if (currentPlant.isWaterable()) {
        needsWater = " needs water.";
      } else {
        needsWater = " doesn't need water.";
      }
      System.out.println("The " + currentPlant.getColor() + " " + currentPlant.getType() + " " +
          needsWater);
    }
    System.out.println();
  }
}
