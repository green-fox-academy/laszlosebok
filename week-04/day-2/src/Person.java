public class Person {
  
  private String name = "Jane Doe";
  private int age = 30;
  private String gender = "female";
  
  Person(){
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
}
