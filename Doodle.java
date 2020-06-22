// Nicolas Neven
// 10/17/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Assignment #3A
//
// This program draws a doodle that uses more than 2 colors and 3 different shapes/fonts

import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(500, 500);
      Graphics g = panel.getGraphics();
      panel.setBackground(Color.RED);
      
      g.setColor(Color.WHITE);
      g.fillRect(100, 0, 300, 500);
      g.setColor(Color.BLACK);
      g.fillOval(200, 200, 100, 100);
      g.setColor(Color.RED);
      g.setFont(new Font("Arial", Font.BOLD, 12));
      g.drawString("Nicolas Neven Doodle.java Project", 150, 100);
   }
}