package farm;

public class Main {
  public static void main(String[] args) {
    // Creates a farm with 7 animals.
    Farm myFarm = new Farm();
    for (int i = 0; i < 7; i++) {
      myFarm.addAnimal();
    }
    
    // Breeds 3 times to reach max slot
    System.out.println(myFarm.getAnimalsInFarm().size());
    for (int i = 0; i < 3; i++) {
      myFarm.breed();
    }
    System.out.println(myFarm.getAnimalsInFarm().size());
    
    // It shouldn't breed this time due to no available slot
    myFarm.breed();
    System.out.println(myFarm.getAnimalsInFarm().size());
  
    // Slaughters 2 animals
    for (int i = 0; i < 2; i++) {
      myFarm.slaughter();
    }
    System.out.println(myFarm.getAnimalsInFarm().size());
  }
}
