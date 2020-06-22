// Nicolas Neven
// 10/2/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Assignment #2B
// 
// This program produces Ascii Art of the Seattle Space Needle which is adjustable by size input

public class SpaceNeedle {

   // Sets the size of the Space Needle
   public static final int SIZE = 3;

   public static void main(String[] args) {
      needle();
      needleBaseTop();
      needleBaseBottom();
      tower();
      needleBaseTop();
   }
   
   // This method produces the top lines of the Space Needle - ||
   public static void needle() {
      for (int i = 1; i <= SIZE; i++) { 
         for (int spaces = 1; spaces <= SIZE * 3; spaces++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   // This method produces the the top half of the Needle Base - : and ""
   public static void needleBaseTop() {
      for (int i = 1; i <= SIZE; i++) {
         for (int spaces = 1; spaces <= (SIZE * 3) - (3 * i); spaces++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int colon = 1; colon <= (3 * i) - 3; colon++) {
            System.out.print(":");
         }
         System.out.print("||");
         for (int colon = 1; colon <= (3 * i) - 3; colon++) {
            System.out.print(":");
         }
         System.out.println("\\__");      
      }
      System.out.print("|"); 
      for (int quote = 1; quote <= SIZE * 6; quote++) {
            System.out.print("\"");
         }
      System.out.println("|");
   }
   
   // This method produces the bottom half of the Needle Base - /\
   public static void needleBaseBottom() {
      for (int i = 1; i <= SIZE; i++) {
         for (int spaces = 1; spaces <= (2 * i) - 2; spaces++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int slashes = 1; slashes <= ((SIZE * 3) + 1) - (i * 2); slashes++) {
            System.out.print("/\\");  
         }
         System.out.println("_/");     
      }
   }
   
   // This method produces the Needle Tower lines - || and %
   public static void tower() {
      needle();
      for (int i = 1; i <= SIZE * SIZE; i++) {
         for (int spaces = 1; spaces <= (SIZE * 2) + 1; spaces++) {
            System.out.print(" ");
         }
         System.out.print("|");  
         for (int percentage = 1; percentage <= SIZE - 2; percentage++) {
            System.out.print("%");
         }  
         System.out.print("||");
         for (int percentage = 1; percentage <= SIZE - 2; percentage++) {
            System.out.print("%");
         }
         System.out.println("|");
      }
   }       
}