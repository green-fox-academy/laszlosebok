package triangles;

import java.awt.*;

public class Triangle {
  private static final int END_POINTS = 3;
  
  public static void drawTriangle(Graphics graphics, int[] xCoord, int[] yCoord){
    int[] rgb = generateRandomRGB();
    Color randomColor = new Color(rgb[0], rgb[1], rgb[2]);
    graphics.setColor(randomColor);
    graphics.drawPolygon(xCoord, yCoord, END_POINTS);
  }
  private static int[] generateRandomRGB(){
    int[] rgb = {(int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)};
    return rgb;
  }
}
