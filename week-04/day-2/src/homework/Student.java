package homework;

public class Student {
  
  private String name = "Jane Doe";
  private int age = 30;
  private String gender = "female";
  private String previousOrganization = "The School of Life";
  private int skippedDays = 0;
  
  Student(){
  }
  
  Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " +
      previousOrganization + " who skipped " + skippedDays + " days from the course already");
  }
  
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  
  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
