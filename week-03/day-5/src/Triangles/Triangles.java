package Triangles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  static final int[] STARTING_X_COORDINATES = {100, 1700, 900};
  static final int[] STARTING_Y_COORDINATES = {100, 100, (int)(Math.sin(Math.toRadians(60))* 1600)};
  
  static int WIDTH = 1700;
  static int HEIGHT = 1700;
  
  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/project/fractals/triangles.jpg
    
    drawLittleTriangles(graphics, STARTING_X_COORDINATES, STARTING_Y_COORDINATES);
  }
  
  private static void drawLittleTriangles(Graphics graphics, int[] startingXCoordinates, int[] startingYCoordinates) {
    int triangleSide = (startingXCoordinates[1] - startingXCoordinates[0]) / 2;
    
    if (triangleSide < 2) {
      return;
    }
    
    // top-left triangle calculations and drawing
    int leftTriangleX = startingXCoordinates[0];
    int leftTriangleY = startingYCoordinates[0];
    int[] leftTriangleXCoordinates = calcTriangleXCoordinates(leftTriangleX, triangleSide);
    int[] leftTriangleYCoordinates = calcTriangleYCoordinates(leftTriangleY, triangleSide);
    Triangle.drawTriangle(graphics, leftTriangleXCoordinates, leftTriangleYCoordinates);
  
    // top-right triangle calculations and drawing
    int rightTriangleX = leftTriangleXCoordinates[1];
    int rightTriangleY = leftTriangleYCoordinates[1];
    int[] rightTriangleXCoordinates = calcTriangleXCoordinates(rightTriangleX, triangleSide);
    int[] rightTriangleYCoordinates = calcTriangleYCoordinates(rightTriangleY, triangleSide);
    Triangle.drawTriangle(graphics, rightTriangleXCoordinates, rightTriangleYCoordinates);
  
    // bottom triangle calculations and drawing
    int bottomTriangleX = leftTriangleXCoordinates[2];
    int bottomTriangleY = leftTriangleYCoordinates[2];
    int[] bottomTriangleXCoordinates = calcTriangleXCoordinates(bottomTriangleX, triangleSide);
    int[] bottomTriangleYCoordinates = calcTriangleYCoordinates(bottomTriangleY, triangleSide);
    Triangle.drawTriangle(graphics, bottomTriangleXCoordinates, bottomTriangleYCoordinates);
  
    // calls the method recursively for each triangle drawn
    drawLittleTriangles(graphics, leftTriangleXCoordinates, leftTriangleYCoordinates);
    drawLittleTriangles(graphics, rightTriangleXCoordinates, rightTriangleYCoordinates);
    drawLittleTriangles(graphics, bottomTriangleXCoordinates, bottomTriangleYCoordinates);
  }
  
  private static int[] calcTriangleXCoordinates(int leftTriangleX, int triangleSide) {
    
    int[] leftTriangleXCoordinates = new int[3];
    leftTriangleXCoordinates[0] = leftTriangleX;
    leftTriangleXCoordinates[1] = leftTriangleX + triangleSide;
    leftTriangleXCoordinates[2] = leftTriangleX + triangleSide / 2;
    return leftTriangleXCoordinates;
  }
  
  private static int[] calcTriangleYCoordinates(int leftTriangleY, int triangleSide) {
    int[] leftTriangleYCoordinates = new int[3];
    leftTriangleYCoordinates[0] = leftTriangleY;
    leftTriangleYCoordinates[1] = leftTriangleY;
    leftTriangleYCoordinates[2] = leftTriangleY + (int)(Math.sin(Math.toRadians(60))* triangleSide);
    return leftTriangleYCoordinates;
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
    imagePanel.setBackground(Color.BLACK);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}