package flyable;

abstract class Vehicle {
  
  private String type;
  private int passengerCapacity;
  private int fuelCapacity;
  private int currentFuel;
  private int horsePower;
  
  Vehicle(String type) {
    this.type = type;
  }
  
  String getType() {
    return type;
  }
}
