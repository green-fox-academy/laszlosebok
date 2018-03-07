package charsequence;

public class Shifter implements CharSequence{
  
  private String s;
  private int shiftAmount;
  
  Shifter(String s, int shiftAmount) {
    this.s = s;
    this.shiftAmount = shiftAmount;
  }
  
  private String shifter() {
    String shifted = this.subSequence(shiftAmount, length()).toString();
    shifted += subSequence(0, shiftAmount).toString();
    
    return shifted;
  }
  
  @Override
  public int length() {
    return s.length();
  }
  
  @Override
  public char charAt(int index) {
    return this.shifter().charAt(index);
  }
  
  @Override
  public CharSequence subSequence(int start, int end) {
    return s.substring(start, end);
  }
}
