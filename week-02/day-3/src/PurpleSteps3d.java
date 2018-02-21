import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int startX = 20;
        int startY = 20;
        int squareSize = 20;
        int originalSquareSize = 20;

        for (int i = 0; i < 6; i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(startX, startY, squareSize, squareSize);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(startX, startY, squareSize, squareSize);
            graphics.drawRect(startX+1, startY+1, squareSize-2, squareSize-2);
            startX += squareSize;
            startY += squareSize;
            squareSize += originalSquareSize;

        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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