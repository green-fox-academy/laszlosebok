import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic1 {
  
  private static final int SQUARE_END_POINTS = 4;
  
  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png
    int[] canvStartX = {0, 0, WIDTH, WIDTH};
    int[] canvStartY = {0, 0, HEIGHT, HEIGHT};
    divideToThirds(graphics, canvStartX, canvStartY);
  }
  private static void divideToThirds(Graphics graphics, int[] canvStartX, int[] canvStartY) {
    int topStartX = calcStartXTop(canvStartX);
    int topStartY = calcStartYTop(canvStartY);
    int[] topXCoordinates = calcTopXCoordinates(topStartX, canvStartX);
    int[] topYCoordinates = calcTopYCoordinates(topStartY, canvStartY);
    drawTopSquare(graphics,topXCoordinates, topYCoordinates);
    //calcSquares();
    //drawSquare();
  }
  
  private static void drawTopSquare(Graphics graphics, int[] topXCoordinates, int[] topYCoordinates) {
    graphics.drawPolygon(topXCoordinates, topYCoordinates, SQUARE_END_POINTS);
  }
  
  private static int calcStartXTop(int[] canvStartX) {
    return (canvStartX[2] - canvStartX[0]) / 3;
  }
  
  private static int calcStartYTop(int[] canvStartY) {
    return canvStartY[0];
  }
  
  private static int[] calcTopXCoordinates(int startX, int[] canvStartX) {
    int[] topXCoordinates = new int[4];
    topXCoordinates[0] = startX;
    topXCoordinates[1] = (canvStartX[2] - canvStartX[0]) / 3 * 2;
    topXCoordinates[2] = (canvStartX[3] - canvStartX[0]) / 3 * 2;
    topXCoordinates[3] = startX;
    return topXCoordinates;
  }
  
  private static int[] calcTopYCoordinates(int startY, int[] canvStartY) {
    int[] topYCoordinates = new int[4];
    topYCoordinates[0] = startY;
    topYCoordinates[1] = startY;
    topYCoordinates[2] = canvStartY[2] / 3;
    topYCoordinates[3] = canvStartY[3] / 3;
    return topYCoordinates;
  }
  
  // Don't touch the code below
  static int WIDTH = 1500;
  static int HEIGHT = 1500;
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
