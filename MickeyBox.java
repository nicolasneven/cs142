// Nicolas Neven
// 10/12/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Section 3 - #2
// 
// This program produces a picture that looks like Mickey Mouse - Mickey Box

import java.awt.*;

public class MickeyBox {
   public static void main(String[] args) {
      DrawingPanel drawPanel = new DrawingPanel(220, 150);
      Graphics pen = drawPanel.getGraphics();
      drawPanel.setBackground(Color.YELLOW);
      mickeyBox(pen);     
   }
   
   public static void mickeyBox(Graphics g) {
      
      g.setColor(Color.BLUE);
      g.fillOval(50, 25, 40, 40);
      g.fillOval(130, 25, 40, 40);
      
      g.setColor(Color.RED);
      g.fillRect(70, 45, 80, 80);
      
      g.setColor(Color.BLACK);
      g.drawLine(70, 85, 150, 85);
      
   }  
}