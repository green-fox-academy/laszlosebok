import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic1 {
  static int WIDTH = 1500;
  static int HEIGHT = 1500;
  
  private static final int SQUARE_END_POINTS = 4;
  private static final int[] ORIGINAL_X_ARRAY = {0, 0, WIDTH, WIDTH};
  private static final int[] ORIGINAL_Y_ARRAY = {0, 0, HEIGHT, HEIGHT};
  
  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png
    int[] canvStartX = {0, 0, WIDTH, WIDTH};
    int[] canvStartY = {0, 0, HEIGHT, HEIGHT};
    divideToThirds(graphics, canvStartX, canvStartY);
  }
  private static void divideToThirds(Graphics graphics, int[] canvStartX, int[] canvStartY) {
    
    int topStartX = calcStartXTop(canvStartX);
    int topStartY = calcStartYTop(canvStartY);
    int[] topXCoordinates = calcXCoordinates(topStartX, canvStartX);
    int[] topYCoordinates = calcYCoordinates(topStartY, canvStartY);
    drawSquare(graphics, topXCoordinates, topYCoordinates);
    divideToThirds(graphics, topXCoordinates, topYCoordinates);
  
    
    int rightStartX = calcStartXRight(canvStartX);
    int rightStartY = calcStartYRight(canvStartY);
    int[] rightXCoordinates = calcXCoordinates(rightStartX, canvStartX);
    int[] rightYCoordinates = calcYCoordinates(rightStartY, canvStartY);
    drawSquare(graphics, rightXCoordinates, rightYCoordinates);
    divideToThirds(graphics, rightXCoordinates, rightYCoordinates);
    
    int bottomStartX = calcStartXBottom(canvStartX);
    int bottomStartY = calcStartYBottom(canvStartY);
    int[] bottomXCoordinates = calcXCoordinates(bottomStartX, canvStartX);
    int[] bottomYCoordinates = calcYCoordinates(bottomStartY, canvStartY);
    drawSquare(graphics, bottomXCoordinates, bottomYCoordinates);
    divideToThirds(graphics, bottomXCoordinates, bottomYCoordinates);

    int leftStartX = calcStartXLeft(canvStartX);
    int leftStartY = calcStartYLeft(canvStartY);
    int[] leftXCoordinates = calcXCoordinates(leftStartX, canvStartX);
    int[] leftYCoordinates = calcYCoordinates(leftStartY, canvStartY);
    drawSquare(graphics, leftXCoordinates, leftYCoordinates);
    divideToThirds(graphics, leftXCoordinates, leftYCoordinates);
    
  }
  
  private static void drawSquare(Graphics graphics, int[] topXCoordinates, int[] topYCoordinates) {
    graphics.drawPolygon(topXCoordinates, topYCoordinates, SQUARE_END_POINTS);
  }
  
  private static int[] calcXCoordinates(int startX, int[] canvStartX) {
    int[] rightXCoordinates = new int[4];
    int side = (canvStartX[2] - canvStartX[0]) / 3;
    
    rightXCoordinates[0] = startX;
    rightXCoordinates[1] = startX + side;
    rightXCoordinates[2] = startX + side;
    rightXCoordinates[3] = startX;
    
    return rightXCoordinates;
  }
  
  private static int[] calcYCoordinates(int startY, int[] canvStartY) {
    int[] rightYCoordinates = new int[4];
    int side = (canvStartY[2] - canvStartY[0]) / 3;
    
    rightYCoordinates[0] = startY;
    rightYCoordinates[1] = startY;
    rightYCoordinates[2] = startY + side;
    rightYCoordinates[3] = startY + side;
    
    return rightYCoordinates;
  }
  
  private static int calcStartXTop(int[] canvStartX){
    return canvStartX[0]+(canvStartX[2] - canvStartX[0]) / 3;
  }
  
  private static int calcStartYTop(int[] canvStartY){
    return canvStartY[0];
  }
  
  private static int calcStartXRight(int[] canvStartX) {
    return canvStartX[0] + ((canvStartX[2] - canvStartX[0]) / 3 * 2);
  }
  
  private static int calcStartYRight(int[] canvStartY){
    return canvStartY[0] + canvStartY[2] / 3;
  }
  
  private static int calcStartXBottom(int[] canvStartX){
    return canvStartX[0] + (canvStartX[2] - canvStartX[0]) / 3;
  }
  
  private static int calcStartYBottom(int[] canvStartY){
    return canvStartY[0] + canvStartY[2] / 3 ;
  }
  
  private static int calcStartXLeft(int[] canvStartX) {
    return canvStartX[0];
  }
  
  private static int calcStartYLeft(int[] canvStartY){
    return canvStartY[0]+canvStartY[2] / 3;
  }
  
  
  // Don't touch the code below
 
  
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
