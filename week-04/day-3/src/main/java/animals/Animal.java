package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  
  Animal(String name) {
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  public abstract String breed();
  
  public void eat() {
    System.out.println("Om nom nom");
  }
  
  public void sleep() {
    System.out.println("ZzzzZZZZzzzZZ");
  }
}
