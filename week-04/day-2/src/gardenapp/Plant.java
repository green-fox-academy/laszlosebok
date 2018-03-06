package gardenapp;

public class Plant {
  
  private String color;
  private double waterlevel;
  private String type;
  
  Plant(String color) {
    this.color = color;
    waterlevel = 0;
  }
  
  public boolean isWaterable() {
    if (this instanceof Tree) {
      return (this.getWaterlevel() < 10);
    } else {
      return (this.getWaterlevel() < 5);
    }
  }
  
  public void waterPlant(double waterAmount) {
    if (this instanceof Tree) {
      ((Tree) this).water(waterAmount);
    } else {
      ((Flower) this).water(waterAmount);
    }
  }
  
  // Getters & Setters
  public String getType() {
    return type;
  }
  
  void setType(String type) {
    this.type = type;
  }
  
  public String getColor() {
    return color;
  }
  
  void setWaterlevel(double waterlevel) {
    this.waterlevel = waterlevel;
  }
  
  double getWaterlevel() {
    return waterlevel;
  }
}
