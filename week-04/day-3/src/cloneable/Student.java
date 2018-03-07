package cloneable;

public class Student extends Person implements Cloneable {
  
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
  
  public Student clone() {
    try {
      return (Student) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }
  
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }
  
  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
