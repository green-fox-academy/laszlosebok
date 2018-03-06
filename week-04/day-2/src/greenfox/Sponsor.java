package greenfox;

public class Sponsor extends Person {
  
  private String company;
  private int hiredStudents;
  
  Sponsor(){
    super();
    company = "Google";
    hiredStudents = 0;
  }
  
  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " +
        this.getGender() + " who represents " + company + " and hired " + hiredStudents +
        " students so far.");
  }
  
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }
  
  public void hire() {
    hiredStudents++;
  }
}
