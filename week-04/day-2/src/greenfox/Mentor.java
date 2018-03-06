package greenfox;

public class Mentor extends Person {
  
  private String level;
  
  Mentor(){
    super();
    level = "intermediate";
  }
  
  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " +
        this.getGender() + " " + level + " mentor.");
  }
  
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
}
