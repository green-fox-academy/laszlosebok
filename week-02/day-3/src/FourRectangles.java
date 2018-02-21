import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i < 4 ; i++) {
            rectangleDrawer(graphics);
        }
    }
    public static void rectangleDrawer(Graphics graphics) {
        graphics.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
        int startX = (int)(Math.random() * WIDTH);
        int startY = (int)(Math.random() * HEIGHT);
        int width = (int)(Math.random() * (WIDTH - startX - 10)+ 10);
        int height = (int)(Math.random() * (HEIGHT - startY - 10) + 10);
        graphics.drawRect(startX, startY, width, height);
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