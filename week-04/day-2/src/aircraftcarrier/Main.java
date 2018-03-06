package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Carrier carrierOne = new Carrier(100, 5000);
    carrierOne.addAircraft("F16");
    carrierOne.addAircraft("F16");
    carrierOne.addAircraft("F16");
    carrierOne.addAircraft("F35");
    carrierOne.addAircraft("F35");
    carrierOne.addAircraft("F35");
    carrierOne.fill();
  
    Carrier carrierTwo = new Carrier(50, 5000);
    carrierTwo.addAircraft("F16");
    carrierTwo.addAircraft("F16");
    carrierTwo.addAircraft("F16");
    carrierTwo.addAircraft("F35");
    carrierTwo.addAircraft("F35");
    carrierTwo.addAircraft("F35");
    carrierOne.fill();
  
    for (int i = 0; i < 2; i++) {
      carrierOne.fight(carrierTwo);
      carrierOne.fill();
      carrierOne.getStatus();
      carrierTwo.fill();
      carrierTwo.getStatus();
    }
  }
}
