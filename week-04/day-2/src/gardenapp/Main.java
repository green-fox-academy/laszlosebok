package gardenapp;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    
    initGarden(myGarden);
    myGarden.getInfo();
    
    myGarden.water(40);
    myGarden.getInfo();
    
    myGarden.water(70);
    myGarden.getInfo();
  }
  
  private static void initGarden(Garden myGarden) {
    myGarden.addPlant(new Flower("yellow"));
    myGarden.addPlant(new Flower("blue"));
    myGarden.addPlant(new Tree("purple"));
    myGarden.addPlant(new Tree("orange"));
  }
}
