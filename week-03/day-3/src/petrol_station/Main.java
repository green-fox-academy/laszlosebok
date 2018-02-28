package petrol_station;

public class Main {
  public static void main(String[] args) {
    Station myPetrolStation = new Station(3500);
    Car myCar = new Car();
    System.out.println(myPetrolStation.getGasAmount());
    System.out.println(myCar.getGasAmount() + "/" + myCar.getCapacity());
    myPetrolStation.refill(myCar);
    System.out.println(myPetrolStation.getGasAmount());
    System.out.println(myCar.getGasAmount() + "/" + myCar.getCapacity());
    
  }
}
