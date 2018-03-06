package gardenapp;

public class Tree extends Plant {
  
  private static final double WATER_ABSORPTION = 0.4;
  
  
  Tree(String color){
    super(color);
    this.setType("Tree");
  }
  
  public void water(double waterAmount) {
    this.setWaterlevel(this.getWaterlevel() + waterAmount * WATER_ABSORPTION);
  }
}
