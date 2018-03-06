package greenfox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  
  private String name;
  private List<Student> students;
  private List<Mentor> mentors;
  
  Cohort(String name){
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
  
  void addStudent(Student student) {
    this.students.add(student);
  }
  
  void addMentor(Mentor mentor) {
    this.mentors.add(mentor);
  }
  
  void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " +
        mentors.size() + " mentors.");
  }
}
