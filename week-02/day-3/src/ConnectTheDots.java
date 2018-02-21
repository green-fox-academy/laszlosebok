import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] connectThese = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        connectDots(graphics, box);
        connectDots(graphics, connectThese);
    }
    public static void connectDots(Graphics graphics, int[][] dots) {
        graphics.setColor(Color.GREEN);
        int[] firstArray = dots[0];
        int[] previousArray = dots[0];
        for (int i = 1; i < dots.length; i++) {
                graphics.drawLine(previousArray[0], previousArray[1], dots[i][0], dots[i][1]);
//                if (i == (dots.length - 1)){
//                    graphics.drawLine(dots[i][0], dots[i][1], firstArray[0], firstArray[1]);
//                }
                previousArray = dots[i];
        }
        graphics.drawLine(previousArray[0], previousArray[1], firstArray[0], firstArray[1]);
    }


    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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


// create a 300x300 canvas.