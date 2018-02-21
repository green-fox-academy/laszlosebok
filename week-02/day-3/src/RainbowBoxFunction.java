import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int squareSize = WIDTH;
        Color color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
        squareDrawer(graphics, squareSize, color);
        do{
            squareSize -= (int)(Math.random() * (squareSize) + 1);
            color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
            squareDrawer(graphics, squareSize, color);
        }while (squareSize > 0);
    }
    public static void squareDrawer(Graphics graphics, int squareSize, Color color) {
        int startX = ((WIDTH / 2) - (squareSize / 2));
        int startY = ((HEIGHT / 2) - (squareSize / 2));

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