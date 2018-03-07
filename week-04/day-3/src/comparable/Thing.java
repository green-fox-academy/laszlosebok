package comparable;

import printable.Printable;

public class Thing implements Comparable<Thing>, Printable {
  private String name;
  private boolean completed;
  
  public Thing(String name) {
    this.name = name;
  }
  
  public void complete() {
    this.completed = true;
  }
  
  
  
  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
  
  @Override
  public int compareTo(Thing o) {
    /*
    This method compares the completed state than the name field
    But the uncommented part produces the same solution in a simpler way.
    
    String completedBase = "" + completed;
    String completedCompare = "" + o.completed;
    if (completedBase.compareTo(completedCompare) == 0) {
      return name.compareTo(o.name);
    } else {
      return completedBase.compareTo(completedCompare);
    }
    */
    
    return toString().compareTo(o.toString());
  }
  
  @Override
  public void printAllFields() {
    System.out.println(this);
  }
}