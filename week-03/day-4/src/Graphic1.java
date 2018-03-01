import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic1 {
  static int WIDTH = 1459;
  static int HEIGHT = 1459;
  
  private static final int SQUARE_END_POINTS = 4;
  
  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png
    int[] canvasXCoordinates = {0, WIDTH, WIDTH, 0};
    int[] canvasYCoordinates = {0, 0, HEIGHT, HEIGHT};
    
    drawMainSquare(graphics, canvasXCoordinates, canvasYCoordinates);
    drawFourSquares(graphics, canvasXCoordinates, canvasYCoordinates);
  }
  
  private static void drawMainSquare(Graphics graphics, int[] canvasXCoordinates, int[] canvasYCoordinates) {
    graphics.drawPolygon(canvasXCoordinates, canvasYCoordinates, SQUARE_END_POINTS);
  }
  
  private static void drawFourSquares(Graphics graphics, int[] canvasXCoordinates, int[] canvasYCoordinates) {
    // if the sides are less than...
    if((canvasXCoordinates[1] - canvasXCoordinates[0]) < 2){
      return;
    }
    
    /*
     * Each part calculates the top-left coordinates for the respective square
     * Than uses that to calculate the remaining 3 coordinates.
     * Those 4 pair of coordinates are used as the next canvas coordinates.
     * And they are used to draw the square.
     */
    
    // Top Square
    int topStartX = calcStartXTop(canvasXCoordinates);
    int topStartY = calcStartYTop(canvasYCoordinates);
    int[] topXCoordinates = calcXCoordinates(topStartX, canvasXCoordinates);
    int[] topYCoordinates = calcYCoordinates(topStartY, canvasYCoordinates);
    drawSquare(graphics, topXCoordinates, topYCoordinates);
  
    // Right Square
    int rightStartX = calcStartXRight(canvasXCoordinates);
    int rightStartY = calcStartYRight(canvasYCoordinates);
    int[] rightXCoordinates = calcXCoordinates(rightStartX, canvasXCoordinates);
    int[] rightYCoordinates = calcYCoordinates(rightStartY, canvasYCoordinates);
    drawSquare(graphics, rightXCoordinates, rightYCoordinates);
    
    // Bottom Square
    int bottomStartX = calcStartXBottom(canvasXCoordinates);
    int bottomStartY = calcStartYBottom(canvasYCoordinates);
    int[] bottomXCoordinates = calcXCoordinates(bottomStartX, canvasXCoordinates);
    int[] bottomYCoordinates = calcYCoordinates(bottomStartY, canvasYCoordinates);
    drawSquare(graphics, bottomXCoordinates, bottomYCoordinates);

    // Left Square
    int leftStartX = calcStartXLeft(canvasXCoordinates);
    int leftStartY = calcStartYLeft(canvasYCoordinates);
    int[] leftXCoordinates = calcXCoordinates(leftStartX, canvasXCoordinates);
    int[] leftYCoordinates = calcYCoordinates(leftStartY, canvasYCoordinates);
    drawSquare(graphics, leftXCoordinates, leftYCoordinates);
    
    // Recursively calls each function with the new canvas coordinates.
    drawFourSquares(graphics, topXCoordinates, topYCoordinates);
    drawFourSquares(graphics, rightXCoordinates, rightYCoordinates);
    drawFourSquares(graphics, bottomXCoordinates, bottomYCoordinates);
    drawFourSquares(graphics, leftXCoordinates, leftYCoordinates);
  }
  
  private static void drawSquare(Graphics graphics, int[] topXCoordinates, int[] topYCoordinates) {
    graphics.drawPolygon(topXCoordinates, topYCoordinates, SQUARE_END_POINTS);
  }
  
  private static int[] calcXCoordinates(int startX, int[] canvStartX) {
    int[] rightXCoordinates = new int[4];
    int side = (canvStartX[1] - canvStartX[0]) / 3;
    
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
  
  // Math heavy calculations below to determine each squares starting x-y coordinate pairs
  private static int calcStartXTop(int[] canvStartX){
    return canvStartX[0] + (canvStartX[1] - canvStartX[0]) / 3;
  }
  
  private static int calcStartYTop(int[] canvStartY){
    return canvStartY[0];
  }
  
  private static int calcStartXRight(int[] canvStartX) {
    return canvStartX[0] + ((canvStartX[1] - canvStartX[0]) / 3 * 2);
  }
  
  private static int calcStartYRight(int[] canvStartY){
    return canvStartY[0] + (canvStartY[2] - canvStartY[0]) / 3;
  }
  
  private static int calcStartXBottom(int[] canvStartX){
    return canvStartX[0] + (canvStartX[1] - canvStartX[0]) / 3;
  }
  
  private static int calcStartYBottom(int[] canvStartY){
    return canvStartY[0] + (canvStartY[2] - canvStartY[1]) / 3 * 2;
  }
  
  private static int calcStartXLeft(int[] canvStartX) {
    return canvStartX[0];
  }
  
  private static int calcStartYLeft(int[] canvStartY){
    return canvStartY[0] + (canvStartY[2] - canvStartY[0]) / 3;
  }
  
  
  // Don't touch the code below
 
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    ImagePanel imagePanel = new ImagePanel();
    
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    imagePanel.setBackground(Color.YELLOW);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
