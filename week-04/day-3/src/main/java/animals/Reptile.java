package main.java.animals;

public class Reptile extends Animal {
  
  private boolean amphibian;
  
  public Reptile(String name) {
    this.name = name;
  }
  
  @Override
  public String breed() {
    return "eggs";
  }
}
