package tree;

import java.awt.*;

public class Line {
  
  
  public static void draw(Graphics graphics, int[] coordinates) {
    graphics.drawLine(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
  }
}
