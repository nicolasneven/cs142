// Nicolas Neven
// 10/17/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Assignment #3B
//
// This program takes in a set of paramaters and draws circles and grids of circles based on the inputs given

import java.awt.*;   // So that I can use Graphics

public class Circles {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(500, 350);
      Graphics g = panel.getGraphics();
      panel.setBackground(Color.CYAN);  
      
      drawOvals(g, 0, 0, 10, 10);
      drawOvals(g, 130, 25, 10, 10);
      drawOvals(g, 260, 0, 10, 6);
      drawOvals(g, 360, 50, 20, 4);
      drawGrid(g, 10, 170, 12, 4, 3);
      drawGrid(g, 180, 200, 12, 2, 5);
      drawGrid(g, 330, 170, 8, 9, 2);
   }
   
   // Takes in paramaters and draws multiple circles
   public static void drawOvals(Graphics g, int x, int y, int space, int rings) {
   
      for(int i = 0; i < rings; i++) {
      
         g.setColor(Color.YELLOW);
         g.fillOval(x + (space/2 * i), y + (space/2 * i), (rings-i) * space, (rings-i) * space);
         g.setColor(Color.BLACK);
         g.drawOval(x + (space/2 * i), y + (space/2 * i), (rings-i) * space, (rings-i) * space);
      }
   }
   
   // Takes in paramaters and draws grids of circles and lines
   public static void drawGrid(Graphics g, int x, int y, int space, int rings, int size) {
      
      g.setColor(Color.GREEN);
      g.fillRect(x, y, size * rings * space, size * rings * space);
   
      for(int i = 0; i < size; i++) {
      
         for(int j = 0; j < size; j++) {
         
            drawOvals(g, x + (rings * space * i), y + (rings * space * j), space, rings);
         }
      }
      
      g.setColor(Color.BLACK);
      g.drawRect(x, y, size * rings * space, size * rings * space);
      g.drawLine(x, y, x + (size * rings * space), y + (size * rings * space));
      g.drawLine(x, y + (rings * space * size), x + (rings * space * size), y);
   }
}