package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie blueSharpie = new Sharpie("blue", 5);
    
    blueSharpie.use();
    
    System.out.println(blueSharpie.getInkAmount());
  }
}
