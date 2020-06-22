import java.awt.*;
import java.util.*;
public class Ball {
   public static final int SIZE = 10;
   public static final int HALF = SIZE / 2;
   

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("PLEASE ENTER THE DISPLACEMENT: ");
      double displacement = console.nextDouble();
      System.out.print("PLEASE ENTER THE ANGLE: ");
      double angle = console.nextDouble();
   
      DrawingPanel dp = new DrawingPanel(800, 800);
      dp.setBackground(Color.CYAN);
      Graphics g = dp.getGraphics();
    
      double radians = Math.toRadians(angle); 
      
      double xDisplacement = displacement * Math.cos(radians);  // px
      double yDisplacement = -displacement * Math.sin(radians); // px
      
      double x = 400.0;
      double y = 400.0;
      
      g.fillOval((int) x - HALF, (int) y - HALF, SIZE, SIZE);
      
      for(int i = 1; i <= 1000; i++) {
      
         // pause the program
         dp.sleep(100);
         
         // change in x location
         // change in y location
         x = x + xDisplacement;
         y = y + yDisplacement;
         
         if (x - HALF <= 0 || x + HALF >= 800) {
            xDisplacement = xDisplacement * -1;
         }
         
         if (y - HALF <= 0 || y + HALF >= 800) {
            yDisplacement = yDisplacement * -1;
         }
         
         // draw the ball again
         g.fillOval((int) x - HALF, (int) y - HALF, SIZE, SIZE);
      }
   }
}