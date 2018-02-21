import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 640, 686);
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int starSize;
        Color starColor;
        int greyRgb;
        for (int i = 0; i < 400; i++) {
            greyRgb = (int)(100 + Math.random() * 155);
            starColor = new Color(greyRgb, greyRgb, greyRgb);
            starSize = (int)(Math.random() * 5 + 2);
            graphics.setColor(starColor);
            graphics.fillRect((int)(Math.random() * 640), (int)(Math.random() * 686),starSize ,starSize);
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