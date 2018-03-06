package homework;

public class Sponsor {
  
  private String name = "Jane Doe";
  private int age = 30;
  private String gender = "female";
  private String company = "Google";
  private int hiredStudents = 0;
  
  Sponsor(){
  }
  
  Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who " +
        "represents " + company + " and hired " + hiredStudents + " students so far.");
  }
  
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
  
  public void hire() {
    hiredStudents++;
  }
}
