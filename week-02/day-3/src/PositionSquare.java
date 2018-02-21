import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            int startX = (int)(Math.random() * WIDTH);
            int startY = (int)(Math.random() * HEIGHT);
            squareDrawer(graphics, startX, startY);
        }
    }
    public static void squareDrawer(Graphics graphics, int startX, int startY) {
        graphics.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
        graphics.drawRect(startX, startY, 50, 50);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}