import java.util.*;
public class Valentines {
   public static void main(String[] args) {
   
      Random r = new Random();
      findValentines(r, 6);
      System.out.println();
      findValentines(r, 4);
   }
   
   public static void findValentines(Random r, int tries) {
   
      int chances = 0;
      int yes = 0;
      int no = 0;
      
      System.out.println("Will you be my valentine?");
      
      while (chances <= tries) {
      
         int yesNo = r.nextInt(5);
      
         if (yesNo == 0) {
            System.out.print("Yes, ");
            yes++;
         } else {
            System.out.print("No, ");
            no++;
         }
         chances++;
      }
      
      System.out.println();   
      System.out.println(yes + " yeses, " + (double)yes/no*100 + "%");
   }
}