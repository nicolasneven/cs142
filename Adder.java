import java.util.*;
public class Adder {
   public static void main(String[] args) {
   
      int oldSum = 0;
      int newSum = 1;
      int tries = 0;
      
      while (oldSum != newSum) {
         oldSum = newSum;
         Scanner console = new Scanner(System.in);
         System.out.print("Enter two numbers: ");
         int one = console.nextInt();
         int two = console.nextInt();
         newSum = one + two;
         System.out.println("The sum is: " + newSum);
         tries++;  
      }
      System.out.println("We computed " + tries + " sums.");
   }
}