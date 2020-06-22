public class PrintPrimes {
   public static void main(String[] args) {
   
   printPrimes(100);
   
   }
   
   public static void printPrimes(int max) {
   
      if (max >= 2) {
         System.out.print(2);
         for (int i = 3; i <= max; i++) {
            if (countFactors(i) == 2) {
               System.out.print(", " + i);
            }
         }
      }
           
      System.out.println();
   }
   
   public static int countFactors(int num) {
   
      int count = 0;
      for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
            count++;
         }
      }
      
      return count;  
   }
}