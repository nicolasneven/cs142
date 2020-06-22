public class MakeChange {
   public static void main(String[] args) {
   
      canMakeChange(3, 4, 12);
      canMakeChange(1, 5, 26);
      canMakeChange(24, 2, 31);
      canMakeChange(87, 19, 134);
      canMakeChange(0, 0, 0);
      
      canMakeChange(1, 1, 9);
      canMakeChange(2, 7, 8);
      canMakeChange(4, 3, 39);
      canMakeChange(3, 80, 14);
   }
   
   public static void canMakeChange(int p, int n, int c) {
   
      int oneCent = c % 5;
      if (oneCent <= p && p  + (5 * n) >= c) {
         System.out.println("True");
      } else {
         System.out.println("False");
      }
   }
}   