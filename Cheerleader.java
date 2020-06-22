public class Cheerleader {
   public static void main(String[] args) {
   
      cheerleader(2, 1);
      cheerleader(4, 3);
      cheerleader(2, 4);
   }
   
   public static void cheerleader(int a, int b) {
   
      for (int i = 1; i <= a; i++) {
         
         for (int spaces = 1; spaces <= i * 3 - 3; spaces++) {
            System.out.print(" ");
         }
         System.out.print("Go");
         for (int j = 1; j < b; j++) {
            System.out.print(" Team Go");
         }
         System.out.println();
      }
   }
}