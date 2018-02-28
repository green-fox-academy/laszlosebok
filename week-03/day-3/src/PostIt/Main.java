package PostIt;

public class Main {
  public static void main(String[] args) {
    PostIt example1 = new PostIt("orange", "Idea 1", "blue");
    PostIt example2 = new PostIt("pink", "Awesome", "black");
    PostIt example3 = new PostIt("yellow", "Superb!", "green");
  
    System.out.println(example1.toString());
    System.out.println(example2.toString());
    System.out.println(example3.toString());
  }
}
