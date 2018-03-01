public class Refactorio {
  public static void main(String[] args) {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial
    long factorial = 15;
    System.out.println(refactorio(factorial));
  }
  
  private static long refactorio(long n){
    if (n == 0){
      return 1;
    } else {
      return n * refactorio(n - 1);
    }
  }
}
