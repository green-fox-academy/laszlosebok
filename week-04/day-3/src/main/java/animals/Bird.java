package main.java.animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable{
  
  private int wings;
  
  public Bird(String name) {
    super(name);
  }
  
  private void flap() {
    System.out.println(getName() + " starts flapping its wings.");
  }
  
  @Override
  public String breed() {
    return "eggs";
  }
  
  @Override
  public void fly() {
    System.out.println("The " + getName() + " is flying.");
  }
  
  @Override
  public void land() {
    System.out.println("The " + getName() + " lands on the ground.");
  }
  
  @Override
  public void takeOff() {
    flap();
  }
}
