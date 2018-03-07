package main.java.animals;

public class Bird extends Animal {
  
  private int wings;
  
  public Bird(String name) {
    this.name = name;
  }
  
  public void flap() {
    System.out.println(name + " starts flapping its wings.");
  }
  
  @Override
  public String breed() {
    return "eggs";
  }
}
