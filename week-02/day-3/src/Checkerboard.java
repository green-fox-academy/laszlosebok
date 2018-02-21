import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static boolean isDark = false;

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int squarePerRow = (2 + (int)(Math.random() * 18));
        int squareSize = WIDTH / squarePerRow;
        ArrayList<Integer> lineProperties = new ArrayList<>();
        lineProperties.add(squarePerRow);
        lineProperties.add(squareSize);
        lineProperties.add(0);
        if (squarePerRow % 2 == 0) {
            for (int i = 0; i < squarePerRow; i++) {
                lineProperties.set(2, i);
                isDark = !isDark;
                drawCheckerLine(graphics, lineProperties);
            }
        } else {
            isDark = !isDark;
            for (int i = 0; i < squarePerRow; i++) {
                lineProperties.set(2, i);
                drawCheckerLine(graphics, lineProperties);
            }
        }
    }
    public static void drawCheckerLine(Graphics graphics, ArrayList<Integer> lineProperties) {
        int squarePerRow = lineProperties.get(0);
        int squareSize = lineProperties.get(1);
        int lineNumber = lineProperties.get(2);
        int startX = 0;
        int startY = squareSize * lineNumber;
        for (int i = 0; i < squarePerRow; i++) {
            if (isDark) {
                graphics.setColor(Color.BLACK);
            } else {
                graphics.setColor(Color.WHITE);
            }
            graphics.fillRect(startX, startY, squareSize, squareSize);
            startX += squareSize;
            isDark = !isDark;
        }
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