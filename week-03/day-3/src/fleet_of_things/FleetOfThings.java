package fleet_of_things;

public class FleetOfThings {
  
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing firstThing = new Thing("Get milk");
    fleet.add(firstThing);
    Thing secondThing = new Thing("Remove the obstacles");
    fleet.add(secondThing);
    Thing thirdThing = new Thing("Stand up");
    thirdThing.complete();
    fleet.add(thirdThing);
    Thing fourthThing = new Thing("Eat lunch");
    fourthThing.complete();
    fleet.add(fourthThing);
    System.out.println(fleet);
  }
}