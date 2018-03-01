public class Counter {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    int countDownStart = 15;
    countDown(countDownStart);
  }
  
  private static void countDown(int n){
    System.out.println(n);
    if (n == 0) {
      return;
    } else {
      countDown(n-1);
    }
  }
}