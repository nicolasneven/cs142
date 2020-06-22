import java.util.*;
public class GuessEvens {
   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      evens(console, 4);
      evens(console, 3);
   }
   
   public static void evens(Scanner console, int even) {
   
      int correct = 0;
      int tries = 0;
      
      while (correct < even) {
         
         System.out.print("Number? ");
         int num = console.nextInt();
         
         if (num % 2 == 0) {
            correct++;
            tries++;
         } else {
            correct = 0;
            tries++;
         }
      }
      
      System.out.println(even + " evens in a row after " + tries + " tries");
   }
}