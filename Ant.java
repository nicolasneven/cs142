import java.util.*;
public class Ant {
   public static void main(String[] args) {
   
      Random random = new Random();
      int height = 0;
      int falls = 0;
      
      while (height < 6) {
         
         int climb = random.nextInt(2);
         
         if (climb == 1) {
            height++;
         }
         
         if (climb == 0) {
            height = 0;
            falls++;
         }
      }
      System.out.println("number of falls: " + falls);
   } 
}