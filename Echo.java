import java.io.*;
import java.util.*;

public class Echo {
   public static void main(String[] args) throws FileNotFoundException {
   
      Scanner input = new Scanner(new File("numbers.txt"));
      double sum = 0.0;
      
      for (int i = 1; i <= 5; i++) {
         double next = input.nextDouble();
         System.out.println("number = " + next);
         sum += next;
      }
      System.out.printf("Sum = %.1f\n", sum);
   }
}