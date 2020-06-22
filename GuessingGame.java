// Nicolas Neven
// 10/31/17
// CSE 142 BN
// TA: Alex Edward Smintina
// Assignment #5
//
// Allows the user to play a game in which the program thinks of a random integer and accepts
// guesses from the user until the user guesses the number correctly. 

import java.util.*;
public class GuessingGame {

   public static final int MAX = 2;

   public static void main(String[] args) {
   
      intro();
      
      // Plays the first game with the user
      Scanner console = new Scanner(System.in);
      int totalTries = guess(console);
      int bestGame = totalTries;
      int game = 1;
      
      // Prompts the user if they want to play again and keeps playing until they want to stop
      System.out.print("Do you want to play again? ");
      while (console.next().substring(0,1).equalsIgnoreCase("Y")) {
         int tries = guess(console);
         totalTries += tries;
         game++;
         bestGame = Math.min(bestGame, tries);
         System.out.print("Do you want to play again? ");
      }
      
      statistics(game, totalTries, bestGame);
   }
   
   // Prints the haiku introduction poem at the beginning of the game
   public static void intro() {
   
      System.out.println("This is my Haiku");
      System.out.println("Take a guess, I hope its right");
      System.out.println("Please enjoy my game"); 
      System.out.println(); 
   }
   
   // Plays the Guessing Game one time and returns how many tries the player used
   public static int guess(Scanner console) {
      
      // Produces the random number that the player has to guess
      Random random = new Random();
      int num = random.nextInt(MAX) + 1;
      System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
      int guess = 0;
      int tries = 0;
      
      // Prompts the user to enter a guess and give hints until they guess correct
      while (guess != num) {
            
         System.out.print("Your guess? ");
         guess = console.nextInt();
         tries++;
            
         if (guess > num) {
            System.out.println("It's lower.");
         } else if (guess < num) {
            System.out.println("It's higher.");
         } else if (guess == num && tries == 1) {
            System.out.println("You got it right in 1 guess!");
         } else if (guess == num) {
            System.out.println("You got it right in " + tries + " guesses!");
         }
      }
      
      return tries;
   }
   
   // Prints the statistics at the end of the game by taking in paramaters 
   // game, totalTries, and bestGame
   public static void statistics(int game, int totalTries, int bestGame) {
    
      System.out.println();
      System.out.println("Overall results:");
      System.out.println("Total games   = " + game);
      System.out.println("Total guesses = " + totalTries);
      System.out.printf("Guesses/game  = %.1f ", (double)totalTries/game);
      System.out.println();
      System.out.println("Best game     = " + bestGame);  
   } 
}