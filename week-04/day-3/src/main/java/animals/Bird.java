package main.java.animals;

public class Bird extends Animal {
  
  private int wings;
  
  public Bird(String name) {
    super(name);
  }
  
  public void flap() {
    System.out.println(getName() + " starts flapping its wings.");
  }
  
  @Override
  public String breed() {
    return "eggs";
  }
}
