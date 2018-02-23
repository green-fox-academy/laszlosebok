import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  static final int TRIANGLE_END_POINTS = 3;
  static final int START_HEIGHT = 20;
  
  static int triangleRows;
  static int triangleSide = 25;
  static int triangleHeight;
  
  static List<ArrayList<Integer>> triangleCoordinates = new ArrayList<>();
  static ArrayList<Integer> triangleXCoordinates = new ArrayList<>();
  static ArrayList<Integer> triangleYCoordinates = new ArrayList<>();
  
  static List<ArrayList<Integer>> newTriangleCoordinates = new ArrayList<>();
  static ArrayList<Integer> newTriangleXCoordinates = new ArrayList<>();
  static ArrayList<Integer> newTriangleYCoordinates = new ArrayList<>();
  
  public static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/project/drawing/r5.png
    userProperties();
    calcStartingTriangle();
    drawTriangles(graphics);
  }
  public static void userProperties() {
    Scanner userInputScanner = new Scanner(System.in);
    System.out.println("Please enter how many rows should the triangle consist of:");
    triangleRows = userInputScanner.nextInt();
//  System.out.println("Please enter how big a little triangle's side should be: ");
//  triangleSide = userInputScanner.nextInt();
    triangleHeight = (int)(Math.sqrt(Math.pow(triangleSide, 2)-Math.pow((triangleSide/2), 2)));
  }
  public static void calcStartingTriangle(){
    int startX = WIDTH / 2;
    int startY = START_HEIGHT;
    triangleXCoordinates.add(startX);
    triangleYCoordinates.add(startY);
    triangleCoordinates.add(triangleXCoordinates);
    triangleCoordinates.add(triangleYCoordinates);
    newTriangleCoordinates.add(newTriangleXCoordinates);
    newTriangleCoordinates.add(newTriangleYCoordinates);
  }
  public static void drawTriangles(Graphics graphics) {
    for (int i = 0; i < triangleRows; i++) {
      calcTriangleCoordinates(graphics);
    }
  }
  public static void calcTriangleCoordinates(Graphics graphics) {
    cleanUp();
    int[][] drawThis = new int[2][3];
    for (int i = 0; i < triangleCoordinates.get(0).size(); i++) {
      int xCoordinateLeft = triangleCoordinates.get(0).get(i)-triangleSide/2;
      int xCoordinateRight = triangleCoordinates.get(0).get(i)+triangleSide/2;
      drawThis[0][0] = triangleCoordinates.get(0).get(i);
      drawThis[0][1] = xCoordinateLeft;
      drawThis[0][2] = xCoordinateRight;
      newTriangleCoordinates.get(0).add(xCoordinateLeft);
      newTriangleCoordinates.get(0).add(xCoordinateRight);
      
      int yCoordinateLeft = triangleCoordinates.get(1).get(i)+triangleHeight;
      int yCoordinateRight = triangleCoordinates.get(1).get(i)+triangleHeight;
      drawThis[1][0] = triangleCoordinates.get(1).get(i);
      triangleCoordinates.get(1).add(yCoordinateLeft);
      triangleCoordinates.get(1).add(yCoordinateRight);
      drawThis[1][1] = yCoordinateLeft;
      drawThis[1][2] = yCoordinateRight;
      newTriangleCoordinates.get(1).add(yCoordinateLeft);
      newTriangleCoordinates.get(1).add(yCoordinateRight);
      drawTriangle(graphics, drawThis);
    }
    copyTriangleCoordinates();
  }
  
  private static void copyTriangleCoordinates() {
    triangleCoordinates.get(0).clear();
    triangleCoordinates.get(1).clear();
    for (int i = 0; i < newTriangleCoordinates.size(); i++) {
      for (int j = 0; j < newTriangleCoordinates.get(i).size(); j++) {
        triangleCoordinates.get(i).add(newTriangleCoordinates.get(i).get(j));
      }
    }
  }
  
  private static void cleanUp() {
    newTriangleCoordinates.get(0).clear();
    newTriangleCoordinates.get(1).clear();
  }
  
  public static void drawTriangle(Graphics graphics, int[][] triangleArray) {
    graphics.drawPolygon(triangleArray[0], triangleArray[1], TRIANGLE_END_POINTS);
  }
//  public static int[][] convertToArray () {
//    int[][] triangleArray = new int[triangleCoordinates.size()][triangleCoordinates.get(0).size()];
//    for (int i = 0; i < triangleCoordinates.size(); i++) {
//      for (int j = 0; j < triangleCoordinates.get(i).size(); j++) {
//        triangleArray[i][j] = triangleCoordinates.get(i).get(j);
//      }
//    }
//    return triangleArray;
//  }
  

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