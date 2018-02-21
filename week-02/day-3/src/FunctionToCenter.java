import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int startX = (int)(Math.random() * WIDTH);
        int startY = (int)(Math.random() * HEIGHT);
        lineDrawer(graphics, startX, startY);
        fillWithLines(graphics);
    }
    public static void lineDrawer(Graphics graphics, int startX, int startY) {
        graphics.drawLine(startX, startY, WIDTH / 2, HEIGHT / 2);
    }
    public static void fillWithLines(Graphics graphics){
        drawLeftLines(graphics);
        drawBottomLines(graphics);
        drawRightLines(graphics);
        drawTopLines(graphics);
    }
    public static void drawLeftLines(Graphics graphics){
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < HEIGHT / 20; i++) {
            graphics.drawLine(startX, startY, WIDTH/2, HEIGHT/2);
            startY += 20;
        }
    }
    public static void drawBottomLines(Graphics graphics) {
        int startX = 0;
        int startY = HEIGHT;
        for (int i = 0; i < WIDTH / 20; i++) {
            graphics.drawLine(startX, startY, WIDTH/2, HEIGHT/2);
            startX += 20;
        }
    }
    public static void drawRightLines(Graphics graphics){
        int startX = WIDTH;
        int startY = HEIGHT;
        for (int i = 0; i < HEIGHT / 20; i++) {
            graphics.drawLine(startX, startY, WIDTH/2, HEIGHT/2);
            startY -= 20;
        }
    }
    public static void drawTopLines(Graphics graphics) {
        int startX = WIDTH;
        int startY = 0;
        for (int i = 0; i < WIDTH / 20; i++) {
            graphics.drawLine(startX, startY, WIDTH/2, HEIGHT/2);
            startX -= 20;
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