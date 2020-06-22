import java.awt.*;

public class DrawSomething {
   public static void main(String[] args) {
      DrawingPanel drawPanel = new DrawingPanel(500, 500); // width, height
      Graphics pen = drawPanel.getGraphics();
      
      drawPanel.setBackground(Color.LIGHT_GRAY);
      
      drawCar(pen, 10, 30, 1);
      drawCar(pen, 100, 300, 2);
            
      //for (int i = 1; i <= 3; i++) {
      
         //drawCar(pen, (i * 100), (i * 100), 100, 50);
      //}     
   }
   
   public static void drawCar(Graphics g, int x, int y, int size) {
      
      // car body
      g.setColor(Color.BLACK);
      g.fillRect(x, y, 100, 50);
      
      // wheels
      g.setColor(Color.RED);
      g.fillOval(x + 10, y + 40, 20, 20);
      g.fillOval(x + 70, y + 40, 20, 20);
      
      // window
      g.setColor(Color.CYAN);
      g.fillRect(x + 70, y + 10, 30, 20);
      
   }  
}