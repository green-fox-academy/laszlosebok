package cloneable;

public class Person {
  
  private String name;
  private int age;
  private String gender;
  
  Person(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }
  
  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }
  
  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
  
  String getName() {
    return name;
  }
  
  int getAge() {
    return age;
  }
  
  String getGender() {
    return gender;
  }
}
