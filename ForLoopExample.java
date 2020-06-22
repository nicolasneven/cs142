public class ForLoopExample {
   public static void main(String[] args) {
   
   drawTopHalf();
   drawBottomHalf();
   
   }
   
   public static final int SIZE = 5;
   
   public static void drawTopHalf() {
   
      for (int i = 1; i <= SIZE; i++) {
   
         for (int spaces = 1; spaces <= SIZE - i; spaces++) {
            System.out.print(" ");        
         }
         
         System.out.print("/");
      
         for (int period = 1; period <= 2 * (i - 1); period++) {
            System.out.print(".");
         }
         
         System.out.println("\\");
         
      }
   }
   
   public static void drawBottomHalf() {
   
      for (int i = 1; i <= SIZE; i++) {
      
         for(int spaces = 1; spaces <= i - 1; spaces++) {
            System.out.print(" ");
         }
      
            System.out.print("\\");
            
         for (int period = 1; period <= 6 - (2 * i); period++) {
            System.out.print("."); 
         }
            
         System.out.println("/");
            
      }     
   }
}