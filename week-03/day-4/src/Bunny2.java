public class Bunny2 {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    
    int numberOfBunnies = 15;
    System.out.println(countBunnyEars(numberOfBunnies));
  }
  private static int countBunnyEars(int bunnies) {
    int normalEars = 2;
    int weirdEars = 3;
    if (bunnies == 1) {
      return normalEars;
    } else if (bunnies % 2 == 1) {
      return normalEars + countBunnyEars(bunnies - 1);
    } else {
      return weirdEars + countBunnyEars(bunnies - 1);
    }
    
  }
}
