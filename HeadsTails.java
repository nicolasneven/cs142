import java.util.*;
public class HeadsTails {
   public static void main(String[] args) {
   
      Random r = new Random();
      flip(r, 4);
      flip(r, 2);
   }
   
   public static void flip(Random r, int headTotal) {
      
      int tries = 0;
      int headCount = 0;
      
      System.out.print("FLIP: ");
      
      while (headCount < headTotal) {
         
         int hT = r.nextInt(2);
         
         if (hT == 0) {
            System.out.print("H ");
            tries++;
            headCount++;
         } else if (hT == 1) {
            System.out.print("T ");
            tries++;
            headCount = 0;
         }
      }
      
      System.out.println(headCount + " heads in a row after " + tries + " tries");
   }
}