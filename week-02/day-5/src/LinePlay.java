import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  
  static int lineDistance = 20;
  static int WIDTH = 1500;
  static int HEIGHT = 1500;
  static final Integer INTEGER_HEIGHT = new Integer(HEIGHT);
  static final Integer INTEGER_WIDTH = new Integer(WIDTH);
  
  
  public static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/project/drawing/r1.png
    
    List<HashMap<String, Integer>> lines = initLineDetails();
    drawGreenLines(graphics, lines);
    drawPurpleLines(graphics, lines);
  }
  
  private static void drawGreenLines(Graphics graphics, List<HashMap<String, Integer>> lines) {
    graphics.setColor(new Color(0, 115, 53));
    while ((lines.get(1).get("startY")) < INTEGER_HEIGHT) {
      graphics.drawLine(lines.get(1).get("startX"), lines.get(1).get("startY"), lines.get(1).get("endX"), lines.get(1).get("endY"));
      lines.get(1).replace("startY", lines.get(1).get("startY") + lineDistance);
      lines.get(1).replace("endX", lines.get(1).get("endX") + lineDistance);
    }
  }
  
  private static void drawPurpleLines(Graphics graphics, List<HashMap<String, Integer>> lines) {
    graphics.setColor(new Color(102, 51, 153));
    while ((lines.get(0).get("startX")) < INTEGER_WIDTH) {
      graphics.drawLine(lines.get(0).get("startX"), lines.get(0).get("startY"), lines.get(0).get("endX"), lines.get(0).get("endY"));
      lines.get(0).replace("startX", lines.get(0).get("startX") + lineDistance);
      lines.get(0).replace("endY", lines.get(0).get("endY") + lineDistance);
    }
  }
  
  private static List<HashMap<String, Integer>> initLineDetails() {
    List<HashMap<String, Integer>> lines = new ArrayList<>();
    HashMap<String, Integer> purple = new HashMap<>();
    purple.put("startX", lineDistance);
    purple.put("startY", 0);
    purple.put("endX", WIDTH);
    purple.put("endY", lineDistance);
    lines.add(purple);
  
    HashMap<String, Integer> green = new HashMap<>();
    green.put("startX", 0);
    green.put("startY", lineDistance);
    green.put("endX", lineDistance);
    green.put("endY", HEIGHT);
    lines.add(green);
    return lines;
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