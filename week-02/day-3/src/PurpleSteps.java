import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        int startX = 20;
        int startY = 20;

        for (int i = 0; i < 19; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(startX, startY, 20, 20);
            graphics.drawRect(startX+1, startY+1, 20-2, 20-2);
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(startX+2,startY+2, 20-3, 20-3);
            startX += 20;
            startY += 20;
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