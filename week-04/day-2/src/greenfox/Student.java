package greenfox;

public class Student extends Person {
  
  private String previousOrganization;
  private int skippedDays;
  
  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }
  
  Student(){
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " +
        this.getGender() + " from " + previousOrganization + " who skipped " + skippedDays +
        " days from the course already");
  }
  
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  
  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
