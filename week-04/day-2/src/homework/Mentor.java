package homework;

public class Mentor {
  
  private String name = "Jane Doe";
  private int age = 30;
  private String gender = "female";
  private String level = "intermediate";
  
  Mentor(){
  }
  
  Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + "" +
        " mentor.");
  }
  
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
