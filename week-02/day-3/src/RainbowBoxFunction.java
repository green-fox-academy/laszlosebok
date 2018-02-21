import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        for (int i = 0; i < 10; i++) {
            int squareSize = (int)(Math.random() * (WIDTH -1) + 1);
            Color color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
            squareDrawer(graphics, squareSize, color);
        }
    }
    public static void squareDrawer(Graphics graphics, int squareSize, Color color) {
        int startX = (int)(Math.random() * (WIDTH - squareSize));
        int startY = (int)(Math.random() * (WIDTH - squareSize));
        graphics.setColor(color);
        graphics.fillRect(startX, startY, squareSize, squareSize);
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 686;

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