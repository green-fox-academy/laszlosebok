package petrol_station;

public class Station {
  
  private int gasAmount;
  
  Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }
  
  public void refill(Car car) {
    int gasNeeded = car.getCapacity() - car.getGasAmount();
    this.gasAmount -= gasNeeded;
    car.setGasAmount(car.getCapacity());
  }
  
  public int getGasAmount() {
    return gasAmount;
  }
}
