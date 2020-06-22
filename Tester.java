import java.util.*;
public class Tester {
   public static void main(String[] args) {
      
      test();                  
   }
   
   public static void test() {
   
      Random r = new Random();
      int count = 0;
      int areaOld = 101;
      while (count < 4) {
         
         int w = r.nextInt(10) + 1;
         int h = r.nextInt(10) + 1;
         int areaNew = w*h;
         System.out.println("w: " + w + ", h: " + h + ", area: " + areaNew);
         if (areaOld < areaNew) {
            count++;
         } else if (areaOld >= areaNew) {
            count = 0;
         }
         areaOld = areaNew;
      }   
   }
}        