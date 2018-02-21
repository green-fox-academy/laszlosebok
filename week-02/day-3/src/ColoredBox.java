import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.GREEN);
        graphics.drawLine(50, 50, 550, 50);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(50, 50, 50, 300);
        graphics.setColor(Color.YELLOW);
        graphics.drawLine(50, 300, 550, 300);
        graphics.setColor(Color.RED);
        graphics.drawLine(550, 50, 550, 300);



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