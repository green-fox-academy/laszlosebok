import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        for (int i = 0; i < 3; i++) {
            int squareSize = (int)((Math.random() * 639) + 1);
            squareDrawer(graphics, squareSize);
        }
    }
    public static void squareDrawer(Graphics graphics, int squareSize) {
        graphics.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255)));
        graphics.drawRect((WIDTH / 2) - (squareSize / 2), (WIDTH / 2) - (squareSize / 2), squareSize, squareSize);
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