public class DigitSum {
   public static void main(String[] args) {
   
   sum(29107);
   
   }
   
   public static void sum(int n) {
      int sum = 0;
      while (n > 0) {
         sum = sum + (n % 10); // add last digit to sum
         n = n / 10;           // remove last digit
      }
       System.out.println(sum);
   }
}
      