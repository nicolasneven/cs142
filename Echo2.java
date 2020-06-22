import java.io.*;
import java.util.*;
import java.net.*;

public class Echo2 {
   public static void main(String[] args) throws FileNotFoundException {
      
      String url = "https://cs.washington.edu/142";
      Scanner input = new Scanner(new URL(url).openStream());
      
      while (input.hasNext()) {
         System.out.println(input.next());
      }
   }
}