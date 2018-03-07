package cloneable;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("Petike", 12, "male", "unemployed");
  
    System.out.println(student.getName());
    
    Student studentClone = student.clone();
  
    System.out.println(studentClone.getName());
    
  }
}
