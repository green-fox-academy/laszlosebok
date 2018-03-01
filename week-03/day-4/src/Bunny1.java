public class Bunny1 {
  public static void main(String[] args) {
    int numberOfBunnies = 10;
    System.out.println(countBunnyEars(numberOfBunnies));
  }
  private static int countBunnyEars(int bunnies) {
    int aSetOfEars = 2;
    if (bunnies == 1) {
      return aSetOfEars;
    } else {
      return aSetOfEars + countBunnyEars(bunnies - 1);
    }
  }
}
