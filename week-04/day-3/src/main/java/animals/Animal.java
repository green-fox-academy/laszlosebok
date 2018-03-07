package main.java.animals;

public abstract class Animal {
  String name;
  int age;
  String gender;
  
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
