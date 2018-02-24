import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  static final int TRIANGLE_END_POINTS = 3;
  static final int START_HEIGHT = 20;
  
  static int triangleRows;
  static int triangleSide = 25;
  static int triangleHeight;
  
  static List<ArrayList<Integer>> triangleTopCoordinates = new ArrayList<>();
  static ArrayList<Integer> triangleXCoordinates = new ArrayList<>();
  static ArrayList<Integer> triangleYCoordinates = new ArrayList<>();
  
  static List<ArrayList<Integer>> newTriangleCoordinates = new ArrayList<>();
  static ArrayList<Integer> newTriangleXCoordinates = new ArrayList<>();
  static ArrayList<Integer> newTriangleYCoordinates = new ArrayList<>();
  
  public static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/project/drawing/r5.png
    userProperties();
    initLists();
    drawTriangles(graphics);
  }
  
  public static void userProperties() {
    Scanner userInputScanner = new Scanner(System.in);
    System.out.println("Please enter how many rows should the triangle consist of:");
    triangleRows = userInputScanner.nextInt();
    System.out.println("Please enter how big a little triangle's side should be: ");
    triangleSide = userInputScanner.nextInt();
    triangleHeight = (int)(Math.sqrt(Math.pow(triangleSide, 2)-Math.pow((triangleSide/2), 2)));
  }
  
  public static void initLists(){
    // Sets up initial top coordinates for the topmost triangle
    triangleXCoordinates.add(WIDTH / 2);
    triangleYCoordinates.add(START_HEIGHT);
    triangleTopCoordinates.add(triangleXCoordinates);
    triangleTopCoordinates.add(triangleYCoordinates);
    // Sets up the ArrayList which will store the bottom coordinates of the triangles.
    newTriangleCoordinates.add(newTriangleXCoordinates);
    newTriangleCoordinates.add(newTriangleYCoordinates);
  }
  
  public static void drawTriangles(Graphics graphics) {
    for (int rows = triangleRows; rows > 0; rows--) {
      drawTriangleRow(graphics);
    }
  }
  
  public static void drawTriangleRow(Graphics graphics) {
    cleanUp();
    // iterates though the top coordinates
    for (int triangleIndex = 0; triangleIndex < triangleTopCoordinates.get(0).size(); triangleIndex++) {
      int[][] drawThis = calcTriangleCoordinates(triangleIndex);
      drawTriangle(graphics, drawThis);
    }
    copyTriangleCoordinates();
  }
  // calculates the bottom coordinates corresponding to the top coordinate
  private static int[][] calcTriangleCoordinates(int index) {
    int xCoordinate = triangleTopCoordinates.get(0).get(index);
    int xCoordinateLeft = xCoordinate-triangleSide/2;
    int xCoordinateRight = xCoordinate+triangleSide/2;
  
    int yCoordinate = triangleTopCoordinates.get(1).get(index);
    int yCoordinateLeft = yCoordinate+triangleHeight;
    int yCoordinateRight = yCoordinate+triangleHeight;
  
    // saves the bottom coordinates as they will be the new top coordinates in the next row
    newTriangleCoordinates.get(0).add(xCoordinateLeft);
    newTriangleCoordinates.get(0).add(xCoordinateRight);
  
    newTriangleCoordinates.get(1).add(yCoordinateLeft);
    newTriangleCoordinates.get(1).add(yCoordinateRight);
    
    // puts the calculated values into a multi array
    int[][] triangleCoordinates = {
      {xCoordinate, xCoordinateLeft, xCoordinateRight},
      {yCoordinate, yCoordinateLeft, yCoordinateRight}
    };
    
    return triangleCoordinates;
  }
  // Cleans up the ArrayList with the top coordinates, to put the bottom coordinates into
  // as they will be the next row's top coordinates.
  private static void copyTriangleCoordinates() {
    triangleTopCoordinates.get(0).clear();
    triangleTopCoordinates.get(1).clear();
    for (int i = 0; i < newTriangleCoordinates.size(); i++) {
      for (int j = 0; j < newTriangleCoordinates.get(i).size(); j++) {
        triangleTopCoordinates.get(i).add(newTriangleCoordinates.get(i).get(j));
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