package farm;

public class Animal {
  //  Create an Animal class
  //  Every animal has a hunger value, which is a whole number
  //  Every animal has a thirst value, which is a whole number
  //  when creating a new animal object these values are created with the default 50 value
  //  Every animal can eat() which decreases their hunger by one
  //  Every animal can drink() which decreases their thirst by one
  //  Every animal can play() which increases both by one
  private int hunger = 50;
  private int thirst = 50;
  
  public void eat(){
    hunger--;
  }
  public void drink(){
    thirst--;
  }
  public void play() {
    hunger++;
    thirst++;
  }
  
  public int getHunger() {
    return hunger;
  }
  
  @Override
  public String toString() {
    return "Animal{" +
      "hunger=" + hunger +
      ", thirst=" + thirst +
      '}';
  }
}
