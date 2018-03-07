package comparable;

import printable.Printable;

public class Domino implements Comparable<Domino>, Printable{
  private final int[] values;
  
  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }
  
  public int[] getValues() {
    return values;
  }
  
  
  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
  
  @Override
  public int compareTo(Domino o) {
    /*
    The commented out method should compare the first values and if the return value is 0,
    then it should compare the second values in order to sort it.
    But convert toString should produce the same result.
    
    String firstBase = toString().substring(1, 2);
    String firstCompare = o.toString().substring(1, 2);
    String secondBase = toString().substring(4, 5);
    String secondCompare = o.toString().substring(4, 5);
  
    if (firstBase.compareTo(firstCompare) == 0) {
      return secondBase.compareTo(secondCompare);
    } else {
      return firstBase.compareTo(firstCompare);
    }
    */
    
    return toString().compareTo(o.toString());
  }
  
  @Override
  public void printAllFields() {
    System.out.println(this);
  }
}
