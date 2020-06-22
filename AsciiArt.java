// Nicolas Neven
// 10/2/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Assignment #2A
// 
// This program produces ASCII Art of the flag of The United States of America

public class AsciiArt {
   public static void main(String[] args) {
      printStars();
      printFlag();
   }
   
   // This method produces the lines that prints * (and - or O)
   public static void printStars() {
      for(int i = 1; i <=3; i++) {
         System.out.print("|"); 
         for(int star = 1; star <= 10; star++) {
            System.out.print("* ");
         }     
         for(int o = 1; o <= 25; o++) {
            System.out.print("O");
         }      
         System.out.println("|");
         System.out.print("|");   
         for(int star = 1; star <= 9; star++) {
            System.out.print(" *");
         }   
         System.out.print("  ");  
         for(int dash = 1; dash <= 25; dash++) {
            System.out.print("-");
         }      
         System.out.println("|");
      }
   }
   
   // This method produces the rest of the flag lines using - or O (not *)
   public static void printFlag() {
      for(int i = 1; i <= 3; i++) {
         System.out.print("|");
         for(int o = 1; o <= 45; o++) {
            System.out.print("O");
         }
         System.out.println("|");
         System.out.print("|");
         for(int dash = 1; dash <= 45; dash++) {
            System.out.print("-");
         }   
         System.out.println("|");
      }  
   }
}