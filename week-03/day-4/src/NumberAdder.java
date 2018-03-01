public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    int addUntil = 30;
    System.out.println(sumNumber(addUntil));
  }
  private static int sumNumber(int n) {
    if (n == 0) {
      return n;
    } else {
      return sumNumber(n-1) + n;
    }
  }
}
